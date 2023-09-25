import gestion.*;
import zooAnimales.*;

public class main {

	public static void main(String[] args) {
		Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
		a1.movimiento();
		a2.movimiento();
		a3.movimiento();
		a4.movimiento();
		a5.movimiento();
	}

}
