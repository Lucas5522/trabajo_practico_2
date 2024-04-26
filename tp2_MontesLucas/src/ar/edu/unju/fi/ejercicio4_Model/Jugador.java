package ar.edu.unju.fi.ejercicio4_Model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.ejercicio4_Constantes.Posicion;

public class Jugador {
	String nombre;
	String apellido;
	String fechaNacimiento;
	String nacionalidad;
	float estatura;
	float peso;
	Posicion posicion;
	
	
	public void calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		LocalDate fecha = LocalDate.parse(fechaNacimiento);
		Period anio = Period.between(fecha, fechaActual);
		int edad = anio.getYears();
		System.out.println("Edad: " + edad);
	}

	public Jugador() {
	
	}
	
	public Jugador(String nombre, String apellido, String fechaNacimiento, String nacionalidad, float estatura,
			float peso, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public CharSequence getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
