package Classes;

import java.util.Random;

public class PasswordClass {
	
	private int longitud = 8;
	private String contrasenya;
//Constructors
	public PasswordClass() {
		
	}
	public PasswordClass(int longitud) {
		this.longitud = longitud;
		this.contrasenya = generarPassword(longitud);
	}
//Methods
	public static String generarPassword(int longitud) {
		String password="";
		Random random = new Random();
		
		for(int i=0; i<longitud;i++) {
			char randomChar = (char) (random.nextInt(26) + 'a');
			password = password+randomChar;
		}
		return password;		
	}
	@Override
	public String toString() {
		return "PasswordClass [longitud=" + longitud + ", contrasenya=" + contrasenya + "]";
	}
//Getters and setters
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	
}
