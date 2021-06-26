package dao;
import datos.Lectura;
import datos.MedidorBaja;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
public class LecturaDao {
	private static LecturaDao instancia;
	private static Session session;
	private Transaction tx;

	protected LecturaDao() {}
	
	public static LecturaDao getInstance() {
		if (instancia == null)
			instancia = new LecturaDao();
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
	public List<Lectura> traerLectura() throws HibernateException {
		List<Lectura> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Lectura l inner join fetch l.medidor i inner join fetch i.cliente c").list();
		} finally {
			session.close();
		}
		return lista;
	}
		public List<Lectura> traerLectura(MedidorBaja ma) throws HibernateException {
			List<Lectura> lista = null;
			try {
				iniciaOperacion();
				String hql ="from Lectura l inner join fetch l.medidor i inner join fetch i.cliente c where i.idMedidorBaja ="+ ma.getIdMedidorBaja();
				lista = session.createQuery(hql).list();
			} finally {
				session.close();
			}
			return lista;
	}
		public Lectura traerLectura(MedidorBaja ma,int mes ,int anio) {
			List<Lectura> lista = traerLectura(ma);
			Lectura l = null;
			int i = 0;
			while(l == null && i< lista.size()) {
				if(lista.get(i).getFecha().getMonthValue() == mes && lista.get(i).getFecha().getYear() == anio) {
					l = lista.get(i);
				}
				i++;
			}
			return l;
		}
		
		
}
