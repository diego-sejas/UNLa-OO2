package dao;
import datos.MedidorBaja;
import datos.Persona;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class MedidorBajaDao {
	private static MedidorBajaDao instancia;
	private static Session session;
	private Transaction tx;

	protected MedidorBajaDao() {}
	
	public static MedidorBajaDao getInstance() {
		if (instancia == null)
			instancia = new MedidorBajaDao();
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

	public MedidorBaja traer(String nroSerie) {
		MedidorBaja objeto = null;
		try {
			iniciaOperacion();
			objeto = (MedidorBaja) session.createQuery("from MedidorBaja m  where m.nroSerie ='" + nroSerie+"'").uniqueResult();
			Hibernate.initialize(objeto.getCliente());
		} finally {
			session.close();
		}
		return objeto;
	}

	@SuppressWarnings("unchecked")
	public List<MedidorBaja> traer() throws HibernateException {
		List<MedidorBaja> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from MedidorBaja m inner join fetch m.cliente ").list();
		} finally {
			session.close();
		}
		return lista;
	}

}
