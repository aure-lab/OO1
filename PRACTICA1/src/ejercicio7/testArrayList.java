package ejercicio7;

import java.util.*;

public class testArrayList {

	public static void main(String[] args) {
		
		//ArrayList <Integer> numeros = new ArrayList<> ();
		//Scanner s = new Scanner(System.in);
	
		//int num = s.nextInt();
		//while (num != -99) {
			//numeros.add(num);
			//num = s.nextInt();
		//}
		//for (int i:numeros) {
			//System.out.println(i);
		//}
		//s.close();
		
		//moduloD.metodoD();
	
		//ArrayList<Integer> lista = new ArrayList<> ();
		//lista.add(1);
		//lista.add(2);
		//lista.add(2);
		//lista.add(1);
		
		//System.out.println(esCapicua.verificar(lista));
		
		//List<Integer>sucesion=ejercicioSucesion.calcularSucesion(6);
		//for (int i : sucesion)
			//System.out.println(i);
		
		//ArrayList<Integer> ejH = new ArrayList <> ();
		//ejH.add(1);
		//ejH.add(2);
		//ejH.add(3);
		//ejH.add(4);
		//ejH.add(5);
		//InvertirRecursivo.invertirRecu(ejH);
		//for (int i : ejH)
			//System.out.println(i);
		
		LinkedList<Integer> suma = new LinkedList<>();
		suma.add(1);
		suma.add(2);
		suma.add(3);
		System.out.println(sumaRecursiva.sumarLinkedList(suma));
		//System.out.println(sumaRecursiva.alternativa(suma));
		
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		lista1.add(1);
		lista1.add(3);
		lista1.add(5);
		
		ArrayList <Integer> lista2 = new ArrayList<>();
		lista2.add(0);
		lista2.add(2);
		lista2.add(4);
		lista2.add(6);
		
		System.out.println(ordenDosListas.combinarOrdenado(lista1, lista2));
	}
	
	
	
}
