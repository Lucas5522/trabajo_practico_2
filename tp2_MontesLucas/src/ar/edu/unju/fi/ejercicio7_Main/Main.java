package ar.edu.unju.fi.ejercicio7_Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio5_Model.Producto;
import ar.edu.unju.fi.ejercicio5_Model.Producto.categoria;
import ar.edu.unju.fi.ejercicio5_Model.Producto.origenFabricacion;

public class Main {
	private static Scanner scanner;
	private static List <Producto>productos;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int op;
		preCargaProductos();
		try {
		do {
			System.out.println("*************************");
			System.out.println("1-Mostrar productos disponibles");
			System.out.println("2-Mostrar productos faltantes");
			System.out.println("3-Incrementar los productos en un 20%");
			System.out.println("4-mostrar productos de Electrohogar disponibles");
			System.out.println("5-Ordenar los productos por precio");
			System.out.println("6-Mostrar los nombres de los productos en mayusculas");
			System.out.println("7-Salir");
			System.out.println("*************************");
			System.out.println("Ingrese una opcion: ");
			op =scanner.nextInt();
			switch (op) {
			case 1: mostrarProducto();
			break;
			case 2: mostrarProductoFaltante();
			break;
			case 3: amuentarPrecio();
			break;
			case 4: mostrarElectrohogar();
			break;
			case 5:
			break;
			case 6:
			break;
			case 7:System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion incorrecta ");
			}
		} while (op != 7);
		} catch (Exception e) {
			System.out.println("Ingreso incorrecto reinicie");
		}
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
			productos.add(new Producto(7, "Freezer", 15000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , false));
			productos.add(new Producto(8, "Estanteria", 75000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(9, "Galaxy_a04", 690000, origenFabricacion.CHINA, categoria.TELEFONO , true));
			productos.add(new Producto(10, "Aplanadora", 360000, origenFabricacion.BRASIL, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(11, "Pala", 50000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(12, "Pico", 48000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , false));
			productos.add(new Producto(13, "Hacha", 43000, origenFabricacion.ARGENTINA, categoria.HERRAMIENTAS , true));
			productos.add(new Producto(14, "Licuadora", 90000, origenFabricacion.CHINA, categoria.ELECTROHOGAR , true));
			productos.add(new Producto(15, "Intelpc", 980000, origenFabricacion.URUGUAY, categoria.INFORMACION , false));
	}
	
	
	public static void mostrarProducto() {
		System.out.println("************************");
		//No encuentro la manera de que consumer solo muestre los productos verdaderos asi que lo dejo con predicate
		/*Consumer<Producto>printConsumer = p-> System.out.println(p);
		productos.forEach(printConsumer);*/
		Predicate<Producto>fliterEstadoTrue = p -> p.isEstado();
		productos.stream().filter(fliterEstadoTrue).forEach(System.out::println);
		
	}
	
	
	public static void mostrarProductoFaltante() {
		System.out.println("************************");
		//No encuentro la manera de que consumer solo muestre los productos verdaderos asi que lo dejo con predicate
		/*Consumer<Producto>printConsumer = p-> System.out.println(p);
		productos.forEach(printConsumer);*/
		Predicate<Producto>fliterEstadoFalse = p -> !p.isEstado();
		productos.stream().filter(fliterEstadoFalse).forEach(System.out::println);
		
	}
	
	
	public static void amuentarPrecio() {
		Function<Producto, Producto> incrementar = (p) -> {
			double precioAumentado = p.getPrecioUnitario() + (p.getPrecioUnitario() * 0.2f);
			p.setPrecioUnitario(precioAumentado);
			return p;
		}; 
		List <Producto> productosIncrementados = new ArrayList<>();
		productosIncrementados = productos.stream().map(incrementar).collect(Collectors.toList());
	}
	
	
	public static void mostrarElectrohogar() {
		Predicate<Producto>filterHelectrohogar = p-> p.getObjeto().equals(Producto.categoria.ELECTROHOGAR) && p.isEstado();
		productos.stream().filter(filterHelectrohogar).forEach(System.out::println);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
