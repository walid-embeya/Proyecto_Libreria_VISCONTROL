package es.mdef.ViscontrolLib;

import java.util.Date;
import java.util.List;

public class InvitadoImp extends PersonaImp implements Invitado {
	
	private String matricula;
	private String empresa;
	private boolean autorizado;
	private Date inicioAut;
	private Date finAut;
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

	public boolean isAutorizado() {
		return autorizado;
	}
	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	public Date getInicioAut() {
		return inicioAut;
	}
	public void setInicioAut(Date inicioAut) {
		this.inicioAut = inicioAut;
	}

	public Date getFinAut() {
		return finAut;
	}
	public void setFinAut(Date finAut) {
		this.finAut = finAut;
	}
	

	@Override
	public String toString() {
		return "Invitado [matricula=" + matricula + ", empresa=" + empresa + "]";
	}
	
}
