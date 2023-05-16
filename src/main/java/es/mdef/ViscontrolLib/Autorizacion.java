package es.mdef.ViscontrolLib;

import java.util.Date;

public class Autorizacion {
	private String tipo;
    private Date fechaInicio;
    private Date fechaFin;
    
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public Autorizacion(String tipo, Date fechaInicio, Date fechaFin) {
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	@Override
	public String toString() {
		return "Autorizacion [tipo=" + tipo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
	} 

}
