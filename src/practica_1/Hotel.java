package practica_1;

import java.util.Scanner;

public class Hotel {
	
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
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getNumEstrellas() {
		return this.numEstrellas;
	}
	
	public int getNumHabitacionesDisponibles() {
		return this.numHabitaciones;
	}
	
	public double getPrecioNoche() {
		return this.precioNoche;
	}
	
	public String getTelefonoContacto() {
		return this.telefonoContacto;
	}
	
	public String getReseña() {
		return this.reseña;
	}
	
	public void setReseña(String reseña) {
		this.reseña = reseña;
	}
	
	//Metodo para mostrar el menu del hotel
	public static void menuHotel() {
		System.out.println("1. Añadir Hotel");
		System.out.println("2. Informacion de los Hoteles");
		System.out.println("3. Reservar Habitación");
		System.out.println("4. Escribir Reseña");
		System.out.println("5. Salir");
	}
	
	//Metodo para añadir hotel (excepto la reseña que es una opcion aparte (simulando que es una opion adicional para el usuiario))
	public static Hotel inicializarHotel(String nombre, String direccion, int numEstrellas, int numHabitacionesDisponibles, double precioNoche, String telefonoContacto) {
		
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Introduce el nombre del hotel: ");
		nombre = datos.nextLine();
		
		System.out.print("Introduce la direccion del hotel: ");
		direccion = datos.nextLine();
		
		System.out.print("Introduce el numero de estrellas: ");
		numEstrellas = datos.nextInt();
		
		System.out.print("Introduce el numero de habitaicones disponibles: ");
		numHabitacionesDisponibles = datos.nextInt();
		
		System.out.print("Introduce el precio por noche: ");
		precioNoche = datos.nextDouble();
		
		System.out.print("Introduce el telefono de contacto: ");
		telefonoContacto = datos.nextLine();
		
		Hotel tmpHotel = new Hotel(nombre, direccion, numEstrellas, numHabitacionesDisponibles, precioNoche, telefonoContacto, "");
		return tmpHotel;
	}
	
	//Metodo para la opcion mostrar datos del hotel
		public String mostrarDatos() {
			return this.nombre + " " + this.direccion + " " + this.numEstrellas + "-Estrellas \n" 
			+ this.numHabitaciones + "-Habitaciones Disponibles a " + this.precioNoche + " euros la noche" + "\n" + this.telefonoContacto + "Reseña: " + this.reseña;
		}
}
