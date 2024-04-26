package ar.edu.unju.fi.ejercicio4_Main;

import java.util.ArrayList;
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
			break;
			case 2:mostrarJugador();
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:System.out.println("Adios");
			break;	
			default:
				System.out.println("Ingrese una opcion correcta");
			}
		} while (op != 5);
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
	
	
	

}
