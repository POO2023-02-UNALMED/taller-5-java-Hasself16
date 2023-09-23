package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private int [] zonas;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
	}
}
