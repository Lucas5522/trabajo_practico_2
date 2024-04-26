package ar.edu.unju.fi.ejercicio4_Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4_Constantes.Posicion;
import ar.edu.unju.fi.ejercicio4_Model.Jugador;

public class Main {
	private static Scanner scanner;
	private static List<Jugador>jugadores;
	public static void main(String[] args) {
   	 scanner = new Scanner(System.in);
	 int op;
	 boolean band = false;
	 try {
		do {
			System.out.println("************************");
			System.out.println("1-Alta de jugador");
			System.out.println("2-Mostrar todos los jugadores");
			System.out.println("3-Modificar jugador");
			System.out.println("4-Eliminar jugador");
			System.out.println("5-Salir");
			System.out.println("**************************");
			System.out.println("Ingrese una opcion: ");
			op = scanner.nextInt();
			switch (op) {
			case 1:altaJugador();
					band=true;
			break;
			case 2:
				if (band == true) {
					mostrarJugador();
				} else {
					System.out.println("Ingrese almenos 1 jugador(ingrese en la opcion 1)");
				}
			break;
			case 3:
				if (band == true) {
					modificarJugador();
				} else {
					System.out.println("Ingrese almenos 1 jugador(ingrese en la opcion 1)");
				}
			break;
			case 4:
				if (band == true) {
					eliminarJugador();
				} else {
					System.out.println("Ingrese en la opcion 1");
				}
			break;
			case 5:System.out.println("Adios");
			break;
			default:
				System.out.println("Ingrese una opcion correcta");
			}
		} while (op != 5);
	 } catch (Exception e) {
			System.out.println("Ingreso una opcion no valida reinicie el programa");
		}
	}
	
	public static void altaJugador() {
		if (jugadores == null) {
			jugadores = new ArrayList<>();		
		}
		try{
			System.out.println("Ingrese nombre del jugador: ");
			String nombre= scanner.next();
			System.out.println("Ingrese apellido del jugador: ");
			String apellido= scanner.next();
			System.out.println("Ingrese Fecha de nacimiendo del jugador(dia-mes-año): ");
			String fechaNacimiento= scanner.next();
			System.out.println("Ingrese nacionalidad del jugador: ");
			String nacionalidad= scanner.next();
			System.out.println("Ingrese estatura del jugador: ");
			float estatura= scanner.nextFloat();
			System.out.println("Ingrese peso del jugador: ");
			float peso= scanner.nextFloat();
			
			System.out.println("Ingrese posicion del jugador(delantero,medio,defensa,arquero): ");
			String posicion = scanner.next();
			Posicion posici = buscarPosicion(posicion);
			
			jugadores.add(new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posici));
			}catch (Exception e) {
				System.out.println("Alguno de los datos ingresados no es correcto");
			}	
	}
	
	
	public static Posicion buscarPosicion(String posicion) {
		for(Posicion pos : Posicion.values())
			if(pos.name().equals(posicion.toUpperCase())) {
			return pos;
			}
		return null;
	}
	
	
	public static void mostrarJugador() {
		System.out.println("*************LISTA DE JUGADORES****************");	
			jugadores.forEach(j->System.out.println(j));
	}
	
	
	public static void modificarJugador() {
	 try {
		System.out.println("*************Modificar jugador*****************");
		System.out.println("Ingrese nombe del jugador a modificiar: ");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido del jugador a modificiar: ");
		String apellido = scanner.next();
		for(Jugador jugador: jugadores) {
			if ( jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				System.out.println("Ingrese nuevo nombre del jugador: ");
				String nuevoNombre= scanner.next();
				System.out.println("Ingrese nuevo apellido del jugador: ");
				String nuevoApellido= scanner.next();
				System.out.println("Ingrese nueva fecha de nacimiendo del jugador(dia-mes-año): ");
				String nuevFecha= scanner.next();
				System.out.println("Ingrese nueva nacionalidad del jugador: ");
				String nuevaNacionalidad= scanner.next();
				System.out.println("Ingrese nueva altura del jugador: ");
				float nuevaAltura= scanner.nextFloat();
				System.out.println("Ingrese nuevo peso del jugador: ");
				float nuevoPeso= scanner.nextFloat();
				System.out.println("Ingrese nueva posicion del jugador(delantero,medio,defensa,arquero): ");
				String nuevaPosicion= scanner.next();
				Posicion posicion = buscarPosicion(nuevaPosicion);
				jugador.setNombre(nuevoNombre);
				jugador.setApellido(nuevoApellido);
				jugador.setFechaNacimiento(nuevFecha);
				jugador.setNacionalidad(nuevaNacionalidad);
				jugador.setEstatura(nuevaAltura);
				jugador.setPeso(nuevoPeso);
				jugador.setPosicion(posicion);
			}
		}
	 } catch (Exception e) {
			System.out.println("Uno de los datos ingresados es incorrecto");
		}
	}
	
	
	public static void eliminarJugador() {
		Iterator<Jugador> iterator = jugadores.iterator();
		System.out.println("Ingrese nombre del jugador a eliminar: ");
		String nombre= scanner.next();
		System.out.println("Ingrese apellido del jugador a eliminar: ");
		String apellido= scanner.next();
		while (iterator.hasNext()) {
			Jugador jugador = iterator.next();
			if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)){
				iterator.remove();
			}
		}
		System.out.println("Jugador eliminado");
	}
	
	

}
