package practica_1;

import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Vector<Hotel> hoteles = new Vector<Hotel>();
		Vector<Reserva> reservas = new Vector<Reserva>();
		Scanner capt = new Scanner(System.in);
		
		int opcion;
		do {     //El usuario navega por el menu hasta que selecciona la opcion SALIR
			Hotel.menuHotel();
			opcion = capt.nextInt();
			switch(opcion) {
			case 1:  //Añadir hotel
				String nombre = "";
				String direccion = "";
				int numEstrellas = 0;
				int numHabitacionesDisponibles = 0;
				double precioNoche = 0;
				String telefonoContacto = "";
				
				Hotel.añadirHotel(nombre, direccion, numEstrellas, numHabitacionesDisponibles, precioNoche, telefonoContacto);
				hoteles.add(new Hotel(nombre, direccion, numEstrellas, numHabitacionesDisponibles, precioNoche, telefonoContacto, ""));
				break;
				
			case 2:   //Informacion de los hoteles
				for (int i=0; i<hoteles.size(); i++)
					System.out.println(hoteles.get(i).mostrarDatos());
					System.out.println("");
				break;
			
			case 3:    //Reservar habitacion
				String nomHotel = "";
				String nomCliente = "";
				String dni = "";
				String telefonoCliente = "";
				int estancia = 0;
				Random rand = new Random();
				int limite = 200;
				int numHabitacion = rand.nextInt(limite);
				int pos = -1;
				int pos2 = -1;
				
				Reserva.reservar(nomHotel, nomCliente, dni, telefonoCliente, estancia);
				for(int i=0; i<hoteles.size(); i++) {                //Comprobamos que el hotel donde el usuario pretende reservar una habitacion exista en la base de datos
					if(hoteles.get(i).getNombre() == nomHotel) {
						pos = i;
					}
				}
				if(pos != -1) {      //Si pos es distinto de -1 querra decir que el hotel donde el usuario pretende hacer la reserva existe en la base de datos
					for(int j=0; j<reservas.size(); j++) {            //Comprobamos que que el usuario no haya hecho ya una reserva en el mismo hotel (mismo hotel + mismo dni)
						if(reservas.get(j).getHotel() == nomHotel && reservas.get(j).getDni() == dni) {
							pos2 = -1;
						}
						else {
							pos2 = j;
						}
					}
					if(pos2 != -1) {     //Si pos2 es distinto de -1 significa que no hay ninguna reserva en ese hotel con el dni en cuestion y se procedera a hacer la reserva
						reservas.add(new Reserva(nomHotel, numHabitacion, nomCliente, dni, telefonoCliente, estancia));
					}
					else if(pos2 == -1) {
						System.out.println("Ya hay una reserva suya en este hotel!");
					}
				}
				else
					System.out.println("No exixte el hotel que busca en nuestra base de datos.");
				
				break;
				
			case 4:   //Cancelar reserva
				String cancelarHotel = "";
				String cancelarDni = "";
				Scanner msg = new Scanner(System.in);
				int encontrado = -1;
				
				System.out.print("Introduzca su documento de identidad: ");
				cancelarDni = msg.nextLine();
				
				System.out.print("Introduzca el hotel donde quiere cancelar su reserva: ");
				cancelarHotel = msg.nextLine();
				
				for(int i=0; i<reservas.size(); i++) {  //Recorremos vector de reservas hasta que encontremos la reserva con el hotel y el dni que ha introducido el usuario
					if(reservas.get(i).getHotel() == cancelarHotel && reservas.get(i).getDni() == cancelarDni) {
						encontrado = i;
					}
				}
				if(encontrado != -1) {
					reservas.remove(encontrado);
				}
				else {
					System.out.println("No existe dicha reserva.");
				}
				break;
				
			case 5: //Escribir reseña
				String nuevaReseña = "";
				String hotelAOpinar = "";
				Scanner res = new Scanner(System.in);
				int posicion = -1;
				
				System.out.print("Introduzca el nombre del hotel sobre el que escribir la reseña: ");
				hotelAOpinar = res.nextLine();
				
				for(int i=0; i<hoteles.size(); i++) {
					if(hoteles.get(i).getNombre() == hotelAOpinar) {
						posicion = i;
					}
				}
				if(posicion != -1) {
					System.out.print("Por favor, denos su opinion acerca del hotel o sus servicios: ");
					nuevaReseña = res.nextLine();
					hoteles.get(posicion).setReseña(nuevaReseña);
				}
				else {
					System.out.println("Lo siento, no existe en nuestra base de datos el hotel que busca.");
				}
			}
		}while(opcion!=6);
	}
}
