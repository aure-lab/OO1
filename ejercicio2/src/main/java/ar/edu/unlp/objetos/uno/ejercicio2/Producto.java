package ar.edu.unlp.objetos.uno.ejercicio2;

public class Producto {
		private double peso;
		private double precioPorKilo;
		private String descripcion;
		
		
		public Producto (String descripcion, double peso, double precioPorKilo) {
			this.setDescripcion(descripcion);
			this.setPeso(peso);
			this.setPrecioPorKilo(precioPorKilo);
		}
		
		public double getPrecio () {
			return this.getPeso()*this.getPrecioPorKilo();
		}
		
		public double getPeso() {
			return peso;
		}
		private void setPeso(double peso) {
			this.peso = peso;
		}
		public double getPrecioPorKilo() {
			return precioPorKilo;
		}
		public void setPrecioPorKilo(double precioPorKilo) {
			this.precioPorKilo = precioPorKilo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		private void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		

		
		

}
