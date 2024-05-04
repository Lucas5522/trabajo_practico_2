package ar.edu.unju.fi.ejercicio6_Main;

import ar.edu.unju.fi.ejercicio6_Interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6_Model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6_Model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		
		FelinoDomestico gato = new FelinoDomestico("Tanner", (byte)20, 186f);
		Converter<FelinoDomestico, FelinoSalvaje>converter = x -> new FelinoSalvaje(x.getNombre(),x.getEdad(), x.getPeso());
		FelinoSalvaje felino1 = converter.convert(gato);
		converter.mostrarObjeto(felino1);	
	}

}
