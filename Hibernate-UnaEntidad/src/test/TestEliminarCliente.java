package test;

import java.util.List;

import datos.Cliente;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		
		Cliente clienteBaja = abm.traer(19);
		System.out.println("Cliente a dar de BAJA -->" + clienteBaja);
		
		abm.eliminar(19);
		
		List<Cliente> lstCliente = abm.traer();
		System.out.println("Nueva Lista de Clientes -->" + lstCliente);


	}

}
