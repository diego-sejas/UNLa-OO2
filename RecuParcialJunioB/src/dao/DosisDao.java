package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Dosis;
import datos.Persona;

public class DosisDao {
	private static Session session;
	private Transaction tx;
	private static DosisDao instancia;

	public static DosisDao getInstancia() {
		if (instancia == null) {
			instancia = new DosisDao();
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
	
	// ----------------------------------------4) + traerDosis(Persona persona): List<Dosis>
	
	@SuppressWarnings("unchecked")
	public List<Dosis> traerDosis(Persona persona) {
		List<Dosis> objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery("from Dosis d where d.persona =" + persona.getIdPersona()).list();
		} finally {
			session.close();
		}
		return objeto;
	}
		
	// --------------------------5) + traerDosis(LocalDate fechaDesde, LocalDate fechaHasta): List<Dosis>
	
	@SuppressWarnings("unchecked")
	public List<Dosis> traerDosis(LocalDate fechaDesde, LocalDate fechaHasta) {
		List<Dosis> objeto = null;
		try {
			iniciaOperacion();
			objeto = session
					.createQuery("from Dosis d where d.fecha BETWEEN '" + fechaDesde+ "' AND '" + fechaHasta + "'")
					.list();
		} finally {
			session.close();
		}
		return objeto;
	}

	
	//------------------------6) + traerDosis(LocalDate fechaDesde, LocalDate fechaHasta, boolean tieneComorbilidades): List<Dosis>

	@SuppressWarnings("unchecked")
	public List<Dosis> traerDosis(LocalDate fechaDesde, LocalDate fechaHasta, boolean tieneComorbilidades) {
		List<Dosis> objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery("from Dosis d inner join fetch d.persona p where d.fecha BETWEEN '" + fechaDesde
					+ "' AND '" + fechaHasta + "' AND p.tieneComorbilidad = " + tieneComorbilidades).list();
		} finally {
			session.close();
		}
		return objeto;
	}
	

	
	
}
