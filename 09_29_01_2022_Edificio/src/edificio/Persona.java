package edificio;

import java.util.Scanner;

public class Persona {

	Scanner Leer;
	public Persona() {
		Leer = new Scanner(System.in);
	}
	
	public  String llamar() {
		System.out.print("¿En que piso se encuentra ahora?  ");
		String piso = Leer.next();
		return piso;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
