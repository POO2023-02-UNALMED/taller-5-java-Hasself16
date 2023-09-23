package gestion;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private int [] animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	
	public Zona() {
		this.nombre=null;
		this.zoo=null;
	}

}
