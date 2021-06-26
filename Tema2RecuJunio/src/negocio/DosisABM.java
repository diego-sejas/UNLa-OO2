package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.DosisDao;
import datos.Dosis;
import datos.Persona;

public class DosisABM {
    private static DosisABM instancia;	
	private DosisDao dao = DosisDao.getInstancia();
	
	// ----------------------------------------------------
		
	public static DosisABM getInstance() {
		if(instancia == null) {
			instancia = new DosisABM();
		}
		return instancia;
	}
	
	
	public List<Dosis> traerDosis(Persona persona) {
		return dao.traerDosis(persona);
	}

	public List<Dosis> traerDosis(LocalDate fechaDesde, LocalDate fechaHasta) {
		return dao.traerDosis(fechaDesde, fechaHasta);
	}

	public List<Dosis> traerDosis(LocalDate fechaDesde, LocalDate fechaHasta, boolean tieneComorbilidades) {
		return dao.traerDosis(fechaDesde, fechaHasta, tieneComorbilidades);
	}
    

    
}
