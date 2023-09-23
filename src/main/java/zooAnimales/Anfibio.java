package zooAnimales;

public class Anfibio extends Animal{
	private Anfibio [] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel=color;
		this.venenoso=venenoso;
	}
	
	public Anfibio() {
		super();
		this.colorPiel=null;
		this.venenoso=false;
	}
}
