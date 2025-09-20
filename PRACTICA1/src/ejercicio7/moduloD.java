package ejercicio7;

import java.util.ArrayList;

public class moduloD {
	
	public static void imprimir (ArrayList<estudiante>lista) {
		for (estudiante i : lista) 
			System.out.println(i);
	}
	
	public static void metodoD () {
		estudiante est1 = new estudiante ("juan",123);
		estudiante est2 = new estudiante ("pepe",321);
		estudiante est3 = new estudiante ("robreto",555);
	
		ArrayList <estudiante> lista = new ArrayList<> ();
	
		lista.add(est1);
		lista.add(est2);
		lista.add(est3);
		
		ArrayList <estudiante> listaCopiada = new ArrayList <estudiante> ();
		listaCopiada.addAll(lista);
		moduloD.imprimir(lista);
	
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		moduloD.imprimir(listaCopiada);
	
		lista.get(0).setLegajo(0);
		estudiante est4 = new estudiante("fran",111);
		if (lista.contains(est4))
			lista.add(est4);
	
		System.out.println("\\MODIFICO LA LISTA ORIGINAL\\");
		moduloD.imprimir(lista);
	
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		moduloD.imprimir(listaCopiada);	
	}
	

}
