package es.mdef.ViscontrolLib;

public class Anfitrion extends Persona implements AnfitrionInterfaz {		
		private Integer nip;
		private String area;
		private Integer role;
		
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
			return role;
		}
		public void setRol(Integer role) {
			this.role = role;
		}		
		
		public Anfitrion(String dni, String nombre, String apellidos, String telefono, String email, Integer nip,
				String area, Integer role) {
			super(dni, nombre, apellidos, telefono, email);
			this.nip = nip;
			this.area = area;
			this.role = role;
		}
		
		@Override
		public String toString() {
			return "Anfitrion [nip=" + nip + ", area=" + area + ", role=" + role + "]";
		}
			
}
