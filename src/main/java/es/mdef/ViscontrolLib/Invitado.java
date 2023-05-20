package es.mdef.ViscontrolLib;

import java.util.Date;
import java.util.List;

public interface Invitado {

	public List<Visita> getVisitas();
	public String getMatricula();
	public String getEmpresa();
	public boolean isAutorizado();
	public Date getInicioAut();
	public Date getFinAut();
	
}
