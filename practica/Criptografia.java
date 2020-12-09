package practica;

public class Criptografia implements Crypto{

	@Override
	public byte[] encriptar(byte[] datos) {
		byte[] enc = new byte[datos.length];
		
		for(int i=0;i<datos.length;i++) {
			enc[i] = (byte) ((i % 2 == 0) ? datos[i] + 1 : datos[i] - 1);
		}
		
		return enc;
	}
	
	@Override
	public byte[] desencriptar(byte[] datos) {
		byte[] desenc = new byte[datos.length];
		
		for(int i=0;i<datos.length;i++) {
			desenc[i] = (byte) ((i % 2 == 0) ? datos[i] - 1 : datos[i] + 1);
		}
		
		return desenc;
	}
}
