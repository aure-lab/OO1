package ar.edu.unlp.objetos.uno.ejercicio2;
import java.util.*;
public class Balanza extends Informacion{
	
	public Balanza () {
		this.ponerEnCero();
	}
	
	public void ponerEnCero () {
		this.setCantidadDeProductos(0);
		this.setPesoTotal(0);
		this.setPrecioTotal(0);
		this.setProductos(new LinkedList<Producto>()); 
	}
	
	public void agregarProducto (Producto producto) {
		this.getProductos().add(producto);
		this.setCantidadDeProductos(this.getCantidadDeProductos()+1);
		this.setPesoTotal(producto.getPeso()+ this.getPesoTotal());
		this.setPrecioTotal(producto.getPrecio() + this.getPrecioTotal());
	}
	
	public Ticket emitirTicket () {
		return new Ticket (this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal(), this.getProductos());
	}	

}
