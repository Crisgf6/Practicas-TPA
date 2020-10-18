package practica_1;

import java.util.Scanner;

public class Hotel {
	
	//Atributos de la clase hotel
	
	private String nombre;
	private String direccion;
	private int numEstrellas;
	private int numHabitacionesDisponibles;
	private double precioNoche;
	private String telefonoContacto;
	private String reseña;
	
	//metodo constructor del hotel
	public Hotel(String nombre, String direccion, int numEstrellas, int numHabitacionesDisponibles, double precioNoche, String telefonoContacto, String reseña) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numEstrellas = numEstrellas;
		this.numHabitacionesDisponibles = numHabitacionesDisponibles;
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
		return this.numHabitacionesDisponibles;
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
		System.out.println("4. Cancelar Reserva");
		System.out.println("5. Escribir Reseña");
		System.out.println("6. Salir");
	}
	
	//Metodo para añadir hotel (excepto la reseña que es una opcion aparte (simulando que es una opion adicional para el usuiario))
	public static void añadirHotel(String nombre, String direccion, int numEstrellas, int numHabitacionesDisponibles, double precioNoche, String telefonoContacto) {
		
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
	}
	
	//Metodo para la opcion mostrar datos del hotel
		public String mostrarDatos() {
			return this.nombre + " " + this.direccion + " " + this.numEstrellas + "-Estrellas \n" 
			+ this.numHabitacionesDisponibles + "-Habitaciones Disponibles a " + this.precioNoche + " euros la noche" + "\n" + this.telefonoContacto + "Reseña: " + this.reseña;
		}
}
