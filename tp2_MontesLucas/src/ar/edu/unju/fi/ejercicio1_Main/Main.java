package ar.edu.unju.fi.ejercicio1_Main;



import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1_Model.Producto;
import ar.edu.unju.fi.ejercicio1_Model.Producto.categoria;
import ar.edu.unju.fi.ejercicio1_Model.Producto.origenFabricacion;

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
		mostrar();
		System.out.println("Ingrese origen de fabricacion: ");
		int orige = scanner.nextInt();
		origenFabricacion origen = getorigenFabricacion(orige);
		System.out.println("Ingrese categoria del producto: ");
		int categor = scanner.nextInt();
		categoria categoria = getcategoria(categor);
		productos.add(new Producto(codigo, descripcion, precio, origen, categoria));
		
			
		
		
	}
	
	public static void mostrarProductos() {
		System.out.println("*****************************");
		productos.forEach(d->System.out.println(d));	
	}
		
	
	public static void modificarProductos() {
		System.out.println("Igrese codigo del producto a modificar");
		int productoModificado = scanner.nextInt();
		for(Producto producto : productos) {
			if (producto.getCodigo() == productoModificado) {
				System.out.println("Ingrese nuevo codigo: ");
				int codi= scanner.nextInt();
				System.out.println("Ingrese nueva descripcion: ");
				String descrip = scanner.next();
				System.out.println("Ingrese nuevo precio unitario: ");
				double prec = scanner.nextDouble();
				System.out.println("  ");
				mostrar();
				System.out.println("Ingrese una opcion: ");
				System.out.println("1-Modificar origen de fabricacion");
				System.out.println("2-Modificar categoria");
				int op = scanner.nextInt();
				if (op == 1) {
					System.out.println("Ingrese origen de fabricacion: ");
					int orige = scanner.nextInt();
					origenFabricacion product = getorigenFabricacion(orige);
					producto.setPais(product);
				}else {
					if (op == 2) {
						System.out.println("Ingrese categoria del producto: ");
						int catego = scanner.nextInt();
						categoria categoria = getcategoria(catego);
						producto.setObjeto(categoria);
					}
				}
				producto.setCodigo(codi);
				producto.setDescripcion(descrip);
				producto.setPrecioUnitario(prec);
			}
		}
		
	}
	
	
	private static origenFabricacion getorigenFabricacion(int orige) {
		int tomoPais;
		for(origenFabricacion  pais : Producto.origenFabricacion.values()) {
			tomoPais = pais.ordinal();
			if(tomoPais == orige-1) {
				return pais;
			}	
		}
		return null;
	}	
	 
	private static categoria getcategoria(int catego) {
		int tomoCategoria;
		for(categoria categoria : Producto.categoria.values()) {
			tomoCategoria = categoria.ordinal();
			if(tomoCategoria == catego-1){
				return categoria;
			}
		}
		return null;
	}
	
	
	public static void mostrar() {
		int i = 1;
		int a = 1;
		System.out.println("*****************Origen de fabricacion***************");
		for (origenFabricacion  producto : Producto.origenFabricacion.values()) {
			System.out.println( i + "-" + producto );
			i++;
		}
		System.out.println("---------------------");
		System.out.println("*****************Categoria***************************");
		for(categoria categoria : Producto.categoria.values()){
			System.out.println( a + "-" + categoria );
			a++;
		}
		
		
	}
	
	
	
	
	
	

}
