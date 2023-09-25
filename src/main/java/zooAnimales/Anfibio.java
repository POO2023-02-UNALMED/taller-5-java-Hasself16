package zooAnimales;

import java.util.List;

public class Anfibio extends Animal{
	private static List<Anfibio> listado;
	public int ranas;
	public int salamandras;
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
	public String movimiento() {
		return ("saltar");
	}
	public void crearRana(String nombre, int edad, String genero) {
		this.ranas++;
		new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}public void crearSalamandra(String nombre, int edad, String genero) {
		this.salamandras++;
		new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
}
