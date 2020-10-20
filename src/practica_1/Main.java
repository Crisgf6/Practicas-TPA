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
				int numHabitaciones = 0;
				double precioNoche = 0;
				String telefonoContacto = "";
				
				hoteles.add(Hotel.inicializarHotel(nombre, direccion, numEstrellas, numHabitaciones, precioNoche, telefonoContacto));
				System.out.print("\n");
				break;
				
			case 2:   //Informacion de los hoteles
				for (int i=0; i<hoteles.size(); i++)
					System.out.println(hoteles.get(i).mostrarDatos());
					System.out.println("");
				break;
			
			case 3:    //Reservar habitacion
				String tmpNomHotel = "";
				String tmpNomCliente = "";
				String tmpDni = "";
				String tmpTelefonoCliente = "";
				int tmpEstancia = 0;
				Random rand = new Random();
				int limite = 200;
				int numHabitacion = rand.nextInt(limite);
				int pos = -1;
				Scanner opt = new Scanner(System.in);
				
				//Reserva.reservar(nomHotel, numHabitacion, nomCliente, dni, telefonoCliente, estancia);
				
				System.out.print("¿En que hotel desea hospedarse?: ");
				tmpNomHotel = opt.nextLine();
				
				System.out.print("¿A que nombre quedara tramitada la reserva?: ");
				tmpNomCliente = opt.nextLine();
				
				System.out.print("Introduzca su documento de identidad: ");
				tmpDni = opt.nextLine();
				
				System.out.print("Introduzca su telefono de contacto: ");
				tmpTelefonoCliente = opt.nextLine();
				
				System.out.print("Introduzca el numero de dias que quedara hospedado: ");
				tmpEstancia = opt.nextInt();
				
				Reserva tmpReserva = new Reserva(tmpNomHotel, numHabitacion, tmpNomCliente, tmpDni, tmpTelefonoCliente, tmpEstancia);
				
				for(int i=0; i<hoteles.size(); i++) {  //Comprobamos que el hotel donde el usuario pretende reservar una habitacion exista en la base de datos
					if(hoteles.get(i).getNombre().equals(tmpNomHotel)) {
						pos = i;
					}
				}
				if(pos != -1) {  //Si pos es distinto de -1 querra decir que el hotel donde el usuario pretende hacer la reserva existe en la base de datos
					reservas.add(tmpReserva);
					System.out.println("Gracias por su reserva!");
				}
				else
					System.out.println("No exixte el hotel que busca en nuestra base de datos.");
				
				break;
				
			case 4: //Escribir reseña
				String nuevaReseña = "";
				String hotelAOpinar = "";
				Scanner res = new Scanner(System.in);
				int posicion = -1;
				
				System.out.print("Introduzca el nombre del hotel sobre el que escribir la reseña: ");
				hotelAOpinar = res.nextLine();
				
				for(int i=0; i<hoteles.size(); i++) {
					if(hoteles.get(i).getNombre().equals(hotelAOpinar)){
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
		}while(opcion!=5);
	}
}
