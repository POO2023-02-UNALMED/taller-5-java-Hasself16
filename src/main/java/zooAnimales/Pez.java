package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
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
	public static Animal crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		Animal salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		return (salmon);
	}
	public static Animal crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		Animal bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		return (bacalao);
	}
}
