import java.util.Scanner;

public class tarjeta_Credito {

	static Scanner Leer = new Scanner(System.in);
	
	static int SIZE = 15+1;
	static int[] array = new int[SIZE];

	static int pedir_num(){//Funci�n para pedir cada n�mero
		int num;
		System.out.println("Ingrese digito (0-9): ");
		num = Leer.nextInt(); 
		return num;
	}

	static int valida(int num){//Funci�n para validar que siempre se ingrese un n�mero de un d�gito
		if(num<0){
			System.out.println("digito invalido, ingrese digito nuevamente: ");
			num = pedir_num();
		}
		if(num>9){
			System.out.println("digito invalido, ingrese digito nuevamente: ");
			num = pedir_num();
		}
		return num;
	}

	static void pedir_tarjeta(){//Funci�n que llama a las funciones ya creadas para llenar un arreglo con los n�meros de la tarjeta
		
		for(int i=0;i<SIZE;i++){
			System.out.println("Digito "+(i+1));
			int num = pedir_num();
			num = valida(num);
			array[i]=num;
		}
		System.out.println();
		System.out.println("Tarjeta numero: ");
		for(int i=0;i<SIZE;i++){
			System.out.println(array[i]+" ");
		}
		System.out.println();
	}

	static void check(int[] array){//Funci�n para hacer la validaci�n solicitada

		int[] array_2= new int[SIZE];
		
		for(int i = 0; i < SIZE; i++){
			array_2[i]=array[i];
		}
		
		int cont = 0;
		System.out.println("Proceso de validacion:\n\n");
		System.out.println("Multiplicar posiciones pares por 2\n\n");
		for(int i = 0; i < SIZE; i++){
			if(i%2==0){
				array_2[i]=array_2[i]*2;
			}
			System.out.println(array_2[i]+" ");
		}
		System.out.println("Restar 9 a los numeros de dos digitos");
		for(int i = 0; i < SIZE; i++){
			if(array_2[i]>9){
				array_2[i]=array_2[i]-9;
			}
			System.out.println(array_2[i]+" ");
			cont = cont + array_2[i];	
		}
		System.out.println("Se suman todos los digitos = "+cont+", Se saca el modulo en 10");
		
		if (cont%SIZE==0){
			System.out.println("---La tarjeta SI es valida---");
		}else{
			System.out.println("---la tarjeta NO es valida---");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		do{
			pedir_tarjeta();
			check(array);
			System.out.println("Pulse 1 para volver a validar otra tarjeta:  ");
			op = Leer.nextInt();
		}while(op==1);
		System.out.println("Finalizo el programa :D");
	}

}


