package ar.edu.unlp.objetos.uno.ejercicio2;
import java.time.LocalDate;
import java.util.*;

public class Ticket extends Informacion {
	private LocalDate fecha;
	
	public Ticket (int cantidadDeProductos, double pesoTotal, double precioTotal, List<Producto> productos) {
		this.setCantidadDeProductos(cantidadDeProductos);
		this.setPesoTotal(pesoTotal);
		this.setPrecioTotal(precioTotal);
		this.setFecha(LocalDate.now());
		this.setProductos(new LinkedList <> (productos));
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
}
