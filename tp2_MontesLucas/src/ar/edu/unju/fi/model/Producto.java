package ar.edu.unju.fi.model;

public class Producto {
	private int codigo;
	private	String descripcion;
	private double precioUnitario;
	private origenFabricacion pais;
	private  categoria objeto;
	
	
	public enum origenFabricacion{
		ARGENTINA,CHINA,BRASIL,URUGUAY
		
		
	}
	
	public enum categoria{
		TELEFONO,INFORMACION,ELECTROHOGAR,HERRAMIENTAS
		
	}
	
	public Producto() {
		this.pais = origenFabricacion.ARGENTINA;
		this.objeto = categoria.TELEFONO;
	
	}

	
	
	
	
	public Producto(int codigo, String descripcion, double precioUnitario, origenFabricacion pais, categoria objeto) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.pais = pais;
		this.objeto = objeto;
	}





	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public origenFabricacion getPais() {
		return pais;
	}

	public void setPais(origenFabricacion pais) {
		this.pais = pais;
	}

	public categoria getObjeto() {
		return objeto;
	}

	public void setObjeto(categoria objeto) {
		this.objeto = objeto;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", pais=" + pais + ", objeto=" + objeto + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
