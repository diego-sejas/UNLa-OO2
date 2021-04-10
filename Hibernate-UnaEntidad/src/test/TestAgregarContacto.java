package test;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarContacto {

	public static void main(String[] args) {
		
		ClienteABM abmCliente = new ClienteABM();
		long idCliente = 22 ;
		
		Cliente cliente = abmCliente.traer(idCliente);
		System.out.println(cliente);
		
		ContactoABM abmContacto = new ContactoABM();
		abmContacto.agregar("TercerCliente@unla.edu.ar", "011-88888888", "011-3333-3333", cliente);

	}

}
