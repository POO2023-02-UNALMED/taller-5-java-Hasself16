package zooAnimales;

public class Reptil extends Animal{
	private Reptil [] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad,String habitat, String genero, String color, int largo) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=color;
		this.largoCola=largo;
	}
	
	public Reptil() {
		super();
		this.colorEscamas=null;
		this.largoCola=0;
	}
}
