package practica;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Hotel {
	
	static Vector<Reserva> reservas = new Vector<Reserva>();
	
	//Atributos de la clase hotel
	private String nombre;
	private String direccion;
	private int numEstrellas;
	private int numHabitaciones;
	private double precioNoche;
	private String telefonoContacto;
	private String reseña;
	private double valor;
	
	//método constructor del hotel
	public Hotel(String nombre, String direccion, int numEstrellas, int numHabitacionesDisponibles, double precioNoche, String telefonoContacto, String reseña, double valor) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numEstrellas = numEstrellas;
		this.numHabitaciones = numHabitacionesDisponibles;
		this.precioNoche = precioNoche;
		this.telefonoContacto = telefonoContacto;
		this.reseña = reseña;
		this.valor = valor;
	}
	
	//El método constructor esta sobrecargado
	public Hotel(String nombre, String direccion, int numEstrellas, int numHabitacionesDisponibles, double precioNoche, String telefonoContacto, double valor) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numEstrellas = numEstrellas;
		this.numHabitaciones = numHabitacionesDisponibles;
		this.precioNoche = precioNoche;
		this.telefonoContacto = telefonoContacto;
		this.valor = valor;
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
	
	public double getValor() {
		return valor;
	}
	
	public void setReseña(String reseña) {
		this.reseña = reseña;
	}
	
	//Metodo para mostrar el menu del hotel
	public static void menuHotel(Recursos recursos) {
		//Llamo al metodo devolver cadena de la clase Recursos para traducir la cadena e imprimirla posteriormente
		System.out.println(recursos.devolverCadena("opcn1_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn2_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn3_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn4_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn5_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn6_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn7_menuHotel"));
		System.out.println(recursos.devolverCadena("opcn8_menuHotel"));
	}
	
	//Metodo para añadir hotel (excepto la reseña que es una opcion aparte (simulando que es una opion adicional para el usuiario))
	public static void inicializarHotel(Recursos recursos, Vector<Hotel> hoteles) {
		String nombre = "";
		String direccion = "";
		int numEstrellas = 0;
		int numHabitaciones = 0;
		double precioNoche = 0;
		String telefonoContacto = "";
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print(recursos.devolverCadena("nomHotel"));
		nombre = datos.nextLine();
		
		System.out.print(recursos.devolverCadena("direccHotel"));
		direccion = datos.nextLine();
		
		System.out.print(recursos.devolverCadena("numEstrellas"));
		numEstrellas = datos.nextInt();
		
		System.out.print(recursos.devolverCadena("numHabitaciones"));
		numHabitaciones = datos.nextInt();
		
		System.out.print(recursos.devolverCadena("precioNoche"));
		precioNoche = datos.nextDouble();
		
		System.out.print(recursos.devolverCadena("telefonoContacto"));
		telefonoContacto = datos.nextLine();
		
		double valorHotel = Math.pow(precioNoche,4 );
		
		Hotel hotel = new Hotel(nombre, direccion, numEstrellas, numHabitaciones, precioNoche, telefonoContacto, valorHotel);
		
		hoteles.add(hotel);
	}
	
	//Metodo para la opcion mostrar datos del hotel
	public String mostrarDatos(Recursos recursos) {
		return this.nombre + " " + this.direccion + " " + this.numEstrellas + recursos.devolverCadena("estrellas") + "\n" 
		+ this.numHabitaciones + recursos.devolverCadena("disponibilidad") + this.precioNoche + " " + recursos.devolverCadena("precio") + "\n" + this.telefonoContacto + recursos.devolverCadena("reseña") 
		+ this.reseña + "\n" + recursos.devolverCadena("valorHotel") + " " + this.valor + " $";
	}
	
	//Metodo que muestra todos los datos de los hoteles contenidos en el vector 'hoteles'
	public static void infoHoteles(Recursos recursos, Vector<?> hoteles) {
		for (int i=0; i<hoteles.size(); i++)
			System.out.println(((Hotel) hoteles.get(i)).mostrarDatos(recursos));
			System.out.println("");
	}
	
	public static void reservarHabitacion(Recursos recursos, Vector<?> hoteles) {
		
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
		
		System.out.print(recursos.devolverCadena("hotel_res"));
		tmpNomHotel = opt.nextLine();
		
		System.out.print(recursos.devolverCadena("nomUsuario"));
		tmpNomCliente = opt.nextLine();
		
		System.out.print(recursos.devolverCadena("dni"));
		tmpDni = opt.nextLine();
		
		System.out.print(recursos.devolverCadena("telefono"));
		tmpTelefonoCliente = opt.nextLine();
		
		System.out.print(recursos.devolverCadena("dias"));
		tmpEstancia = opt.nextInt();
		
		for(int i=0; i<hoteles.size(); i++) {  //Comprobamos que el hotel donde el usuario pretende reservar una habitacion exista en la base de datos
			if(((Hotel) hoteles.get(i)).getNombre().equals(tmpNomHotel)) {
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
				System.out.println(recursos.devolverCadena("reservaInvalida"));
			}
			else {
				Reserva tmpReserva = new Reserva(tmpNomHotel, numHabitacion, tmpNomCliente, tmpDni, tmpTelefonoCliente, tmpEstancia);
				reservas.add(tmpReserva);
				System.out.println(recursos.devolverCadena("reservaValida"));
			}
		}
		else
			System.out.println(recursos.devolverCadena("errHotel"));
	}
	
	public static void cancelarReserva(Recursos recursos, Vector<?> hoteles) {
		
		String cancelarHotel = "";
		String cancelarDni = "";
		Scanner msg = new Scanner(System.in);
		int encontrado = -1;

		System.out.print(recursos.devolverCadena("verificarDni"));
		cancelarDni = msg.nextLine();

		System.out.print(recursos.devolverCadena("verificarHotel"));
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
			System.out.println(recursos.devolverCadena("errReserva"));
		}
	}
	
	public static void escribirReseña(Recursos recursos, Vector<?> hoteles) {
		
		String nuevaReseña = "";
		String hotelAOpinar = "";
		Scanner res = new Scanner(System.in);
		int posicion = -1;
		
		System.out.print(recursos.devolverCadena("hotelReseña"));
		hotelAOpinar = res.nextLine();
		
		for(int i=0; i<hoteles.size(); i++) {
			if(((Hotel) hoteles.get(i)).getNombre().equals(hotelAOpinar)){
				posicion = i;
			}
		}
		if(posicion != -1) {
			System.out.print(recursos.devolverCadena("escribirReseña"));
			nuevaReseña = res.nextLine();
			((Hotel) hoteles.get(posicion)).setReseña(nuevaReseña);
		}
		else {
			System.out.println(recursos.devolverCadena("errHotelReseña"));
		}
	}
	
	public static void buscadorHoteles(Recursos recursos, Vector<?> hoteles) {
		
		String nomHotel = "";
		String tmp_name = "";
		Vector<String> nomHoteles = new Vector<String>();
		Scanner cmp = new Scanner(System.in);
		
		System.out.print(recursos.devolverCadena("nom_hotel_busc"));
		nomHotel = cmp.nextLine();
		
		for(int i=0;i<hoteles.size();i++) {
			tmp_name = ((Hotel) hoteles.get(i)).getNombre();
			nomHoteles.add(tmp_name);
		}
		
		Buscador b = new Buscador(nomHoteles);
		
		System.out.println(((b.existe(nomHotel)) ? recursos.devolverCadena("esta") : recursos.devolverCadena("no_esta")));
	}
}