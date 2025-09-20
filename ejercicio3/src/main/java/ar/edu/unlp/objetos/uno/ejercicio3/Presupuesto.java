package ar.edu.unlp.objetos.uno.ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List <Item> items;
	
	public Presupuesto (String cliente) {
		this.setCliente(cliente);
		this.setFecha(LocalDate.now()); //NO ES PARA UNA FECHA ESPECIFICA??????
		this.setItems(new LinkedList<Item>());
	}

	public void agregarItem (Item item) {
		this.getItems().add(item);
	}
	
	public double calcularTotal () {
		double costo = 0;
		for (Item item : this.getItems()){
			costo += item.costo();
		}
		return costo;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	private void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	private void setItems(List<Item> items) {
		this.items = items;
	}

	
	
}
