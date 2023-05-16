package es.mdef.ViscontrolLib;

public class Anfitrion extends Persona {		
		private Integer nip;
		private String area;
		private Integer rol;
		
		public Integer getNip() {
			return nip;
		}
		public void setNip(Integer nip) {
			this.nip = nip;
		}

		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}

		public Integer getRol() {
			return rol;
		}
		public void setRol(Integer rol) {
			this.rol = rol;
		}		
		
		public Anfitrion(String dni, String nombre, String apellidos, String telefono, String email, Integer nip,
				String area, Integer rol) {
			super(dni, nombre, apellidos, telefono, email);
			this.nip = nip;
			this.area = area;
			this.rol = rol;
		}
		
		@Override
		public String toString() {
			return "Anfitrion [nip=" + nip + ", area=" + area + ", rol=" + rol + "]";
		}
			
}
