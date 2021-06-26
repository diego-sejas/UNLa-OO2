package test;

import dao.HibernateUtil;
import datos.Cliente;
import negocio.ClienteABM;

public class TestModificarCliente {

	public static void main(String[] args)throws Exception{
		
				ClienteABM abm = new ClienteABM();
				long id=1;
				
				// traer el obj a modificar
				Cliente c=abm.traer(id);
				System. out .println( "Cliente a Modificar -->" +c);
				
				// modificar por set los atributos
				c.setDni(28456123);
				try {
					abm.modificar(c); //update del objeto
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				} finally {
					HibernateUtil.getSessionFactory().close();
				}
			

	}

}
