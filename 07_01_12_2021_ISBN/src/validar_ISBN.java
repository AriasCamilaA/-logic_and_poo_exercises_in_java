import java.util.Scanner;

public class validar_ISBN {


	Scanner Leer;
	public validar_ISBN() {
		Leer = new Scanner(System.in);
	}
	String ISBN = new String();
	public int digitos;
	
	//Aqui se crea una funcion para validar los tipos de ISBN, es decir los digitos que tiene
	void validar_tipos() {
		validar_ISBN validar = new validar_ISBN();
		switch (digitos) {

		case 10: {
			validar.validacion_ISBN(10);	//Se llama la función para ingresar el ISBN y validarlo con la longitud 
			break;
		}
		case 13: {
			validar.validacion_ISBN(13);
			break;
		}
		default:
			System.out.println("No es un ISBN valido");
			System.out.println("Vuelva a intentarlo");
			System.out.println("Cuantos digitos tiene su ISBN");
			validar.digitos = Leer.nextInt();
			validar.validar_tipos();
		} 
		
	}
	
	//Aqui se crea una funcion para crear y validar el ISBN
	void validacion_ISBN(int size) {
		validar_ISBN validar = new validar_ISBN();
		System.out.println("Ingrese ISBN");
		validar.ISBN = Leer.next(); //Se guarda en un String el ISBN
		int[] array_int = new int[validar.ISBN.length()]; // Se crea un arreglo de int donde vamos a guardar los digitos
		if(validar.ISBN.length()==size) {//Para entrar a hacer toda la validacion se mira primero si lo que se ingreso es del tamaño correcto


	        // Se castea cada char del String a int y se guarda en el arreglo que se creo antes
	        for (int i = 0; i < validar.ISBN.length(); i++) {
	        	array_int[i] = Integer.parseInt(String.valueOf(validar.ISBN.charAt(i)));;
	        }
	  
	        // Se imprime el arreglo (ISBN)
	        System.out.println("Su ISBN es: ");
	        for (int i = 0; i < validar.ISBN.length(); i++) {
	        	System.out.print(array_int[i]+" ");
	        }
	        System.out.println();
			
		}else {
			System.out.println("Ingreso incorrectamente el ISBN, no ingreso un ISBN de "+size+" digitos");
			validacion_ISBN(size);
		}
		
		
		int cont = 0;
		if(size==10) {//Dependiendo del ISBN hace una validacion diferente
			for (int i = 0; i < validar.ISBN.length(); i++) {
				cont = cont + (array_int[i]*(i+1));
				//System.out.print(array_int[i]*(i+1)); //para ver la validacion
	        }
			if(cont%11==0) {
				System.out.println("Si es un ISBN valido");
			}else {
				System.out.println("No es un ISBN valido");
			}
		}else {
			for (int i = 0; i < validar.ISBN.length(); i++) {
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



}