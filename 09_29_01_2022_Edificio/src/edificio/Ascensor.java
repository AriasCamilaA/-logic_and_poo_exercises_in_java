package edificio;

public class Ascensor {
	
	int pisos = 10;
	int sotanos = 3;
	
	int piso; //Piso en el que llama la persona
	int actual = sotanos; //Piso en el que inicia el Ascensor
	
	String total[] = new String[pisos+sotanos];//Arreglo que tiene los nombres de los pisos
	
	//Para llenar el arreglo con los nombres de los pisos
	void Edificio() {
		for(int s = sotanos-1; s>=0;s--) {
			total[sotanos-s-1]="S"+(s+1);
		}
		for(int p = sotanos; p<total.length;p++) {
			total[p]=String.valueOf(p-sotanos+1);
		}
		
//		//Imprimir orden del edificio
//		for(int i = 0; i<total.length;i++) {
//			System.out.println(total[i]);
//		}
		
	}
	
	
	//Simula el movimiento del Ascensor
	void mover(String _piso) {
		piso=-1;//para romper el ciclo si no encuentra el piso
		
		//Busca el piso ingresado dentro del arreglo
		for(int i = 0;i<total.length;i++) {
			if(total[i].equalsIgnoreCase(_piso)) {
				piso = i;
			}
		}
//		System.out.println(total[actual]);
//		System.out.println(total[piso]);

		//Si no encuentra el piso, termina el programa
		if(piso==-1) {
			System.out.println("Fin del recorrido (Piso no valido)");
		}else if(piso==actual) {
			System.out.println("Estoy en su piso");
		}else if(actual>piso) {
			for(int i = actual; i>=piso;i-- ) {
				
				if(i==piso) {
					System.out.println("Estoy en su piso "+total[i]);
				}else {
					System.out.println("Piso "+total[i]+" --- Bajando");
				}
			}
			
		}else{
			for(int i = actual; i<=piso;i++ ) {
				if(i==piso) {
					System.out.println("Estoy en su piso "+total[i]);
				}else {
					System.out.println("Piso "+total[i]+" --- Subiendo");
				}
			}
			
		}
		
		
	}
	
	
	void activar() {
	    //Si la persona llama en un piso valido
		while(piso!=-1){
			System.out.println();
			System.out.println("-------------------ASCENSOR------------------------");
			System.out.println();
			Edificio();
			System.out.println("El Ascensor esta en el piso "+total[actual]);
			Persona Pe = new Persona();
			String _piso = Pe.llamar();
			mover(_piso);
			actual = piso;
		}
	}

}
