package datos;

import java.time.LocalDate;

public class Persona {
	private int idPersona;
	private Long documento;
	private LocalDate fechaNacimiento;
	private boolean tieneComorbilidad;
	
	public Persona() {
		
	}

	public Persona(int idPersona, Long documento, LocalDate fechaNacimiento, boolean tieneComorbilidad) {
		this.idPersona = idPersona;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.tieneComorbilidad = tieneComorbilidad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isTieneComorbilidad() {
		return tieneComorbilidad;
	}

	public void setTieneComorbilidad(boolean tieneComorbilidad) {
		this.tieneComorbilidad = tieneComorbilidad;
	}

	@Override
	public String toString() {
		return "\nPersona [idPersona: " + idPersona + ", documento: " + documento + ", fechaNacimiento: " + fechaNacimiento
				+ ", tieneComorbilidad: " + tieneComorbilidad + "]";
	}
	
	
	
	

}
