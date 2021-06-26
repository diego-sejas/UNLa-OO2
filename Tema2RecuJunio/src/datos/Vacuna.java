package datos;

import java.time.LocalDate;

import funciones.Funciones;

public class Vacuna {
	
	private int idVacuna;
	private int codigo;
	private String laboratorio;
	private LocalDate fechaElaboracion;
	
	public Vacuna() {
		
	}

	public Vacuna(int idVacuna, int codigo, String laboratorio, LocalDate fechaElaboracion) {
		this.idVacuna = idVacuna;
		this.codigo = codigo;
		this.laboratorio = laboratorio;
		this.fechaElaboracion = fechaElaboracion;
	}

	public int getIdVacuna() {
		return idVacuna;
	}

	public void setIdVacuna(int idVacuna) {
		this.idVacuna = idVacuna;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public LocalDate getFechaElaboracion() {
		return fechaElaboracion;
	}

	public void setFechaElaboracion(LocalDate fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}

	  public int calcularMesesDesdeElaboracion(LocalDate hoy){
	        return Funciones.calcularMeses(this.fechaElaboracion, hoy);
	    }
	
	@Override
	public String toString() {
		return "\nVacuna [idVacuna: " + idVacuna + ", codigo: " + codigo + ", laboratorio: " + laboratorio
				+ ", fechaElaboracion: " + fechaElaboracion + "]";
	}

	

	
	

}
