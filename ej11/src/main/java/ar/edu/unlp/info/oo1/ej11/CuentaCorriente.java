package ar.edu.unlp.info.oo1.ej11;

public class CuentaCorriente extends Cuenta{
	private double decubierto;
	
	public CuentaCorriente () {
		super();
		this.decubierto = 0;
	}
	
	public boolean puedeExtraer (double monto) {
		return this.getSaldo() - monto >= this.getDecubierto();
	}

	public double getDecubierto() {
		return decubierto;
	}

	public void setDecubierto(double decubierto) {
		this.decubierto = decubierto;
	}
	
	
}
