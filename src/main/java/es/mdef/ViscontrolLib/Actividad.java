package es.mdef.ViscontrolLib;

public class Actividad {
	private String tipo;
	private String zona;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public Actividad(String tipo, String zona) {
		this.tipo = tipo;
		this.zona = zona;
	}
	
	@Override
	public String toString() {
		return "Actividad [tipo=" + tipo + ", zona=" + zona + "]";
	}	

}
