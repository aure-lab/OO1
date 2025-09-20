package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuerpo3D {
	private Figura caraBasal;
	private double altura;
	
	public Figura getCaraBasal() {
		return caraBasal;
	}
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double valor) {
		this.altura = valor;
	}
	
	public double getSuperficieExterior () {
		return 2 * this.getCaraBasal().getArea() + this.getCaraBasal().getPerimetro() * this.getAltura();
	}
	
	public double getVolumen () {
		return this.getCaraBasal().getArea() * this.getAltura();
	}
	
	
}
