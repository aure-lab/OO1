package ejercicio3;

public abstract class persona {
	private String nombre;
	private String apellido;
	private String email;
	
	public persona(String nombre, String apellido, String email) {
		this.setApellido(apellido);
		this.setEmail(email);
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String tusDatos() {
		return "nombre=" + this.getNombre()+ ", apellido=" + this.getApellido() + ", email=" + this.getEmail();
	}
	
	
	
}
