package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad,String habitat, String genero, String color, int largo) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=color;
		this.largoCola=largo;
		Reptil.listado.add(this);
	}
	
	public Reptil() {
		super();
		this.colorEscamas=null;
		this.largoCola=0;
		Reptil.listado.add(this);
	}
	
	public void setColorEscamas(String color) {
		this.colorEscamas=color;
	}
	
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
	
	public int getLargoCola() {
		return (this.largoCola);
	}
	
	public static int cantidadReptiles() {
		return (Reptil.listado.size());
	}
	@Override
	public void movimiento() {
		System.out.println("reptar");
	}
	public static Animal crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		Animal iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		return (iguana);
	}
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		Animal serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		return (serpiente);
	}
}
