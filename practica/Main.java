package practica;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {
		Vector<Hotel> hoteles = new Vector<Hotel>();
		Vector<Usuario> usuarios = new Vector<Usuario>();
		
		//En este pequeño fragmento de codigo, doy la opcion al usuario de seleccionar un idioma para la plataforma.
		int opcnIdioma;
		String country;
		String lang;
		Scanner idm = new Scanner(System.in);
		do {
			System.out.println("1. English");
			System.out.println("2. Español");
			opcnIdioma = idm.nextInt();
		}while(opcnIdioma != 1 && opcnIdioma != 2);
		
		if(opcnIdioma == 1) {
			lang = "en";
			country = "US";
		}
		else{
			lang = "es";
			country = "ES";
		}
		//Creo la variable l y el objeto 'recursos' con parametro l. La clase Recursos contiene el metodo que buscará la cadena en los 'resource bundles' y la devolvera traducida
		Locale l = new Locale(lang, country);
		Recursos recursos = new Recursos(l);
		
		int opcion;
		int opcionALT = 234;
		do {     //El usuario navega por el menu hasta que selecciona la opcion SALIR
			Hotel.menuHotel(recursos);
			Scanner capt = new Scanner(System.in);
			opcion = capt.nextInt();
			switch(opcion) {
			case 1: //Opciones de usuario
				int opcion2;
				do {
					Usuario.menuUsuario(recursos);
					Scanner optn = new Scanner(System.in);
					opcion2 = optn.nextInt();
					switch(opcion2) {
					case 1:  //Opcion que permite al usuario registrarse en la pagina
						Usuario.iniciarSesion(recursos, usuarios);
						System.out.print("\n");
						break;
					
					case 2:  //Muestra todos los usuarios registrados
						Usuario.infoUsuarios(recursos, usuarios);
						
					case 3:
						Usuario.informe(recursos, hoteles);
						break;
						
					case 4:
						Usuario.recuperarContraseña(recursos, usuarios);
						break;
					}
				}while(opcion2 != 5);
				break;
				
			case 2:  //Añadir hotel
				Hotel.inicializarHotel(recursos, hoteles);
				System.out.print("\n");
				break;
				
			case 3:   //Informacion de los hoteles
				Hotel.infoHoteles(recursos, hoteles);
				break;
			
			case 4:    //Reservar habitacion
				Hotel.reservarHabitacion(recursos, hoteles);
				break;
			
			case 5:   //Cancelar reserva
				Hotel.cancelarReserva(recursos, hoteles);
				break;
				
			case 6: //Escribir reseña
				Hotel.escribirReseña(recursos, hoteles);
				break;
				
			case 7: //Funcion que permite al usuario comprobar la existencia de un hotel en la base de datos
				Hotel.buscadorHoteles(recursos, hoteles);
				break;
				
			case 8:
				opcionALT = JOptionPane.showConfirmDialog(null, recursos.devolverCadena("confirmarSalida"), "Exit", JOptionPane.YES_NO_OPTION);
			}
		}while(opcion != 8 && opcionALT != JOptionPane.YES_OPTION);
	}
}