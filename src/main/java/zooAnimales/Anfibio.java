package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel=color;
		this.venenoso=venenoso;
		Anfibio.listado.add(this);
	}
	
	public Anfibio() {
		super();
		this.colorPiel=null;
		this.venenoso=false;
		Anfibio.listado.add(this);
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel=colorPiel;
	}
	
	public String getColorPiel() {
		return (this.colorPiel);
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso=venenoso;
	}
	
	public boolean isVenenoso() {
		return (this.venenoso);
	}
	
	public static int cantidadAnfibios() {
		return (Anfibio.listado.size());
	}
	@Override
	public void movimiento() {
		System.out.println("saltar");
	}
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		Animal rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		return (rana);
	}public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		Animal salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		return (salamandra);
	}
}
