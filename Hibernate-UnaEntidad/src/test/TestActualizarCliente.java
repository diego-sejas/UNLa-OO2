package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {

	public static void main(String[] args) throws Exception {
		
		ClienteABM abm = new ClienteABM();
		long id = 20;
		
		// traer el obj a modificar
		Cliente clienteAmodificar = abm.traer(id);
		System.out.println("Cliente a Modificar -->" + clienteAmodificar);
		
		// modificar por set los atributos en este caso el apellido
		clienteAmodificar.setApellido("Modificado");
		
		// update del objeto
		abm.modificar(clienteAmodificar); 
		int  dni = 000000001;
		Cliente clienteModificado = abm.traer(dni);
		System.out.println("\nCliente Modificado:\n" + clienteModificado);
		//System.out.println("Cliente Modificado --->" + clienteModificado);

	}

}
