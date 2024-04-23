package ar.edu.unju.fi.main;



import ar.edu.unju.fi.model.Producto;
import ar.edu.unju.fi.model.Producto.categoria;
import ar.edu.unju.fi.model.Producto.origenFabricacion;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static Scanner scanner;
	private static List <Producto>productos;
	
	
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int op;
		do {
			System.out.println("************************");
			System.out.println("1-Crear Producto");
			System.out.println("2-Mostrar productors");
			System.out.println("3-Modificar producto");
			System.out.println("4-Salir");
			System.out.println("**************************");
			System.out.println("Ingrese una opcion");
			op = scanner.nextInt();
	
			switch (op) {
			case 1:crearProducto();
			
			break;
			case 2:mostrarProductos();
			
			break;
			case 3:modificarProductos();
			
			break;
			case 4:System.out.println("Adios");
			break;
			default:
				System.out.println("Opcion elegida icorrecta eliga nuevamente");
			}
			
			
			
			
			
			
			
			
			
			
			
		} while (op != 4);
		
		
		
	}
	
	
	public static void crearProducto(){
		if (productos == null) {
			productos = new ArrayList<>();
		}
		System.out.println("Ingrese codigo: ");
		int codigo = scanner.nextInt();
		System.out.println("Ingrese descripcion: ");
		String descripcion = scanner.next();
		System.out.println("Ingrese precio unitario: ");
		double precio = scanner.nextDouble();
		System.out.println("Ingrese origen de fabricacion: ");
		
		productos.add(new Producto(codigo, descripcion, precio, origenFabricacion.ARGENTINA, categoria.TELEFONO));
		
			
		
		
	}
	
	public static void mostrarProductos() {
		System.out.println("*************LISTA DE DESTINOS TURISTICOS****************");
		productos.forEach(d->System.out.println(d));	
	}
	
	
	
	public static void modificarProductos() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
