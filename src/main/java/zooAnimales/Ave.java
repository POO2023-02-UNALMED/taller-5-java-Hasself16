package zooAnimales;

public class Ave extends Animal{
	private Ave [] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String color) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=color;
	}
	
	public Ave() {
		super();
		this.colorPlumas=null;		
	}
}
