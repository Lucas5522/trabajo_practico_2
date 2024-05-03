package ar.edu.unju.fi.ejercicio5_Model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5_Interfaces.Pago;

public class PagoEfectivo implements Pago {
	double montoPagado;
	LocalDate fechaPago;
	
	@Override
	public void realizarPago(double monto) {
		montoPagado = montoPagado + monto;

	}

	@Override
	public void imprimirRecibo() {
		System.out.println("Fecha de pago: " + fechaPago);
		System.out.println("Monto pagado: " + montoPagado);

	}
	
	public PagoEfectivo() {
		
	}
	
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
