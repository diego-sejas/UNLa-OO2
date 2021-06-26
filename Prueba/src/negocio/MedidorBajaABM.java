package negocio;
import java.util.List;

import dao.MedidorBajaDao;
import datos.MedidorBaja;
public class MedidorBajaABM {
	private static MedidorBajaABM instancia;
	private MedidorBajaDao dao = MedidorBajaDao.getInstance();
	protected MedidorBajaABM() {}
	
	public static MedidorBajaABM getInstance() {
		if (instancia == null)
			instancia = new MedidorBajaABM();
		return instancia;
	}
	public List<MedidorBaja> traerMedidoresBaja(){
		return dao.traer();
	}
	public MedidorBaja traerMedidorBaja(String nroSerie) throws Exception{
		return dao.traer(nroSerie);
	}
}
