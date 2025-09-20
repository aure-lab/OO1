package ejercicio2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		int n=s.nextInt();
		int [] vec=multiplos.obtenerMultiplos(n);
		for (int i=0; i<n; i++) {
			System.out.println(vec[i]);
		}
		s.close();
	}

}
