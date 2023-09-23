package zooAnimales;

public class Mamifero extends Animal {
	private Mamifero [] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	
	public Mamifero() {
		super();
		this.pelaje=false;
		this.patas=0;
	}
}
