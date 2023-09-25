package zooAnimales;

import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=color;
		this.cantidadAletas=aletas;
		Pez.listado.add(this);
	}
	
	public Pez() {
		super();
		this.colorEscamas=null;
		this.cantidadAletas=0;
		Pez.listado.add(this);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
	}
	
	public int getCantidadAletas() {
		return (this.cantidadAletas);
	}
	
	public static int cantidadPeces() {
		return (Pez.listado.size());
	}
	@Override
	public String movimiento() {
		return ("nadar");
	}
	public void crearSalmon(String nombre, int edad, String genero) {
		this.salmones++;
		new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	public void crearBacalao(String nombre, int edad, String genero) {
		this.bacalaos++;
		new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
}
