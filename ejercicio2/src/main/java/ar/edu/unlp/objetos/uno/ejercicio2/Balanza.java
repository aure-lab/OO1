package ar.edu.unlp.objetos.uno.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza () {
		this.ponerEnCero();
	}
	
	public void ponerEnCero () {
		this.setCantidadDeProductos(0);
		this.setPesoTotal(0);
		this.setPrecioTotal(0);
	}
	
	public void agregarProducto (Producto producto) {
		this.setCantidadDeProductos(this.getCantidadDeProductos()+1);
		this.setPesoTotal(producto.getPeso()+ this.getPesoTotal());
		this.setPrecioTotal(producto.getPrecio() + this.getPrecioTotal());
	}
	
	public Ticket emitirTicket () {
		return new Ticket (this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
	}

	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	private void setCantidadDeProductos(int cantidadDeProductos) {
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
	private void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
	

}
