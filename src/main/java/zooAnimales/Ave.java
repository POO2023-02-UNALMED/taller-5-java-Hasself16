package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String color) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=color;
		Ave.listado.add(this);
	}
	
	public Ave() {
		super();
		this.colorPlumas=null;
		Ave.listado.add(this);
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
	
	public String getColorPlumas() {
		return (this.colorPlumas);
	}
	
	public static int cantidadAves() {
		return (Ave.listado.size());
	}
	@Override
	public String movimiento() {
		return ("volar");
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		Animal halcon = new Ave(nombre , edad, "montanas", genero, "cafe glorioso");
		return (halcon);
	}
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		Animal aguila = new Ave(nombre , edad, "montanas", genero, "blanco y amarillo");
		return (aguila);
	}
}
