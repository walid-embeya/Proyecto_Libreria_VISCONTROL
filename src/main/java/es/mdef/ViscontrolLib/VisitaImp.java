package es.mdef.ViscontrolLib;

import java.util.Date;
import java.util.List;

public class VisitaImp implements Visita {
	
    private Date fechaInicio;
    private Date fechaFin;
    private String actuaciones;
    private String actividad;
    private Anfitrion anfitrion; 
    private List<Persona> invitados;
	
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
	
	public String getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(String actuaciones) {
		this.actuaciones = actuaciones;
	}
	
	public String getActividad() {
		return actividad;
	}
	public void setActividad(String actividad) {
		this.actividad = actividad;
	}
	
	public Anfitrion getAnfitrion() {
		return anfitrion;
	}
	public void setAnfitrion(Anfitrion anfitrion) {
		this.anfitrion = anfitrion;
	}
	
	public List<Persona> getInvitados() {
		return invitados;
	}
	public void setInvitados(List<Persona> invitados) {
		this.invitados = invitados;
	}
	
	@Override
	public String toString() {
		return "Visita [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", actuaciones=" + actuaciones
				+ ", actividad=" + actividad + ", anfitrion=" + anfitrion + "]";
	}
    
}
