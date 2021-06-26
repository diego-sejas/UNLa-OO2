package test;
import negocio.LecturaABM;
import negocio.MedidorBajaABM;
public class TestLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LecturaABM l = LecturaABM.getInstance();
		MedidorBajaABM m = MedidorBajaABM.getInstance();
		try {
			System.out.println("punto 6");
			System.out.println(l.traerLectura());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Punto 7");
			System.out.println(l.traerLectura(m.traerMedidorBaja("438823")));
		}catch(Exception e) {
			e.printStackTrace();
		
	}
		try {
			System.out.println("Punto 8");
			System.out.println(l.traerLectura(m.traerMedidorBaja("438823"), 1, 2019));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
