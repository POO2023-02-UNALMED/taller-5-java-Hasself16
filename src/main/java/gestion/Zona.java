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
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	
	public Zoologico getZoo() {
		return (this.zoo);
	}

}
