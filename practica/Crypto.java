package practica;

public interface Crypto {
	
	byte[] encriptar(byte[] contraseña);
	
	byte[] desencriptar(byte[] contraseña);
}
