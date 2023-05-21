package es.mdef.ViscontrolLib;

import java.util.List;

public class AnfitrionImp extends PersonaImp implements Anfitrion {		
	
		private String nip;
		private String area;
		private String role;
		private List<Visita> visitas;
		
		
		public List<Visita> getVisitas() {
			return visitas;
		}
		public void setVisitas(List<Visita> visitas) {
			this.visitas = visitas;
		}
		
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
