package test;


import dao.HibernateUtil;
import negocio.ContactoABM;
public class TestEliminarContacto {

	public static void main(String[] args){
	
		ContactoABM c = new ContactoABM();
		try {
		c.eliminar(9);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
		HibernateUtil.getSessionFactory().close();
		}
	}

}
