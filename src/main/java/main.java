import gestion.*;
import zooAnimales.*;

public class main {

	public static void main(String[] args) {
		Zoologico zoo = new Zoologico();
		Zona z1 = new Zona();
		Zona z2 = new Zona();
		zoo.agregarZonas(z1);
		zoo.agregarZonas(z2);
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
		z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
		z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
		z2.agregarAnimales(Pez.crearBacalao("test", 11, "M"));
		Mamifero.crearCaballo("test", 11, "M");
		Ave.crearHalcon("test", 11, "M");
		Anfibio.crearRana("test", 11, "M");
		Reptil.crearIguana("test", 11, "M");
		Pez.crearBacalao("test", 11, "M");
		System.out.println(zoo.cantidadTotalAnimales());
		System.out.println(zoo.getZona().get(0).cantidadAnimales());
		System.out.println(Mamifero.caballos);
		System.out.println(Mamifero.leones);
		System.out.println(Ave.aguilas);
		System.out.println(Ave.halcones);
		System.out.println(Anfibio.ranas);
		System.out.println(Anfibio.salamandras);
		System.out.println(Reptil.iguanas);
		System.out.println(Reptil.serpientes);
		System.out.println(Pez.salmones);
		System.out.println(Pez.bacalaos);
	}

}
