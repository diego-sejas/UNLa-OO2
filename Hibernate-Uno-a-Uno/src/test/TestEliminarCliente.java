package test;

import dao.HibernateUtil;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM a = new ClienteABM();
		
		try {
		a.eliminar(5);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	}

}
