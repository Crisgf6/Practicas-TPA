package practica_1;

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
		this.dni = dni;
		this.telefonoCliente = telefonoCliente;
		this.estancia = estancia;
	}
	
	public String getNomCliente() {
		return nomCliente;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	
	public int getEstancia() {
		return estancia;
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
}