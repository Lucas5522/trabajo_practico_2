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
			case 3:eliminarEfemeride();
			break;
			case 4:modificarEfemeride();
			break;
			case 5:System.out.println("Adios");
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
		if (mess < 1 || mess > 12) {
			System.out.println("el mes ingresado es incorrecto ingrese nuevamente un mes: ");
			mess = scanner.nextInt();
		}
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
	
	
	public static void eliminarEfemeride() {
		Iterator<Efemeride>iterator= efemerides.iterator();
		System.out.println("Ingrese codigo a eliminar: ");
		int codi = scanner.nextInt();
		while(iterator.hasNext()) {
			Efemeride efemer = iterator.next();
			if (efemer.getCodigo() == codi) {
				iterator.remove();
			}
		}
		System.out.println("Se a eliminado el efemeride");	
	}
	
	
	public static void modificarEfemeride() {
		System.out.println("Ingrese codigo del mes a modificar: ");
		int codig = scanner.nextInt();
		System.out.println("Ingrese mes del efemeride a modificar: ");
		int mess = scanner.nextInt();
		if (mess < 1 || mess > 12) {
			System.out.println("el mes ingresado es incorrecto ingrese nuevamente un mes: ");
			mess = scanner.nextInt();
		}
		Mes meses = obtenerMes(mess);
		for(Efemeride efem : efemerides) {
			if (efem.getMes().equals(meses) && efem.getCodigo() == codig) {
				System.out.println("Ingrese nuevo codigo");
				int nuevoCodigo = scanner.nextInt();
				System.out.println("Ingrese nuevo mes: ");
				int nuevoMes = scanner.nextInt();
				if (nuevoMes < 1 || nuevoMes > 12) {
					System.out.println("el mes ingresado es incorrecto ingrese nuevamente un mes: ");
					nuevoMes = scanner.nextInt();
				}
				Mes meses1 = obtenerMes(nuevoMes);
				System.out.println("Ingrese nuevo dia: ");
				String nuevoDia = scanner.next();
				System.out.println("Ingrese nuevo detalle");
				String nuevoDetalle = scanner.next();	
				efem.setCodigo(nuevoCodigo);
				efem.setMes(meses);
				efem.setDia(nuevoDia);
				efem.setDetalle(nuevoDetalle);
			}
			
		}
	}
	
}
