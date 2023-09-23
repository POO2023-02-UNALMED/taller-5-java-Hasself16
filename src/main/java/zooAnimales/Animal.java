package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona [] zona; 
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales ++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
	}
	
	public Animal() {
		totalAnimales ++;
		this.nombre=null;
		this.edad=0;
		this.habitat=null;
		this.genero=null;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public int getEdad() {
		return (this.edad);
	}
	
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	
	public String getHabitat() {
		return (this.habitat);
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public String getGenero() {
		return (this.genero);
	}
}
