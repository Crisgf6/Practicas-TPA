package practica_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Vector;

public class Usuario {
	
	static Vector<Usuario> usuarios = new Vector<Usuario>();
	
	private String email;
	private String contrase�a;
	private LocalDate fechaInicio;
	
	public Usuario(String email, String contrase�a, LocalDate fechaInicio) {
		this.email = email;
		this.contrase�a = contrase�a;
		this.fechaInicio = fechaInicio;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	public void setEamil(String email) {
		this.email = email;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public static void menuUsuario(Locale l) { //opcion que depliega un menu con opciones relevantes al usuario
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("opcn1_menuUsuario");
		String clave2 = r.getString("opcn2_menuUsuario");
		String clave3 = r.getString("opcn3_menuUsuario");
		
		System.out.println(clave);
		System.out.println(clave2);
		System.out.println(clave3);
	}
	
	public static void iniciarSesion(Locale l) { //metodo que permite al usuario iniciar sesion. Pidiendole un email y una contrase�a y mostrando un error en caso de detectar coincidencia con otro email
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("introducir_email");
		String clave2 = r.getString("introducir_contrase�a");
		String clave3 = r.getString("usuario_registrado");
		
		int pos = -1;
		String email = "";
		String contrase�a = "";
		LocalDate fechaHoy = LocalDate.now();
		
		Scanner selec = new Scanner(System.in);
		
		System.out.print(clave);
		email = selec.nextLine();
		
		System.out.print(clave2);
		contrase�a = selec.nextLine();
		
		for(int i = 0; i<usuarios.size(); i++) {  //Comprobamos que no haya un usuario registrado con ese email
			if(usuarios.get(i).getEmail().equals(email)) {
				pos = i;
			}
		}
		if(pos != -1) {
			System.out.println(clave3);
		}
		else {
			Usuario usuario = new Usuario(email, contrase�a, fechaHoy);
			usuarios.add(usuario);
		}
	}
	
	public String mostrarDatosU(Locale l) {
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("usuario");
		String clave2 = r.getString("inicio_sesion");
		
		return clave + this.email + "\t" + clave2 + this.fechaInicio;
	}
	
	//Metodo que muestra todos los usuarios contenidos en el vector 'usuarios'
	public static void infoUsuarios(Locale l) {
		for (int i=0; i<usuarios.size(); i++)
			System.out.println(usuarios.get(i).mostrarDatosU(l));
			System.out.println("");
	}
}