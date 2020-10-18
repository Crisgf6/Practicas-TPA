package practica_1;

import java.util.Scanner;

public class Reserva extends Habitacion{
	
	//Atributos de la clase reserva
	private String nomCliente;
	private String dni;
	private String telefonoCliente;
	private int estancia;
	
	///Metodo constructor de la reserva
	public Reserva (String hotel, int numero, String  nomCliente, String dni, String telefonoCliente, int estancia) {
		super(hotel, numero);
		this.nomCliente = nomCliente;
		this.telefonoCliente = telefonoCliente;
		this.estancia = estancia;
	}
	
	public String getNomCliente() {
		return this.nomCliente;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public String getTelefonoCliente() {
		return this.telefonoCliente;
	}
	
	public int getEstancia() {
		return this.estancia;
	}
	
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	
	public void setEstancia(int estancia) {
		this.estancia = estancia;
	}
	
	public static void reservar(String nomHotel, String nomCliente, String dni, String telefonoCliente, int estancia) {
		
		Scanner capt = new Scanner(System.in);
		
		System.out.print("¿En que hotel desea hospedarse?: ");
		nomHotel = capt.nextLine();
	
		System.out.print("¿A que nombre quedara tramitada la reserva?: ");
		nomCliente = capt.nextLine();
		
		System.out.print("Introduzca su documento de identidad: ");
		dni = capt.nextLine();
		
		System.out.print("Introduzca su telefono de contacto: ");
		telefonoCliente = capt.nextLine();
		
		System.out.print("Introduzca el numero de dias que quedara hospedado: ");
		estancia = capt.nextInt();
	}


}
