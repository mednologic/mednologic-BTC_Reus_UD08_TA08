package Classes;

public class SerieClass {
	
	private String titulo = "";
	private int numTemp = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
//Constructors
	public SerieClass() {
		
	}
	public SerieClass(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}
	public SerieClass(String titulo, int numTemp, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.genero = genero;
		this.creador = creador;
	}
//Methods
	@Override
	public String toString() {
		return "SerieClass [titulo=" + titulo + ", numTemp=" + numTemp + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
//Getter and Setter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemp() {
		return numTemp;
	}
	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	
}
