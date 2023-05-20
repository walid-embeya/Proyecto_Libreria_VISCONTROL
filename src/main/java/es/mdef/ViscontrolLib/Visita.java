package es.mdef.ViscontrolLib;

import java.util.Date;
import java.util.List;

public interface Visita {
	
	public Date getFechaInicio();
	public Date getFechaFin();
	public String getActuaciones();
	public String getActividad();
	public Anfitrion getAnfitrion();
	public List<Invitado> getInvitados();
	
}
