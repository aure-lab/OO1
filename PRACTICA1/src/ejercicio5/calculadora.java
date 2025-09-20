package ejercicio5;

public class calculadora {
	private int min;
	private int max;
	private double promedio;
	
	public calculadora () {
		
	}
	
	public calculadora(int min, int max, double promedio) {
		this.setMax(max);
		this.setPromedio(promedio);
		this.setMin(min);
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "calculadora [min=" + min + ", max=" + max + ", promedio=" + promedio + "]";
	}
	
	
}
