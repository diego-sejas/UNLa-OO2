package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Vacuna;

public class VacunaDao {
    private static Session session;
	private Transaction tx;	
	private static VacunaDao instancia;
	

    public static VacunaDao getInstancia() {
        if (instancia == null) {
            instancia = new VacunaDao();
        }
        return instancia;
    }

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

    protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
    
    //--------------------------------3) + traerVacuna(int mesesDesde, int mesesHasta): List<Vacuna>

    @SuppressWarnings("unchecked")
	public List<Vacuna> traerVacuna(int mesDesde, int mesHasta) {
		List<Vacuna> vacunas = null;
		List<Vacuna> listado = new ArrayList<Vacuna>();
		LocalDate hoy = LocalDate.now();
		try {
			iniciaOperacion();
			vacunas = session.createQuery("from Vacuna v order by v.idVacuna asc").list();
			for (Vacuna vacuna : vacunas) {
				int mes = vacuna.calcularMesesDesdeElaboracion(hoy);
				if (mes > mesDesde && mes < mesHasta) {
					listado.add(vacuna);
				}			
			}
		} finally {
			session.close();
		}
		return listado;
	}

    
    
}
