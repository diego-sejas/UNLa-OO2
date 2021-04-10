package test;

import java.time.LocalDate;

import datos.Contacto;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarCliente {

	public static void main(String[] args) throws Exception {
		
		ClienteABM abm = new ClienteABM();
		
		String apellido = "Tercer";
		String nombre = "Cliente";
		int dni = 30123456;
	
		ContactoABM abmContacto = new ContactoABM();
		long idContacto =21;
		Contacto contacto = abmContacto.traer(idContacto);
		
		LocalDate fechaDeNacimiento = LocalDate.of(1990, 12, 23);
		
		try {	
			abm.agregar(apellido, nombre, dni, fechaDeNacimiento,contacto);
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
	}

}
