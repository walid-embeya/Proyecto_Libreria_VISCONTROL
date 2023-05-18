package es.mdef.ViscontrolLib;

import java.util.List;

public interface InvitadoInterfaz {

	public List<Visita> getVisitas();
	public void setVisitas(List<Visita> visitas);
	public String getMatricula();
	public void setMatricula(String matricula);
	public Empresa getEmpresa();
	public void setEmpresa(Empresa empresa);
	public Autorizacion getAutorizacion();
	public void setAutorizacion(Autorizacion autorizacion);
	
}
