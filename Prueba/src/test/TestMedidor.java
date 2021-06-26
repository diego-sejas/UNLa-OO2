package test;
import negocio.MedidorBajaABM;
public class TestMedidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedidorBajaABM m = MedidorBajaABM.getInstance();
	try {
		System.out.println("Punto 4");
		System.out.println(m.traerMedidoresBaja());
	}catch(Exception e) {
		e.printStackTrace();
	}
	try {
		System.out.println("Punto 5");
		System.out.println(m.traerMedidorBaja("438823"));
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}

}
