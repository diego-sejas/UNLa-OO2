package test;
import java.util.GregorianCalendar;
import datos.Contacto;


import dao.HibernateUtil;
import negocio.ContactoABM;

public class TestModificarContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long idContacto = 6;
		ContactoABM c = new ContactoABM();
		Contacto contacto = c.traer(idContacto);
		contacto.setEmail("probando modificacion");
		c.modificar(contacto);
		HibernateUtil.getSessionFactory().close();

		
	}

}
