package es.mdef.ViscontrolLib;

import java.util.List;

public class Invitado extends Persona implements InvitadoInterfaz {
	
	private String matricula;
	private Empresa empresa;
	private Autorizacion autorizacion;
	private List<Visita> visitas;
	
		
	public List<Visita> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Autorizacion getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(Autorizacion autorizacion) {
		this.autorizacion = autorizacion;
	}
	
	@Override
	public String toString() {
		return "Invitado [matricula=" + matricula + ", empresa=" + empresa + "]";
	}
	
}
