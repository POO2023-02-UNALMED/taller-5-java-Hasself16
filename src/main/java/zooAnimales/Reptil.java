package zooAnimales;

import java.util.List;

public class Reptil extends Animal{
	private static List<Reptil> listado;
	public int iguanas;
	public int serpientes;
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
	public String movimiento() {
		return ("reptar");
	}
	public void crearIguana(String nombre, int edad, String genero) {
		this.iguanas++;
		new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	public void crearSerpiente(String nombre, int edad, String genero) {
		this.serpientes++;
		new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
}
