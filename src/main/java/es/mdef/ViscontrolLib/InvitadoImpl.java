package es.mdef.ViscontrolLib;

import java.util.List;

public class InvitadoImpl extends PersonaImpl implements Invitado {
	
	private String matricula;
	private String empresa;
	private String autorizacion;
	private List<Visita> visitas;
		
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

	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	public List<Visita> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}

	@Override
	public String toString() {
		return "Invitado [matricula=" + matricula + ", empresa=" + empresa + "]";
	}
	
}
