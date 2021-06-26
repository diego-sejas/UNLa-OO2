package dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Persona;

public class PersonaDao {
	private static Session session;
	private Transaction tx;
	private static PersonaDao instancia;

	public static PersonaDao getInstancia() {
		if (instancia == null) {
			instancia = new PersonaDao();
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

	// -----------------------------------------1) + traerPersona(long documento): Persona
	
	public Persona traerPersona(Long documento) {
	Persona objeto = null;
	try {
		iniciaOperacion();
		objeto = (Persona) session.createQuery("from Persona p where p.documento =" + documento).uniqueResult();
	} finally {
		session.close();
	}
	return objeto;
	}
}
