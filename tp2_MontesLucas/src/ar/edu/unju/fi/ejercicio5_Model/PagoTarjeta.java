package ar.edu.unju.fi.ejercicio5_Model;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5_Interfaces.Pago;

public class PagoTarjeta implements Pago {
	Scanner scanner = new Scanner(System.in);
	String numeroTarjeta;
	LocalDate fechaPago = LocalDate.now() ;
	double montoPagado;
	@Override
	public  void realizarPago(double monto) {
		montoPagado = montoPagado + monto;
		montoPagado = montoPagado + (montoPagado * 0.1);
	}

	@Override
	public void imprimirRecibo() {
		System.out.println("Numero de tarjeta: " + numeroTarjeta);
		System.out.println("Fecha de pago: " + fechaPago);
		System.out.println("Monto pagado: " + montoPagado);
	}
	
	public PagoTarjeta() {
		
	}

	public PagoTarjeta(Scanner scanner, String numeroTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.scanner = scanner;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
	
	
	
}
