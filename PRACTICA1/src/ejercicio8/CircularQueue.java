package ejercicio8;

public class CircularQueue <T> extends Queue <T> {
	
	public T shift () {
		T frente = super.denqueue();
		super.enqueue(frente);
		return frente;
	}
	
}
