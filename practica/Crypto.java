package practica;

public interface Crypto {
	
	byte[] encriptar(byte[] contraseņa);
	
	byte[] desencriptar(byte[] contraseņa);
}
