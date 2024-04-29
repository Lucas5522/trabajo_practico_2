package ar.edu.unju.fi.ejercicio5_Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5_Model.Producto;
import ar.edu.unju.fi.ejercicio5_Model.Producto.categoria;
import ar.edu.unju.fi.ejercicio5_Model.Producto.origenFabricacion;



public class Main {
	private static Scanner scanner;
	private static List <Producto>productos;
	public static void main(String[] args) {
		
		int op;
		
		
		do {
			System.out.println("1-Mostrar productos");
			System.out.println("2-Realizar Compra");
			System.out.println("3-Salir");
			System.out.println("*************************");
			System.out.println("Ingrese una opcion: ");
			op =scanner.nextInt();
			switch (op) {
			case 1:mostrarProducto();
			break;
			case 2:
			break;
			case 3:
			break;
			default:
				System.out.println("Ingrese una opcion: ");
			}
		} while (op != 3);
			
	}
		
	public static void preCargaProductos() {
		if(productos == null) {
			productos = new ArrayList<>();
		}
			productos.add(new Producto(1, "Plancha electrica", 150000, origenFabricacion.ARGENTINA, categoria.ELECTROHOGAR , true));
			productos.add(new Producto(2, "galaxy_a31", 750000, origenFabricacion.CHINA, categoria.TELEFONO , false));
			productos.add(new Producto(3, "Destornillador_plano", 2500, origenFabricacion.BRASIL, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(4, "Microondas", 270000, origenFabricacion.BRASIL, categoria.ELECTROHOGAR , true));
			productos.add(new Producto(5, "Clavos2pg", 120, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(6, "Heladera", 525000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , true));
			productos.add(new Producto(7, "Freezer", 15000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , true));
			productos.add(new Producto(8, "Estanteria", 75000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(9, "Galaxy_a04", 690000, origenFabricacion.CHINA, categoria.TELEFONO , true));
			productos.add(new Producto(10, "Aplanadora", 360000, origenFabricacion.BRASIL, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(11, "Pala", 50000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(12, "Pico", 48000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(13, "Hacha", 43000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , true));
			productos.add(new Producto(14, "Licuadora", 90000, origenFabricacion.CHINA, categoria.ELECTROHOGAR , true));
			productos.add(new Producto(15, "Radio", 18000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , false));
	}
	
	public static void mostrarProducto() {
		productos.forEach(d->System.out.println(d));
		
		
	}
	
	
	
	
	
		
}
