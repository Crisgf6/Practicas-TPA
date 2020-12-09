package practica;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.Vector;

import org.junit.jupiter.api.Test;

class TestPrograma {
	Hotel hotelPrueba = new Hotel("melia", "calle 3", 3, 566, 30, "603 527 119", "", Math.pow(30,4));
	Reserva reservaPrueba = new Reserva("melia", 45, "Cristobal", "48775278Y", "603 527 119", 5);
	Usuario usuarioPrueba = new Usuario("cristobalgf2000@gmail.com", "Contraseña1234", LocalDate.now());
	
	@Test
	public void testNomHotel(){
		String resultado = hotelPrueba.getNombre();
		String esperado = "melia";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testDireccionHotel() {
		String resultado = hotelPrueba.getDireccion();
		String esperado = "calle 3";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testNumEstrellasHotel() {
		int resultado = hotelPrueba.getNumEstrellas();
		int esperado = 3;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testNumHabitacionesHotel() {
		int resultado = hotelPrueba.getNumHabitacionesDisponibles();
		int esperado = 566;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testPrecioNocheHotel() {
		double resultado = hotelPrueba.getPrecioNoche();
		double esperado = 30;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testTelefonoContactoHotel(){
		String resultado = hotelPrueba.getTelefonoContacto();
		String esperado = "603 527 119";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testValorHotel() {
		double resultado = hotelPrueba.getValor();
		double esperado = Math.pow(hotelPrueba.getPrecioNoche(),4);
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testHotelReserva() {
		String resultado = reservaPrueba.getHotel();
		String esperado = "melia";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testNumeroHabitacion() {
		int resultado = reservaPrueba.getNumero();
		int esperado = 45;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testNomClienteReserva() {
		String resultado = reservaPrueba.getNomCliente();
		String esperado = "Cristobal";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testDniReserva() {
		String resultado = reservaPrueba.getDni();
		String esperado = "48775278Y";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testTelefonoClienteReserva() {
		String resultado = reservaPrueba.getTelefonoCliente();
		String esperado = "603 527 119";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testEstanciaReserva() {
		int resultado = reservaPrueba.getEstancia();
		int esperado = 5;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testEmailUsuario() {
		String resultado = usuarioPrueba.getEmail();
		String esperado = "cristobalgf2000@gmail.com";;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testContraseñaUsuario() {
		String resultado = usuarioPrueba.getContraseña();
		String esperado = "Contraseña1234";;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testCambiarEmail() {
		usuarioPrueba.setEmail("emaildeprueba@gmail.com");
		String resultado = usuarioPrueba.getEmail();
		String esperado = "emaildeprueba@gmail.com";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testCambiarContraseña() {
		usuarioPrueba.setContraseña("contraseñaPrueba1234");
		String resultado = usuarioPrueba.getContraseña();
		String esperado = "contraseñaPrueba1234";
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testComprobarReservas() {
		Reserva reservaNueva = new Reserva("melia", 34, "Cristobal", "25698426J", "665 254 112", 5);
		assertNotSame(reservaNueva,reservaPrueba);
	}
	
	@Test
	public void testInterfaz() {
		String clave = "Juan";
		Vector<String> vectorClaves = new Vector<String>();
		vectorClaves.add("Alex");
		vectorClaves.add("Maria");
		vectorClaves.add("Jorge");
		vectorClaves.add("Gonzalo");
		vectorClaves.add("David");
		vectorClaves.add("Juan");
		Buscador pruebaBuscar = new Buscador(vectorClaves);
		assertTrue(pruebaBuscar.existe(clave));
	}
	
	@Test
	public void testHotelExiste() {
		assertNotNull(hotelPrueba);
	}
	
	@Test
	public void testReservaExiste() {
		assertNotNull(reservaPrueba);
	}
	
	@Test
	public void testUsuarioExiste() {
		assertNotNull(usuarioPrueba);
	}
	
	@Test
	public void testCriptografia() {
		Crypto crypto = new Criptografia();
		String contraseña = "Contraseña";
		String enc = new String(crypto.encriptar(contraseña.getBytes()));
		Usuario usuarioPrueba2 = new Usuario("cristobal@gmail.com", enc, LocalDate.now());
		String resultado = usuarioPrueba2.getContraseña();
		String esperado = new String(crypto.desencriptar(resultado.getBytes()));
		assertEquals(esperado,contraseña);
	}
}
