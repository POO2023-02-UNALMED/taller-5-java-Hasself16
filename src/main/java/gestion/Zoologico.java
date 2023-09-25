package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas = new ArrayList<>();
	}
	public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
		this.zonas = new ArrayList<>();
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	
	public String getUbicacion() {
		return (this.ubicacion);
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int Total=0;
		for (Zona zona : this.zonas) {
			int x= zona.cantidadAnimales();
			Total= Total + x;
		}
		return (Total);
	}
}
