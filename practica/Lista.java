package practica;

import java.util.Vector;

public class Lista<T> {
	private Vector<T> lista;
	
	public Lista() {
		this.lista = new  Vector<T>();
	}
	
	public void insertar(T e) {
		this.lista.add(e);
	}
	
	public String toString() {
		String s = "{";
		
		for (T e : this.lista)
			s = s + e + ",";
		
		s = s + "}";
		return s;
	}
}
