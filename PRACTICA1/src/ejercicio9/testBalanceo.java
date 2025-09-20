package ejercicio9;

public class testBalanceo {

	public static Boolean verificar (String str) {
		Stack <Character> pila = new Stack<>();
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if((c == '(' )|(c == '{')|(c == '['))
				pila.push(c);
			else
				if (!pila.isEmpty()) {
					char v= pila.pop();
					if((c == ')')&&(v != '('))
						return false;
					else
						if((c == ']')&&(v != '['))
							return false;
						else
							if((c == '}')&&(v != '{'))
								return false;
				}
				else
					return false;				
		}
		return pila.isEmpty();					
		}
	}

