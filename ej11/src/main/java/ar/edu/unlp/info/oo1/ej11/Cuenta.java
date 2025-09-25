package ar.edu.unlp.info.oo1.ej11;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta () {
		this.saldo = 0;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer (double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto + this.aplicarInteres(monto));
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer (double monto);
	
	protected abstract double aplicarInteres (double monto);

}
