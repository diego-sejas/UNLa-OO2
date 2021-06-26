package negocio;

import java.util.List;

import dao.LecturaDao;
import datos.MedidorBaja;
import datos.Lectura;
public class LecturaABM {
	private static LecturaABM instancia;
	private LecturaDao dao = LecturaDao.getInstance();
	protected LecturaABM() {}
	
	public static LecturaABM getInstance() {
		if (instancia == null)
			instancia = new LecturaABM();
		return instancia;
	}
	public List<Lectura> traerLectura(){
		return dao.traerLectura();
	}
	public List<Lectura> traerLectura(MedidorBaja medidorbaja){
		return dao.traerLectura(medidorbaja);
	}
	public Lectura traerLectura(MedidorBaja medidorbaja,int mes,int anio) {
		return dao.traerLectura(medidorbaja, mes, anio);
	}
	
}
