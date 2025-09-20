package ejercicio7;

import java.util.*;

public class sumaRecursiva {
	
	public static int sumarLinkedList(LinkedList<Integer> lista) {
		Iterator <Integer> i = lista.iterator();
		return recursivo(i);
	}
	
	public static int recursivo (Iterator <Integer> i) {
		if(!(i.hasNext())) {
			return 0;
		}
		else
			return i.next()+ recursivo(i);
	}
	
	public static int alternativa (LinkedList<Integer> lista) {
		if((lista.isEmpty()))
			return 0;
		else {
			return lista.removeFirst()+alternativa(lista);
		}
	}

}
