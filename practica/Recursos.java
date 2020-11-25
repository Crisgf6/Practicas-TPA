package practica;

import java.util.Locale;
import java.util.ResourceBundle;

public class Recursos {
	private Locale l;
	
	public Recursos(Locale l) {
		this.l = l;
	}
	
	public void setL(Locale l) {
		this.l = l;
	}
	
	public String devolverCadena(String clave) {
		ResourceBundle r = ResourceBundle.getBundle("practica/Bundle", l);
		String traduccion = r.getString(clave);
		return traduccion;
	}
	
}
