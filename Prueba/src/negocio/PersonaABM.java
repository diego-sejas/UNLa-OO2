package negocio;
import datos.Persona;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.PersonaDao;
import datos.Cliente;
import datos.Inspector;
public class PersonaABM {
	private static PersonaABM instancia;
	private PersonaDao dao = PersonaDao.getInstance();
	protected PersonaABM() {}
	
	public static PersonaABM getInstance() {
		if (instancia == null)
			instancia = new PersonaABM();
		return instancia;
	}
	
	public List<Persona> traerPersonas(){
		return dao.traer();
	}
	public Persona traerPersona(int id) {
		return dao.traer(id);
	}
	
	public Cliente traerCliente(int id) throws Exception {
		Persona p = traerPersona(id);
		Cliente c = null;
		if(p instanceof Cliente) {
			c = (Cliente)p;
		}
		
		return c;
	}
	public Inspector traerInspector(int id) throws Exception{
		Persona p = traerPersona(id);
		Inspector i = null;
		if(p instanceof Inspector) {
			i = (Inspector)p;
		}
		return i;
	}
}
