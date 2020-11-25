package practica;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;

public class Usuario {
	
	private String email;
	private String contraseña;
	private LocalDate fechaInicio;
	
	public Usuario(String email, String contraseña, LocalDate fechaInicio) {
		this.email = email;
		this.contraseña = contraseña;
		this.fechaInicio = fechaInicio;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public static void menuUsuario(Recursos recursos) { //Opcion que depliega un menu con opciones relevantes al usuario
		System.out.println(recursos.devolverCadena("opcn1_menuUsuario"));
		System.out.println(recursos.devolverCadena("opcn2_menuUsuario"));
		System.out.println(recursos.devolverCadena("opcn3_menuUsuario"));
	}
	
	public static void iniciarSesion(Recursos recursos, Vector<Usuario> usuarios) { //metodo que permite al usuario iniciar sesion. Pidiendole un email y una contraseña y mostrando un error en caso de detectar coincidencia con otro email
		
		int pos = -1;
		String email = "";
		String contraseña = "";
		LocalDate fechaHoy = LocalDate.now();
		
		Scanner selec = new Scanner(System.in);
		
		System.out.print(recursos.devolverCadena("introducir_email"));
		email = selec.nextLine();
		
		System.out.print(recursos.devolverCadena("introducir_contraseña"));
		contraseña = selec.nextLine();
		
		for(int i = 0; i<usuarios.size(); i++) {  //Comprobamos que no haya un usuario registrado con ese email
			if(((Usuario) usuarios.get(i)).getEmail().equals(email)) {
				pos = i;
			}
		}
		if(pos != -1) {
			System.out.println(recursos.devolverCadena("usuario_registrado"));
		}
		else {
			Usuario usuario = new Usuario(email, contraseña, fechaHoy);
			usuarios.add(usuario);
		}
	}
	
	public String mostrarDatosU(Recursos recursos) {
		return recursos.devolverCadena("usuario") + this.email + "\t" + recursos.devolverCadena("inicio_sesion") + this.fechaInicio;
	}
	
	//Metodo que muestra todos los usuarios contenidos en el vector 'usuarios'
	public static void infoUsuarios(Recursos recursos, Vector<?> usuarios) {
		for (int i=0; i<usuarios.size(); i++)
			System.out.println(((Usuario) usuarios.get(i)).mostrarDatosU(recursos));
			System.out.println("");
	}
}