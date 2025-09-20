package ejercicio3;

public class profesor extends persona {
	private String catedra;
	private String facultad;
	
	public profesor (String nombre, String apellido, String email, String catedra, String facultad) {
		super(nombre, apellido, email);
		this.setFacultad(facultad);
		this.setCatedra(catedra);
	}
	
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	@Override
	public String tusDatos() {
		return super.tusDatos() + " catedra= " + this.getCatedra() + " facultad= " + this.getFacultad();
	}
	
}
