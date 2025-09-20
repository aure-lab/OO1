package ejercicio1;

public class comprendidosEntre {
	
	public static void repetitivo (int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void iterativo (int a, int b) {
		while (a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void recursivo (int a, int b) {
		if (a<=b) {
			System.out.println(a);
			a++;
			comprendidosEntre.recursivo(a, b);
		}	
	}
	
	

}
