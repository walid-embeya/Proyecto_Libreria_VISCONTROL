package es.mdef.ViscontrolLib;

public class AnfitrionImp extends PersonaImp implements Anfitrion {		
		private String nip;
		private String area;
		private String role;
		
		public String getNip() {
			return nip;
		}
		public void setNip(String nip) {
			this.nip = nip;
		}

		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
		
		@Override
		public String toString() {
			return "Anfitrion [nip=" + nip + ", area=" + area + ", role=" + role + "]";
		}
			
}
