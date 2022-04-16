package PrMain;

/**
 * 
 * @author joseporiollopezbosch
 * BTC_Reus_UD08_TA08
 * Exercise01 - Alumnos y su nota media
 */

import java.util.ArrayList;
import java.util.Scanner;
import Classes.PasswordClass;
import Classes.PersonaClass;
import Classes.ElectrodomesticoClass;
import Classes.SerieClass;



public class mainApp {
	
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<PersonaClass> personas 						= new ArrayList<PersonaClass>();
	public static ArrayList<PasswordClass> passwords 					= new ArrayList<PasswordClass>();
	public static ArrayList<ElectrodomesticoClass> electrodomesticos 	= new ArrayList<ElectrodomesticoClass>();
	public static ArrayList<SerieClass> series						 	= new ArrayList<SerieClass>();
	public static PersonaClass personaObj;
	public static PasswordClass passwordObj;
	public static ElectrodomesticoClass electrodomesticoObj;
	public static SerieClass serieObj;

	public static void main(String[] args) {
		
		rellenar();
		menu();

	}

//Methods
	public static void menu() {
		int opcion;
		System.out.println("Menu");
		System.out.println("1- Mostrar todo");
		opcion = scan.nextInt();
		
		switch(opcion) {
			case 1:
				mostrarTodo();
				break;
		}
	}
	public static void mostrarTodo() {
		for(PersonaClass persona: personas ) {
			System.out.println(persona);
		}
		for(PasswordClass password: passwords) {
			System.out.println(password);
		}
		for(SerieClass serie: series) {
			System.out.println(serie);
		}
	}
	public static void rellenar() {
		personas.add(personaObj 					= new PersonaClass());
		personas.add(personaObj 					= new PersonaClass("Uri", 41, "22334433r", 'H', 65, (float)1.78));
		personas.add(personaObj 					= new PersonaClass("Uri", 41, 'H'));
		
		passwords.add(passwordObj 					= new PasswordClass());
		passwords.add(passwordObj 					= new PasswordClass(12));
		
		electrodomesticos.add(electrodomesticoObj 	= new ElectrodomesticoClass());
		electrodomesticos.add(electrodomesticoObj 	= new ElectrodomesticoClass((float)400, (float)90));
		electrodomesticos.add(electrodomesticoObj 	= new ElectrodomesticoClass((float)400, ElectrodomesticoClass.valColor.rojo, ElectrodomesticoClass.consumoEnergetico.A, (float)85));
		
		series.add(serieObj 						= new SerieClass("You", "Greg Berlanti"));
		series.add(serieObj 						= new SerieClass("The boys", 3, "Ciencia ficcion", "Dan Trachtenberg"));
		
	}
}
