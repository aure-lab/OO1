package ar.edu.unlp.info.oo1.ej11;

public class CajaDeAhorro extends Cuenta{

	public double aplicarInteres (double monto) {
		return monto*0.02;
	}
	
	public boolean puedeExtraer (double monto) {
		return this.getSaldo() >= monto + (monto * 0.02);
	}
	
	
	
	
}
