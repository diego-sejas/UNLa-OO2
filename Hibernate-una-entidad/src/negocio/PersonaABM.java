package negocio;

import dao.PersonaDao;
import datos.Persona;

public class PersonaABM {
	
	private static PersonaABM instancia; 
	private PersonaDao dao = PersonaDao.getInstancia(); 

	// ----------------------------------------------------
	public static PersonaABM getInstance() {
		if (instancia == null)
			instancia = new PersonaABM();
		return instancia;
	}

	// --------------------------------------------------- 1) +  traerPersona(Log documento) : Persona
		  public Persona traerPersona(Long documento) { 
			  return dao.traerPersona(documento); }
}