package practica_1;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {	
		
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
		//Creo la variable l la cual pasare a los distintos metodos mas adelante
		Locale l = new Locale(lang, country);
		
		int opcion;
		int opcionALT = 234;
		do {     //El usuario navega por el menu hasta que selecciona la opcion SALIR
			Hotel.menuHotel(l);
			Scanner capt = new Scanner(System.in);
			opcion = capt.nextInt();
			switch(opcion) {
			case 1: //Opciones de usuario
				int opcion2;
				do {
					Usuario.menuUsuario(l);
					Scanner optn = new Scanner(System.in);
					opcion2 = optn.nextInt();
					switch(opcion2) {
					case 1:  //Opcion que permite al usuario registrarse en la pagina
						Usuario.iniciarSesion(l);
						System.out.print("\n");
						break;
					
					case 2:  //Muestra todos los usuarios registrados
						Usuario.infoUsuarios(l);
					}
				}while(opcion2 != 3);
				break;
				
			case 2:  //Añadir hotel
				Hotel.inicializarHotel(l);
				System.out.print("\n");
				break;
				
			case 3:   //Informacion de los hoteles
				Hotel.infoHoteles(l);
				break;
			
			case 4:    //Reservar habitacion
				Hotel.reservarHabitacion(l);
				break;
			
			case 5:   //Cancelar reserva
				Hotel.cancelarReserva(l);
				break;
				
			case 6: //Escribir reseña
				Hotel.escribirReseña(l);
				break;
				
			case 7:
				ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
				String clave = r.getString("confirmarSalida");
				opcionALT = JOptionPane.showConfirmDialog(null, clave, "Exit", JOptionPane.YES_NO_OPTION);
			}
		}while(opcion != 7 && opcionALT != JOptionPane.YES_OPTION);
	}
}