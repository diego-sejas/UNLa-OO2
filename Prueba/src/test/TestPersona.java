package test;

import negocio.PersonaABM;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaABM p = PersonaABM.getInstance();
		try {
			System.out.println("punto 1");
			System.out.println(p.traerPersonas());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Punto 2");
			System.out.println(p.traerPersona(2));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Punto 3");
			System.out.println(p.traerInspector(3));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
	}

}
