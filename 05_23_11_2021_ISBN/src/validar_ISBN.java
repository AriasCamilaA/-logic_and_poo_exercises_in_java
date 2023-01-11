import java.util.Scanner;

public class validar_ISBN {


	static Scanner Leer = new Scanner(System.in);
	static String ISBN;
	static int digitos;
	
	//Aqui se crea una funcion para validar los tipos de ISBN, es decir los digitos que tiene
	static void validar_tipos() {
		switch (digitos) {

		case 10: {
			validar_ISBN(10);	//Se llama la función para ingresar el ISBN y validarlo con la longitud 
			break;
		}
		case 13: {
			validar_ISBN(13);
			break;
		}
		default:
			System.out.println("No es un ISBN valido");
			System.out.println("Vuelva a intentarlo");
			System.out.println("Cuantos digitos tiene su ISBN");
			digitos = Leer.nextInt();
			validar_tipos();
		} 
		
	}
	
	//Aqui se crea una funcion para crear y validar el ISBN
	static void validar_ISBN(int size) {
		
		System.out.println("Ingrese ISBN");
		ISBN = Leer.next(); //Se guarda en un String el ISBN
		int[] array_int = new int[ISBN.length()]; // Se crea un arreglo de int donde vamos a guardar los digitos
		if(ISBN.length()==size) {//Para entrar a hacer toda la validacion se mira primero si lo que se ingreso es del tamaño correcto


	        // Se castea cada char del String a int y se guarda en el arreglo que se creo antes
	        for (int i = 0; i < ISBN.length(); i++) {
	        	array_int[i] = Integer.parseInt(String.valueOf(ISBN.charAt(i)));;
	        }
	  
	        // Se imprime el arreglo (ISBN)
	        System.out.println("Su ISBN es: ");
	        for (int i = 0; i < ISBN.length(); i++) {
	        	System.out.print(array_int[i]+" ");
	        }
	        System.out.println();
			
		}else {
			System.out.println("Ingreso incorrectamente el ISBN, no ingreso un ISBN de "+size+" digitos");
			validar_ISBN(size);
		}
		
		
		int cont = 0;
		if(size==10) {//Dependiendo del ISBN hace una validacion diferente
			for (int i = 0; i < ISBN.length(); i++) {
				cont = cont + (array_int[i]*(i+1));
				//System.out.print(array_int[i]*(i+1)); //para ver la validacion
	        }
			if(cont%11==0) {
				System.out.println("Si es un ISBN valido");
			}else {
				System.out.println("No es un ISBN valido");
			}
		}else {
			for (int i = 0; i < ISBN.length(); i++) {
				if(i%2==1) {
					cont = cont + array_int[i]*3;
					//System.out.print(array_int[i]*3); //para ver la validacion
				}else {
					cont = cont + array_int[i];
					//System.out.print(array_int[i]); //para ver la validacion
				}
				
	        }
			if(cont%10==0) {
				System.out.println("Si es un ISBN valido");
			}else {
				System.out.println("No es un ISBN valido");
			}
		}
		
	}

	public static void main(String[] args) {
		// EJ 10:    2123456802
		// EJ 13: 9782123456803
		
		System.out.println("||Bienvenido al validador de ISBN||");
		System.out.println("Cuantos digitos tiene su ISBN");
		digitos = Leer.nextInt();
		validar_tipos();
		
		

	}

}