package ejercicio5;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec [] = {5,2,3,4,5,6,7};
		
		recorriendoVec.metodoTres(vec);
		System.out.println(recorriendoVec.reultado);
		
		System.out.println(recorriendoVec.procesandoDatosReturn(vec).getMin());
		
		calculadora calc2 = new calculadora();
		recorriendoVec.procesandoDatosParametro(vec, calc2);
		System.out.println(calc2.getMin());
		
		
	}

}
