package practica;

import java.util.Vector;

public class Buscador implements IBusqueda{
	private Vector<String> arrayInstancias;
	
	public Buscador(Vector<String> nomHoteles) {
		this.arrayInstancias = nomHoteles;
	}
	
	@Override
	public boolean existe(String clave) {
		int pos = -1;
		for(int i=0;i<arrayInstancias.size();i++) {
			if(clave.equals(arrayInstancias.get(i))) {
				pos = i;
			}
		}
		if(pos != -1){
			return true;
		}
		else {
			return false;
		}
	}
}
