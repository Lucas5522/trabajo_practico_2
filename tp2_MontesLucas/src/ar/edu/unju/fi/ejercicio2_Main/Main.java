package ar.edu.unju.fi.ejercicio2_Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2_Constantes.Mes;
import ar.edu.unju.fi.ejercicio2_Model.Efemeride;

public class Main {
	private static Scanner scanner;
	private static List<Efemeride> efemerides;
	
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int op;
		do {
			System.out.println("************************");
			System.out.println("1-Crear efemeride");
			System.out.println("2-Mostrar efemerides");
			System.out.println("3-Eliminar efemeride");
			System.out.println("4-Modificar efemeride");
			System.out.println("5-Salir");
			System.out.println("**************************");
			System.out.println("Ingrese una opcion: ");
			op = scanner.nextInt();
			switch (op) {
			case 1:crearEfemeride();
			break;
			case 2:mostrarEfemerides();
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:
			break;	
			default:
				System.out.println("Ingrese una opcion correcta");
			}
		} while (op != 5);
	}

	public static void crearEfemeride() {
		if (efemerides == null) {
			efemerides= new ArrayList<>();
		}
		System.out.println("Ingrese codigo: ");
		int codigo = scanner.nextInt();
		System.out.println("Ingrese mes: ");
		int mess = scanner.nextInt();
		Mes meses = obtenerMes(mess);
		System.out.println("Ingrese dia: ");
		String dia = scanner.next();
		System.out.println("Ingrese detalle: ");
		String detalle = scanner.next();
		efemerides.add(new Efemeride(codigo, meses, dia, detalle));
		
	}
	
	private static Mes obtenerMes(int mess) {
		int meses;
		for (Mes mes : Mes.values()){
			meses = mes.ordinal();
			if (meses == mess-1 ) {
				return mes ;
			}	
		}
		return null;
	}
	
	public static void mostrarEfemerides() {
		System.out.println("**************************Mostrar efemerides*****************************");
		efemerides.forEach(m->System.out.println(m));
	}
	
	
	
	/*private static String transformar(int mess) {
	 String deNumaMes;
	 	
		if (mess == 1) {
			
		}
		if (mess == 2) {
			
		}
		if (mess == 3) {
			
		}
		if (mess == 4) {
			
		}
		if (mess == 5) {
			
		}
		if (mess == 6) {
			
		}
		if (mess == 7) {
			
		}
		if (mess == 8) {
			
		}
		if (mess == 9) {
			
		}
		if (mess == 10) {
			
		}
		if (mess == 11) {
			
		}
		if (mess == 12) {
			
		}
		return null;
	}*/
	
	
}
