package Classes;

public class ElectrodomesticoClass {

	private final float PRECIO_BASE = 100;
	private final valColor COLOR_C = valColor.blanco;
	private final consumoEnergetico CONSUMO_C = consumoEnergetico.F; // A..F
	private final float PESO_C = 5;

	private float precioBase = PRECIO_BASE;
	private valColor color = COLOR_C;
	private consumoEnergetico consumo = CONSUMO_C; // A..F
	private float peso = PESO_C;
	
	public enum consumoEnergetico {A, B, C, D, E, F;}
	public enum valColor{blanco,negro,rojo,azul,gris}

//Constructors
	public ElectrodomesticoClass() {

	}

	public ElectrodomesticoClass(float precioBase, float peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public ElectrodomesticoClass(float precioBase, valColor color, consumoEnergetico consumo, float peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

//Methods
	
	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public valColor getColor() {
		return color;
	}

	public void setColor(valColor color) {
		this.color = color;
	}

	public consumoEnergetico getConsumo() {
		return consumo;
	}

	public void setConsumo(consumoEnergetico consumo) {
		this.consumo = consumo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPRECIO_BASE() {
		return PRECIO_BASE;
	}

	public valColor getCOLOR_C() {
		return COLOR_C;
	}

	public consumoEnergetico getCONSUMO_C() {
		return CONSUMO_C;
	}

	public float getPESO_C() {
		return PESO_C;
	}

//Getters and Setters
	
	

}
