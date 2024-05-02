package ar.edu.unju.fi.ejercicio5_Model;

import java.time.LocalDate;
import ar.edu.unju.fi.ejercicio5_Interfaces.Pago;

public class PagoTarjeta {
	String numeroTarjeta;
	LocalDate fechaPago;
	double montoPagado;
	
	public PagoTarjeta() {
		
	}
	
	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
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
	
	public class PagoTarjeta implements Pago{
		
		public void realizarPago(Double monto) {
			
		}
		
		
	}
	
	
	
	
	
}
