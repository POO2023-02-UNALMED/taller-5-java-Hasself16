package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje=pelaje;
		this.patas=patas;
		Mamifero.listado.add(this);
	}
	
	public Mamifero() {
		super();
		this.pelaje=false;
		this.patas=0;
		Mamifero.listado.add(this);
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
	}
	
	public boolean isPelaje() {
		return(this.pelaje);
	}
	
	public void setPatas(int patas) {
		this.patas=patas;
	}
	
	public int getPatas() {
		return (this.patas);
	}
	
	public static int cantidadMamiferos() {
		return (Mamifero.listado.size());
	}
	public static Animal crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++;
		Animal caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		return (caballo);
	}
	public static Animal crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones++;
		Animal leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		return (leon);
	}
}
