package ejercicio7;

import java.util.*;

public class ordenDosListas {

	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		ArrayList<Integer> merge = new ArrayList<>(lista1);
		for (int i : lista2) {
			int j = 0;
			while ((merge.size()!=j)&&(merge.get(j)<i))
				j++;
			merge.add(j,i);
		}
		return merge;
	}

}
