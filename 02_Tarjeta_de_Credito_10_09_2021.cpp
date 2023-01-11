/*
Programa:
Luhn calcula la exactitud del codigo de verificacion de acuerdo con las siguientes reglas:

A partir del ultimo digito del numero de la tarjeta, multiplique los digitos pares por 2. 
Si el resultado de multiplicar por 2 son dos digitos, reste 9 del resultado.
Suma todos los numeros para obtener la suma.
Si el numero de tarjeta es legal, la suma puede ser divisible por 15.

https://programmerclick.com/article/84471934908/
https://programmerclick.com/article/30561554827/

ejemplo correcto
4 1 6 8 8 1 8 8 4 4 4 4 7 1 1 5

A mejorar
N/N
*/

//////////////////////////////////////////////////////////////////////////////////////////
//						CAMILA ALEXANDRA ARIAS RUIZ - 20211005064						//
//////////////////////////////////////////////////////////////////////////////////////////

#include <iostream>
using namespace std;

const int SIZE = 15+1;
int array[SIZE];

int pedir_num(){//Funci�n para pedir cada n�mero
	int num;
	cout<<"Ingrese digito (0-9): ";
	cin>>num;
	return num;
}

int valida(int num){//Funci�n para validar que siempre se ingrese un n�mero de un d�gito
	if(num<0){
		cout<<"digito invalido, ingrese digito nuevamente: ";
		num = pedir_num();
	}
	if(num>9){
		cout<<"digito invalido, ingrese digito nuevamente: ";
		num = pedir_num();
	}
}

void pedir_tarjeta(){//Funci�n que llama a las funciones ya creadas para llenar un arreglo con los n�meros de la tarjeta
	
	for(int i=0;i<SIZE;i++){
		cout<<"Digito "<<i+1<<endl;
		int num = pedir_num();
		num = valida(num);
		array[i]=num;
	}
	cout<<endl;
	cout<<"Tarjeta numero: ";
	for(int i=0;i<SIZE;i++){
		cout<<array[i]<<" ";
	}
	cout<<endl;
}

void check(int array[SIZE]){//Funci�n para hacer la validaci�n solicitada

	int array_2[SIZE];
	
	for(int i = 0; i < SIZE; i++){
		array_2[i]=array[i];
	}
	
	int cont = 0;
	cout<<endl<<"Proceso de validacion:"<<endl;
	cout<<"Multiplicar posiciones pares por 2"<<endl;
	for(int i = 0; i < SIZE; i++){
		if(i%2==0){
			array_2[i]=array_2[i]*2;
		}
		cout<<array_2[i]<<" ";
	}
	cout<<endl<<"Restar 9 a los numeros de dos digitos"<<endl;
	for(int i = 0; i < SIZE; i++){
		if(array_2[i]>9){
			array_2[i]=array_2[i]-9;
		}
		cout<<array_2[i]<<" ";
		cont = cont + array_2[i];	
	}
	cout<<endl<<"Se suman todos los digitos = "<<cont<<", Se saca el modulo en 10"<<endl;
	
	if (cont%SIZE==0){
		cout<<"---La tarjeta SI es valida---";
	}else{
		cout<<"---la tarjeta NO es valida---";
	}
}

int main (){
	int op;
	do{
		pedir_tarjeta();
		check(array);
		cout<<endl<<endl<<"Pulse 1 para volver a validar otra tarjeta:  ";
		cin>>op;
		system("cls");
	}while(op==1);
	cout<<endl<<"Finalizo el programa :D";
	system("pause");
	return 0;
}
