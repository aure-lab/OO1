package ejercicio8.ej8;

import java.time.*;

public class Mamifero {
	private String identenficador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero (String id) {
		this.setIdentificador(id);
	}
	
	public Mamifero () {
		this.setIdentificador("N/A");
		this.setEspecie("N/A");
	}
	
	private boolean tieneMadre () {
		return (this.getMadre() != null);
	}
	
	private boolean tienePadre () {
		return (this.getPadre() != null);
	}
	
	public Mamifero getAbueloPaterno () {
		if (this.tienePadre())
			return this.getPadre().getPadre();
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.tienePadre())
			return this.getPadre().getMadre();
		return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.tieneMadre())
			return this.getMadre().getPadre();
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.tieneMadre())
			return this.getMadre().getMadre();
		return null;
	}
	
	public String getIdentificador() {
		return identenficador;
	}
	public void setIdentificador(String identenficador) {
		this.identenficador = identenficador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public boolean tieneComoAncestroA (Mamifero unMamifero) {
		Mamifero map = this.getPadre();
		Mamifero mam = this.getMadre();
		Boolean ok = false;
		if (mam != null) {
			if (mam != unMamifero) {
				ok = this.getMadre().tieneComoAncestroA(unMamifero);
			}
			else
				ok = true;
		}
		if(!ok && map != null) {
			if (map != unMamifero)
				ok = this.getPadre().tieneComoAncestroA(unMamifero);
			else
				ok = true;
		}
		return ok;
	}
}
