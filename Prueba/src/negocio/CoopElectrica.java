package negocio;
import datos.Factura;
import datos.ItemFactura;
public class CoopElectrica {
	private static CoopElectrica instancia;
	protected CoopElectrica() {}
	
	public static CoopElectrica getInstance() {
		if (instancia == null)
			instancia = new CoopElectrica();
		return instancia;
	}
	public boolean agregarItemFactura(int cantidad,double precio) {
		Factura f = new Factura();
		ItemFactura item = new ItemFactura(cantidad,precio);
		f.getItems().add(item);
		return true;
	}
	
	
}
