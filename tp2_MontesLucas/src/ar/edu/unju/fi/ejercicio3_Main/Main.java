package ar.edu.unju.fi.ejercicio3_Main;


import ar.edu.unju.fi.ejercicio3_Constantes.Provincia;

public class Main {
	public static Provincia[] provincias;
		public static void main(String[] args) {
			
			if (provincias == null) {
				provincias = new Provincia[6];
			}
			provincias = Provincia.values();										
		    	
			for(Provincia p : provincias) {
				System.out.println( p + "| Cantidad poblacion:  " + p.getCantidadPobolacion() + 
									"| Superficie:  " + p.getSuperficie() + "| Densidad poblacional " + 
									p.densidadPoblacional());
				System.out.println(" ");
		     } 
	
	
		} 
}
