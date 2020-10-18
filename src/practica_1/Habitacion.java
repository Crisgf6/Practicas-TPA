package practica_1;

public class Habitacion {
	
	//Atributos de la clase habiacion
	private String hotel;
	private int numero;
	
	//Metodo constructor
	public Habitacion(String hotel, int numero) {
		this.hotel = hotel;
		this.numero = numero;
	}
	
	public String getHotel() {
		return this.hotel;
	}
	
	public int getNumero() {
		return this.numero;
	}
}
