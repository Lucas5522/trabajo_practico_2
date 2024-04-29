package ar.edu.unju.fi.ejercicio5_Main;

import java.util.ArrayList;
import java.util.List;


import ar.edu.unju.fi.ejercicio5_Model.Producto;
import ar.edu.unju.fi.ejercicio5_Model.Producto.categoria;
import ar.edu.unju.fi.ejercicio5_Model.Producto.origenFabricacion;



public class Main {

	public static void main(String[] args) {
		Producto productos = new Producto();
		productos = new Producto(1, "Plancha electrica", 150000, origenFabricacion.ARGENTINA, categoria.ELECTROHOGAR , true);
		productos = new Producto(2, "galaxy_a31", 750000, origenFabricacion.CHINA, categoria.TELEFONO , false);
		productos = new Producto(3, "Destornillador_plano", 2500, origenFabricacion.BRASIL, categoria.HERRAMIENTAS , false);
		productos = new Producto(4, "Microondas", 270000, origenFabricacion.BRASIL, categoria.ELECTROHOGAR , true);
		productos = new Producto(5, "Clavos2pg", 120, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false);
		productos = new Producto(6, "Heladera", 525000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , true);
		productos = new Producto(7, "Freezer", 15000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , true);
		productos = new Producto(8, "Estanteria", 75000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false);
		productos = new Producto(9, "Galaxy_a04", 690000, origenFabricacion.CHINA, categoria.TELEFONO , true);
		productos = new Producto(10, "Aplanadora", 360000, origenFabricacion.BRASIL, categoria.HERRAMIENTAS , false);
		productos = new Producto(11, "Pala", 50000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false);
		productos = new Producto(12, "Pico", 48000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false);
		productos = new Producto(13, "Hacha", 43000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , true);
		productos = new Producto(14, "Licuadora", 90000, origenFabricacion.CHINA, categoria.ELECTROHOGAR , true);
		productos = new Producto(15, "Radio", 18000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
}
