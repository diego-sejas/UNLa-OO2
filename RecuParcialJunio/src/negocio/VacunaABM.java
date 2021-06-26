package negocio;

import java.util.List;

import dao.VacunaDao;
import datos.Vacuna;

public class VacunaABM {
    private static VacunaABM instancia;	
	private VacunaDao dao = VacunaDao.getInstancia();
	
	// ----------------------------------------------------
		
	public static VacunaABM getInstance() {
		if(instancia == null) {
			instancia = new VacunaABM();
		}
		return instancia;
	}

	public List<Vacuna> traerVacuna(int mesDesde, int mesHasta) {
		return dao.traerVacuna(mesDesde, mesHasta);
	}    
    
}
