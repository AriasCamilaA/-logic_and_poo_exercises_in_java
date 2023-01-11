package objetos_tarjeta;

import objetos_tarjeta.Tarjeta_credito.Tipo_Tarjeta;

public class Tarjeta_test {
	public static void main(String[] args) {
		Tarjeta_credito tc = new Tarjeta_credito();
		// TODO Auto-generated method stub
		//4 1 6 8 8 1 8 8 4 4 4 4 7 1 1 5
		int op;
		do{
			tc.pedir_tarjeta();
			tc.check(tc.array);
			System.out.println("------------------TARJETA TIPO "+Tipo_Tarjeta.detect(tc.tarjeta_string)+"--------------------");
			System.out.println("Pulse 1 para volver a validar otra tarjeta:  ");
			op = tc.Leer.nextInt();
		}while(op==1);
		System.out.println("Finalizo el programa :D");
	}
}
