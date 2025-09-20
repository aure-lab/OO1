package ejercicio7;

import java.util.*;

public class esCapicua {
	
	public static boolean verificar (ArrayList<Integer>lista) {
		
		String original="";
		String alReves="";
		
		for (int i : lista) {
			original = original + i;
			alReves = i + alReves;
		}
		
		return original.equals(alReves);
	}

}
