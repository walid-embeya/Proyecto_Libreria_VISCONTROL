package es.mdef.ViscontrolLib;

import java.util.Date;
import java.util.List;

public class Visita {
	
	private String id;
    private Date fechaInicio;
    private Date fechaFin;
    private String actuaciones;
    private Actividad actividad;
    private Anfitrion anfitrion; 
    private List<Invitado> invitados;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public String getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(String actuaciones) {
		this.actuaciones = actuaciones;
	}
	
	public Actividad getActividad() {
		return actividad;
	}
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	
	public Anfitrion getAnfitrion() {
		return anfitrion;
	}
	public void setAnfitrion(Anfitrion anfitrion) {
		this.anfitrion = anfitrion;
	}
	
	public List<Invitado> getInvitados() {
		return invitados;
	}
	public void setInvitados(List<Invitado> invitados) {
		this.invitados = invitados;
	}
	
	@Override
	public String toString() {
		return "Visita [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", actuaciones=" + actuaciones
				+ ", actividad=" + actividad + ", anfitrion=" + anfitrion + "]";
	}
    
}
