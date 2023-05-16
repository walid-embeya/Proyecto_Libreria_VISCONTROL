package es.mdef.ViscontrolLib;

import java.util.List;

public class Invitado  extends Persona {
	
	private String matricula;
	private String empresa;
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public Autorizacion getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(Autorizacion autorizacion) {
		this.autorizacion = autorizacion;
	}
	
	public Invitado(String dni, String nombre, String apellidos, String telefono, String email, String matricula,
			String empresa) {
		super(dni, nombre, apellidos, telefono, email);
		this.matricula = matricula;
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Invitado [matricula=" + matricula + ", empresa=" + empresa + "]";
	}
	
}