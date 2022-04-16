package Classes;

public class PersonaClass {
	
	private final char GENERO_DEFECTO = 'H';
	private String nombre	= "";
	private int edad		= 0;;
	private String dni;
	private char genero		= GENERO_DEFECTO;;
	private float peso		= 0;
	private float altura	= 0;
	
//Constructors
	public PersonaClass() {
			
	}
	public PersonaClass(String nombre, int edad, String dni, char genero, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}
	public PersonaClass(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
//Methods
	
	@Override
	public String toString() {
		return "PersonaClass [GENERO_DEFECTO=" + GENERO_DEFECTO + ", nombre=" + nombre + ", edad=" + edad + ", dni="
				+ dni + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + "]";
	}
//Getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	

	
	
	
	
	

}
