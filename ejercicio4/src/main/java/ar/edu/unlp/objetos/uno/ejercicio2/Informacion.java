package ar.edu.unlp.objetos.uno.ejercicio2;
import java.util.List;

public abstract class Informacion {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	
	public List<Producto> getProductos() {
		return productos;
	}

	protected void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	protected void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	protected void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
}
