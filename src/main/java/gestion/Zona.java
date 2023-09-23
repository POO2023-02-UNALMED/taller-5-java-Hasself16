package gestion;

import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	
	public Zona(String nombre) {
		this.nombre=nombre;
		this.zoo=null;		
	}
	
	public Zona(Zoologico zoo) {
		this.nombre=null;
		this.zoo=zoo;
	}
	
	public Zona() {
		this.nombre=null;
		this.zoo=null;
	}

}
