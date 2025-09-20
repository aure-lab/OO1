package ar.edu.unlp.objetos.uno.ejercicio2;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket (int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.setCantidadDeProductos(cantidadDeProductos);
		this.setPesoTotal(pesoTotal);
		this.setPrecioTotal(precioTotal);
		this.setFecha(LocalDate.now());
	}
	
	public double impuesto () {
		return this.getPrecioTotal()*0.21;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	private void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	private void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	private void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}	
}
