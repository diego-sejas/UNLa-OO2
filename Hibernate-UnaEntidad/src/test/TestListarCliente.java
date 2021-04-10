package test;

import java.util.List;

import datos.Cliente;
import negocio.ClienteABM;

public class TestListarCliente {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		
		List<Cliente> lstCliente = abm.traer();
		System.out.println("\nLista de Clientes:\n" + lstCliente);

	}

}
