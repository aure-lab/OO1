package ejercicio7;

import java.util.*;

public class ejercicioSucesion {
	
	public static List<Integer> calcularSucesion (int n){
		List<Integer> sucesion = new ArrayList<>();
		ejercicioSucesion.recursivo(n, sucesion);
		return sucesion;
	}

	public static void recursivo (int n, List<Integer> sucesion){
		if (n == 1)
			return;
		else {
			if (n % 2 == 0) {
				sucesion.add(n/2);
				ejercicioSucesion.recursivo(n/2,sucesion);
			}
			else {
				sucesion.add((3*n)+1);
				ejercicioSucesion.recursivo((3*n)+1,sucesion);
			}
		}
			
		
	}
}
