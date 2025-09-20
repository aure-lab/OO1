package ejercicio3;

public class estudiante extends persona{
	private int comision;
	private String direccion;
	
	public estudiante (String nombre, String apellido, String email, int comision , String direccion) {
		super(nombre,apellido,email);
		this.setDireccion(direccion);
		this.setComision(comision);
	}
	
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override 
	public String tusDatos() {
		return super.tusDatos() + " comision= " + this.getComision() + " direccion= " + this.getDireccion();
	}
}
