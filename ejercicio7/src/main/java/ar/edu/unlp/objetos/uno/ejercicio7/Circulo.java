package ar.edu.unlp.objetos.uno.ejercicio7;

public class Circulo implements Figura{
	private double radio = 0;
	
	public Circulo () {
	}
	
	public Circulo (double radio) {
		this.setRadio(radio);
		this.setDiametro(radio);
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		if (radio*2 != this.getDiametro())
			this.setDiametro(radio*2);
	}
	public double getDiametro() {
		return this.getRadio()*2;
	}
	public void setDiametro(double diametro) {
		this.setRadio(diametro/2);
	}
	
	//si el radio no es igual el diametro/2 lo deberia cambniar???????
	
	public double getArea () {
		return this.getRadio() * this.getRadio() * Math.PI;
	}
	
	public double getPerimetro () {
		return this.getDiametro()* Math.PI;
	}

}
