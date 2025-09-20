package ejercicio7;

import java.util.*;

public class InvertirRecursivo {
	
	public static void invertirRecu (ArrayList<Integer> lista) {
		if(lista.size() != 0) {
			int n = 0;
			int dimf = lista.size();
			invertir(n,dimf,lista);
		}
	}

	public static void invertir (int n, int dimf, ArrayList<Integer> lista) {
		int pri = lista.get(n);
		dimf--;
		int ult = lista.get(dimf);
		lista.set(dimf,pri);
		lista.set(n,ult);
		if ((dimf==n)|(dimf-1==n))
			return;
		else 
			{n++;
			invertir(n,dimf,lista);	}
	}
}
