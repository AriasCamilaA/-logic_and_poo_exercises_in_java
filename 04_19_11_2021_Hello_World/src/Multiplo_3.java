/*
Relaice un programa que me permita saber si un numero digitado por el 
usuario es multiplo de 3 sabiendo que un numero es multiplo de 3 
si y solo si la suma de todos sus digitos es multiplo de 3 
*/
import java.util.Scanner;

public class Multiplo_3 {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		int num;
		int t_num;
		int o_num;
		int digitos = 0;
		int digito;
		int cont = 0;
		
		
		System.out.println("\t|||BIENVENIDO A LA CALCULADORA QUE DETERMINA SI UN NUMERO ES MULTIPLO DE 3||: ");
		System.out.print("Ingrese el numero que desea saber si es multiplo de 3: ");
		num = Leer.nextInt();
		t_num = num;
		o_num = num;
		
		while(t_num > 0) {
			t_num = t_num/10;
			digitos++;
		}
		
		int[] numero = new int[digitos];
		for(int i=0; i<digitos; i++) {
			digito = num%10;
			numero[i] = digito;
			num = num/10;
		}
		for(int i=digitos-1;i>=0;i--){
			if(i==0) {
				System.out.print(numero[i]+" = ");
			}else {
				System.out.print(numero[i]+" + ");
			}
			cont += numero[i];
		}
		System.out.println(cont);
		if(cont%3!=0) {
			System.out.print("El numero "+o_num+" NO es multiplo de 3");
		}else {
			System.out.print("El numero "+o_num+" SI es multiplo de 3");
		}
		
		
		
		
	}

}
