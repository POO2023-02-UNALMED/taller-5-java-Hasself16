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
}
