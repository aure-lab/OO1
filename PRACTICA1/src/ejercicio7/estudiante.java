package ejercicio7;

public class estudiante {
	private String nombre;
	private int legajo;
	
	public estudiante (String nombre, int legajo) {
		this.setNombre(nombre);
		this.setLegajo(legajo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "nombre=" + this.getNombre() + ", legajo=" + this.getLegajo();}
	
	

}
