package zooAnimales;

public class Pez extends Animal{
	private Pez [] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=color;
		this.cantidadAletas=aletas;
	}
	
	public Pez() {
		super();
		this.colorEscamas=null;
		this.cantidadAletas=0;
	}
}
