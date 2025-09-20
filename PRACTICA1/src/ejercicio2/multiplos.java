package ejercicio2;

public class multiplos {
	
	public static int[] obtenerMultiplos (int n) {
		int [] mul = new int[n];
		for (int i=0; i<n; i++) {
			mul[i]= n*(i+1);
		}
		return mul;
	}

}
