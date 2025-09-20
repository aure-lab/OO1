package ejercicio9;

import java.util.*;

public class Stack <T> {
	private List<T> data;
	
	public Stack () {
		data = new ArrayList<T>();
	}
	
	public void push (T elem) {
		data.add(data.size(), elem);
	}
	
	public T pop () {
		return data.remove(data.size()-1);
	}
	
	public T top () {
		return data.get(data.size()-1);
	}
	
	public int size () {
		return data.size();
	}
	
	public Boolean isEmpty () {
		return data.isEmpty();
		
	}
	
	@Override
	public String toString () {
		String str = "";
		for (T i : data)
			str += i;
		return str;
	}
}
