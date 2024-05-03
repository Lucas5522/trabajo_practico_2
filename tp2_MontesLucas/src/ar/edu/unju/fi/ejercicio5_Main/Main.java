package ar.edu.unju.fi.ejercicio5_Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5_Model.PagoTarjeta;
import ar.edu.unju.fi.ejercicio5_Model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio5_Model.Producto;
import ar.edu.unju.fi.ejercicio5_Model.Producto.categoria;
import ar.edu.unju.fi.ejercicio5_Model.Producto.origenFabricacion;



public class Main {
	private static Scanner scanner;
	private static List <Producto>productos;
	private static List <Producto>productosComprados;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int op;
		preCargaProductos();
		try {
		do {
			System.out.println("*************************");
			System.out.println("1-Mostrar productos");
			System.out.println("2-Realizar Compra");
			System.out.println("3-Salir");
			System.out.println("*************************");
			System.out.println("Ingrese una opcion: ");
			op =scanner.nextInt();
			switch (op) {
			case 1: mostrarProducto();
			break;
			case 2:realizarCompra();
			break;
			case 3:System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion incorrecta ");
			}
		} while (op != 3);
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
			productos.add(new Producto(7, "Freezer", 15000, origenFabricacion.URUGUAY, categoria.ELECTROHOGAR , true));
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
		productos.forEach(p->System.out.println(p));
		
		
	}
	
	
	public static void realizarCompra() {
		String continuar;
		PagoTarjeta pagoTarjeta = new PagoTarjeta();
		PagoEfectivo pagoEfectivo = new PagoEfectivo();
		try {
		do {	
		if(productosComprados == null) {
			productosComprados = new ArrayList<>();
		}
		System.out.println("Ingrese el codigo del producto a comprar: ");
		int codigo = scanner.nextInt();
		for(Producto producto: productos) {
			if(producto.getCodigo() == codigo) {
				productosComprados.add(new Producto(producto.getCodigo(), producto.getDescripcion(), 
													producto.getPrecioUnitario(), producto.getPais(), 
													producto.getObjeto(), producto.getEstado()));
				pagoTarjeta.realizarPago(producto.getPrecioUnitario());
				pagoEfectivo.realizarPago(producto.getPrecioUnitario());
			}
		}
		System.out.println("Desea relaizar otra compra S(s)/N(n) ");
		continuar = scanner.next();
		} while (continuar.toUpperCase().equals("S"));
		} catch (Exception e) {
			System.out.println("Ingreso un codigo de compra incorrecto reinicie  realize de nuevo el procedimiento");
		}
		System.out.println("1-Pago con tarjeta");
		System.out.println("2-Pago con efectivo");
		System.out.println("Ingrese la opcion de pago: ");
		int op = scanner.nextInt();
		try {
		switch (op) {
		case 1: System.out.println("Ingrese numero de tarjeta: ");
				String numeroTarjet = scanner.next();
				pagoTarjeta.setNumeroTarjeta(numeroTarjet);
				pagoTarjeta.imprimirRecibo();
		break;
		case 2:
				pagoEfectivo.imprimirRecibo();
		break;
		default:
			System.out.println("La opcion elegida es incorrecta; ");
		}
		} catch (Exception e) {
			System.out.println("Ingreso de opcion incorrecto reinicie");
		}	
		
	}
		
}
