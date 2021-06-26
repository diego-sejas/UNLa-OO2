package test;

import java.time.LocalDate;

import datos.Persona;
import negocio.DosisABM;
import negocio.PersonaABM;
import negocio.VacunaABM;

public class TestParcial {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*PersonaABM persona = PersonaABM.getInstance();
		DosisABM dosis = DosisABM.getInstance();
		VacunaABM vacuna = VacunaABM.getInstance();*/
		
		VacunaABM vacuna = new VacunaABM() ;
        PersonaABM persona = new PersonaABM();
        DosisABM dosis = new DosisABM();
	  
		try {
			Long documento = (long) 11111111;
			System.out.println("\n1) Traer los datos de la persona con documento = 11111111");
			System.out.println("------------------------------");
			System.out.println(persona.traerPersona(documento));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			Long documento = (long) 11111111;
			Persona personaBuscada = persona.traerPersona(documento);
			System.out.println("\n2) Traer los datos de la vacunas fabricadas entre 2 y 3 meses");
		    System.out.println("------------------------------");
		    System.out.println(vacuna.traerVacuna(2, 3));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			Long documento = (long) 11111111;
			Persona personaBuscada = persona.traerPersona(documento);
			System.out.println("\n3) Traer dosis que se hayan aplicado a la persona con documento = 11111111");
		    System.out.println("------------------------------");
		    System.out.println(dosis.traerDosis(personaBuscada));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		try {
			System.out.println("\n4) Traer dosis que se hayan aplicado entre el 2020-05-01 y el 2020-05-10");
		    System.out.println("------------------------------");
		    LocalDate fechaInicio = LocalDate.of(2020, 05, 01);
		    LocalDate fechaFin = LocalDate.of(2020, 05, 10);
		    System.out.println(dosis.traerDosis(fechaInicio, fechaFin));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("\n5) Traer dosis que se hayan aplicado entre el 2020-05-01 y el 2020-05-10 a personas sin comorbilidad");
		    System.out.println("------------------------------");
		    LocalDate mesInicio = LocalDate.of(2020, 05, 01);
		    LocalDate mesFin = LocalDate.of(2020, 06, 10);
		    System.out.println(dosis.traerDosis(mesInicio, mesFin,false));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		    
   
	}



}
