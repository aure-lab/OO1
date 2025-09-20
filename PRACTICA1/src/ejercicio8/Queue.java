package ejercicio8;

import java.util.*;

public class Queue <T> {
	private List <T> data;
	
	public Queue() {
		this.data = new LinkedList <T>();
	}
	
	public void enqueue (T dato) {
		this.data.add(dato);
	}
	
	public T denqueue () {
		return this.data.remove(0);
	}
	
	public T head () {
		return this.data.get(0);
	}
	
	public int size() {
		return this.data.size();
	}
	
	public Boolean isEmpty() {
		return this.data.isEmpty();
	}
	
	@Override
	public String toString () {
		String str = "";
		for (T i : this.data) {
			str += i;
		}
		return str;
	}
	
	
}
