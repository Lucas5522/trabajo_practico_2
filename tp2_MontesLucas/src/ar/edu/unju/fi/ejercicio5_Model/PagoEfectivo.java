package ar.edu.unju.fi.ejercicio5_Model;

import java.time.LocalDate;

public class PagoEfectivo {
	double montoPagado;
	LocalDate fechaPago;
	
	
	public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}
	
	public double getMontoPagado() {
		return montoPagado;
	}
	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
