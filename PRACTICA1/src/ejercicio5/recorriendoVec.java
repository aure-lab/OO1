package ejercicio5;

public class recorriendoVec {
	static String reultado;

	public static calculadora procesandoDatosReturn (int [] vec) {
		int max = -1;
		int min = 999;
		double promedio = 0;
		
		for (int i : vec) {
			if(i>max)
				max = i;
			if(i<min)
				min = i;
			promedio += i;
		}
		if (vec.length>0)
			promedio = promedio/vec.length;
		calculadora calc = new calculadora (min,max,promedio);
		return calc;
	}
	
	public static void procesandoDatosParametro (int [] vec, calculadora calc) {
		int max = -1;
		int min = 999;
		double promedio = 0;
		
		for (int i : vec) {
			if(i>max)
				max = i;
			if(i<min)
				min = i;
			promedio += i;
		}
		if (vec.length>0)
			promedio = promedio/vec.length;
		calc.setMax(max);
		calc.setMin(min);
		calc.setPromedio(promedio);
	}
	
	public static void metodoTres (int [] vec) {
		calculadora calc = recorriendoVec.procesandoDatosReturn(vec);
		recorriendoVec.setRes(calc.toString());
	}
	
	private static void setRes (String todo) {
		recorriendoVec.reultado = todo;
	}

}
