package zooAnimales;

import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> listado;
	public int caballos;
	public int leones;
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
	public void crearCaballo(String nombre, int edad, String genero) {
		this.caballos++;
		new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	public void crearLeon(String nombre, int edad, String genero) {
		this.leones++;
		new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
}
