import java.util.Scanner;

public class Hola_Mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner(System.in);
		/*
		String name;
		
		System.out.print("Digite su nombre: ");
		name = Leer.next();
		
		System.out.println("Hola " + name);
		*/
		
		int x;
		int y;
		int rta = 0;
		
		System.out.println("Digite dos numeros enteros");
		x = Leer.nextInt();
		y = Leer.nextInt();
		
		if (x>y) {
			
			rta=x+y;
			
		} else {
			rta=x-y;
		}
		
		System.out.println("El resultado es " + rta);
		
	}

}
