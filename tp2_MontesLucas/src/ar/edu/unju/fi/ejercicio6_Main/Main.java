package ar.edu.unju.fi.ejercicio6_Main;

import ar.edu.unju.fi.ejercicio6_Interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6_Model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6_Model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		FelinoSalvaje gato = new FelinoSalvaje("Tanner", (byte)20, 186f);
		if (Converter.isNotNull(gato) == true) {
		Converter<FelinoSalvaje, FelinoDomestico>converter = x -> new FelinoDomestico(x.getNombre(),x.getEdad(), x.getPeso());
		FelinoDomestico felino1 = converter.convert(gato);
		converter.mostrarObjeto(felino1);
		}else {
			System.out.println("El objeto a convertir es nulo");
		}
	}

}
