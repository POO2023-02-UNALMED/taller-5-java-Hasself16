package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private int [] zonas=null;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	
	public String getUbicacion() {
		return (this.ubicacion);
	}
}
