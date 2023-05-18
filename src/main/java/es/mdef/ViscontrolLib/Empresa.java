package es.mdef.ViscontrolLib;

public class Empresa {
	private String nombreEmpresa;

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String toString() {
		return "Empresa [nombreEmpresa=" + nombreEmpresa + "]";
	}
		

}
