package practica_1;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Vector;

public class Hotel {
	
	static Vector<Hotel> hoteles = new Vector<Hotel>();
	static Vector<Reserva> reservas = new Vector<Reserva>();
	
	//Atributos de la clase hotel
	
	private String nombre;
	private String direccion;
	private int numEstrellas;
	private int numHabitaciones;
	private double precioNoche;
	private String telefonoContacto;
	private String reseña;
	
	//metodo constructor del hotel
	public Hotel(String nombre, String direccion, int numEstrellas, int numHabitacionesDisponibles, double precioNoche, String telefonoContacto, String reseña) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numEstrellas = numEstrellas;
		this.numHabitaciones = numHabitacionesDisponibles;
		this.precioNoche = precioNoche;
		this.telefonoContacto = telefonoContacto;
		this.reseña = reseña;
	}
	
	//Metodos get y metodo set
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getNumEstrellas() {
		return numEstrellas;
	}
	
	public int getNumHabitacionesDisponibles() {
		return numHabitaciones;
	}
	
	public double getPrecioNoche() {
		return precioNoche;
	}
	
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	
	public String getReseña() {
		return reseña;
	}
	
	public void setReseña(String reseña) {
		this.reseña = reseña;
	}
	
	//Metodo para mostrar el menu del hotel
	public static void menuHotel(Locale l) {
		//Tanto aqui como en el resto de metodos que imprimen una cadena por pantalla, creo 
		//la variable 'clave' con la que busco en el archivo de propiedades correspondiente al idioma la cadena que quiero imprimir 
		//Este mismo concepto se repite de la misma menera en todo el programa
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("opcn1_menuHotel");
		String clave2 = r.getString("opcn2_menuHotel");
		String clave3 = r.getString("opcn3_menuHotel");
		String clave4 = r.getString("opcn4_menuHotel");
		String clave5 = r.getString("opcn5_menuHotel");
		String clave6 = r.getString("opcn6_menuHotel");
		String clave7 = r.getString("opcn7_menuHotel");
		
		System.out.println(clave);
		System.out.println(clave2);
		System.out.println(clave3);
		System.out.println(clave4);
		System.out.println(clave5);
		System.out.println(clave6);
		System.out.println(clave7);
	}
	
	//Metodo para añadir hotel (excepto la reseña que es una opcion aparte (simulando que es una opion adicional para el usuiario))
	public static void inicializarHotel(Locale l) {
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("nomHotel");
		String clave2 = r.getString("direccHotel");
		String clave3 = r.getString("numEstrellas");
		String clave4 = r.getString("numHabitaciones");
		String clave5 = r.getString("precioNoche");
		String clave6 = r.getString("telefonoContacto");
		
		String nombre = "";
		String direccion = "";
		int numEstrellas = 0;
		int numHabitaciones = 0;
		double precioNoche = 0;
		String telefonoContacto = "";
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print(clave);
		nombre = datos.nextLine();
		
		System.out.print(clave2);
		direccion = datos.nextLine();
		
		System.out.print(clave3);
		numEstrellas = datos.nextInt();
		
		System.out.print(clave4);
		numHabitaciones = datos.nextInt();
		
		System.out.print(clave5);
		precioNoche = datos.nextDouble();
		
		System.out.print(clave6);
		telefonoContacto = datos.nextLine();
		
		Hotel hotel = new Hotel(nombre, direccion, numEstrellas, numHabitaciones, precioNoche, telefonoContacto, "");
		
		hoteles.add(hotel);
	}
	
	//Metodo para la opcion mostrar datos del hotel
	public String mostrarDatos(Locale l) {
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("estrellas");
		String clave2 = r.getString("disponibilidad");
		String clave3 = r.getString("precio");
		String clave4 = r.getString("reseña");
		
		return this.nombre + " " + this.direccion + " " + this.numEstrellas + clave + "\n" 
		+ this.numHabitaciones + clave2 + this.precioNoche + " " + clave3 + "\n" + this.telefonoContacto + clave4 + this.reseña;
	}
	
	//Metodo que muestra todos los datos de los hoteles contenidos en el vector 'hoteles'
	public static void infoHoteles(Locale l) {
		for (int i=0; i<hoteles.size(); i++)
			System.out.println(hoteles.get(i).mostrarDatos(l));
			System.out.println("");
	}
	
	public static void reservarHabitacion(Locale l) {
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("hotel_res");
		String clave2 = r.getString("nomUsuario");
		String clave3 = r.getString("dni");
		String clave4 = r.getString("telefono");
		String clave5 = r.getString("dias");
		String clave6 = r.getString("reservaValida");
		String clave7 = r.getString("reservaInvalida");
		String clave8 = r.getString("errHotel");
		
		String tmpNomHotel = "";
		String tmpNomCliente = "";
		String tmpDni = "";
		String tmpTelefonoCliente = "";
		int tmpEstancia = 0;
		Random rand = new Random();
		int limite = 200;
		int numHabitacion = rand.nextInt(limite);
		int pos = -1;
		int pos2 = -1;
		Scanner opt = new Scanner(System.in);
		
		//Reserva.reservar(nomHotel, numHabitacion, nomCliente, dni, telefonoCliente, estancia);
		
		System.out.print(clave);
		tmpNomHotel = opt.nextLine();
		
		System.out.print(clave2);
		tmpNomCliente = opt.nextLine();
		
		System.out.print(clave3);
		tmpDni = opt.nextLine();
		
		System.out.print(clave4);
		tmpTelefonoCliente = opt.nextLine();
		
		System.out.print(clave5);
		tmpEstancia = opt.nextInt();
		
		for(int i=0; i<hoteles.size(); i++) {  //Comprobamos que el hotel donde el usuario pretende reservar una habitacion exista en la base de datos
			if(hoteles.get(i).getNombre().equals(tmpNomHotel)) {
				pos = i;
			}
		}
		if(pos != -1) {  //Si pos es distinto de -1 querra decir que el hotel donde el usuario pretende hacer la reserva existe en la base de datos
			for(int j=0; j<reservas.size(); j++) {            //Comprobamos que que el usuario no haya hecho ya una reserva en el mismo hotel (mismo hotel + mismo dni)
				if(reservas.get(j).getHotel().equals(tmpNomHotel) && reservas.get(j).getDni().equals(tmpDni)) {
					pos2 = j;
				}
			}
			if(pos2 != -1) {     //Si pos2 es distinto de -1 significa que ya hay una reserva en ese hotel con el dni en cuestion
				System.out.println(clave7);
			}
			else {
				Reserva tmpReserva = new Reserva(tmpNomHotel, numHabitacion, tmpNomCliente, tmpDni, tmpTelefonoCliente, tmpEstancia);
				reservas.add(tmpReserva);
				System.out.println(clave6);
			}
		}
		else
			System.out.println(clave8);
	}
	
	public static void cancelarReserva(Locale l) {
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("verificarDni");
		String clave2 = r.getString("verificarHotel");
		String clave3 = r.getString("errReserva");
		
		String cancelarHotel = "";
		String cancelarDni = "";
		Scanner msg = new Scanner(System.in);
		int encontrado = -1;

		System.out.print(clave);
		cancelarDni = msg.nextLine();

		System.out.print(clave2);
		cancelarHotel = msg.nextLine();

		for(int i=0; i<reservas.size(); i++) {  //Recorremos vector de reservas hasta que encontremos la reserva con el hotel y el dni que ha introducido el usuario
			if(reservas.get(i).getHotel().equals(cancelarHotel) && reservas.get(i).getDni().equals(cancelarDni)) {
				encontrado = i;
			}
		}
		if(encontrado != -1) {
			reservas.remove(encontrado);
		}
		else {
			System.out.println(clave3);
		}
	}
	
	public static void escribirReseña(Locale l) {
		ResourceBundle r = ResourceBundle.getBundle("practica_1/Bundle", l);
		String clave = r.getString("hotelReseña");
		String clave2 = r.getString("escribirReseña");
		String clave3 = r.getString("errHotelReseña");
		
		String nuevaReseña = "";
		String hotelAOpinar = "";
		Scanner res = new Scanner(System.in);
		int posicion = -1;
		
		System.out.print(clave);
		hotelAOpinar = res.nextLine();
		
		for(int i=0; i<hoteles.size(); i++) {
			if(hoteles.get(i).getNombre().equals(hotelAOpinar)){
				posicion = i;
			}
		}
		if(posicion != -1) {
			System.out.print(clave2);
			nuevaReseña = res.nextLine();
			hoteles.get(posicion).setReseña(nuevaReseña);
		}
		else {
			System.out.println(clave3);
		}
	}
}