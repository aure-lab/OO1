package ejercicio3;

public class test {
	
	public static void main () {
		estudiante [] est = new estudiante [2];
		profesor [] prof = new profesor [3];
		
		est[0] = new estudiante("pepe","fernandez","pepe@gmail.com",4,"calle 5");
		est[1] = new estudiante("juan","perez","juan@gmail.com",5,"calle 1");
		
		prof[0] = new profesor("mongoreto","flores","mongoreto@gmail.com","php","UNLP");
		prof[1] = new profesor("roberto","gomez","rob@gmail.com","Phyton","UNLP");
		prof[2] = new profesor("nadie","nada","nadie@gmail.com","nulo","vacio");
		
		System.out.println("\\\\\\\\\\\\\\\\\\ESTUDIANTES\\\\\\\\\\\\\\\\\\\\\\\\");
		for (estudiante alum: est) {
			System.out.println(alum.tusDatos());
		}
		System.out.println("\\\\\\\\\\\\\\\\\\PROFESORES\\\\\\\\\\\\\\\\\\\\\\\\");
		for (profesor profe: prof) {
			System.out.println(profe.tusDatos());
		}
	}
}
