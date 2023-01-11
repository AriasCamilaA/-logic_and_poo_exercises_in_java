/*
Programa:
Se realiza un programa que me permita buscar un elemento numérico dentro de un arreglo bidimensional.  
El arreglo bidimensional es de tamaño 7 x 5, el cual se llena de forma automática.
- es un numero el que se busca, no la posición y se debe decir si esta, y cuantas veces
- la idea es que se llene de forma aleatoria

A mejorar: 
aprender a utilizar mejor la la función rand()
*/

#include <iostream>
#include <cstdlib>

using namespace std;

const int n_f = 7;
const int n_c = 5;
int arreglo[n_f][n_c];

void banner(){
	cout<<endl<<"Hallar posiciones y cantidad de un numero en un arreglo bidimensional"<<endl;
}
void crear_arreglo(){
	
	
	for(int f = 1;f<=n_f;f++){
		for(int c = 1;c<=n_c;c++){
			arreglo[f][c]= rand() % 10;
		}
	}
	
	cout<<endl<<"\tEl arreglo creado es: "<<endl<<endl;
	for(int f = 1;f<=n_f;f++){
		for(int c = 1;c<=n_c;c++){
			cout<<"\t"<<arreglo[f][c]<<"   ";
		}
		cout<<endl;
	}
	
}

void buscar(){
	int num;
	cout<<"\tQue numero deseas buscar?: ";
	cin>>num;
	int cont = 0; 
	cout<<endl<<"El numero "<<num<<" se encuentra en las siguientes posiciones: "<<endl;
	for(int f = 1;f<=n_f;f++){
		for(int c = 1;c<=n_c;c++){
			if(arreglo[f][c]==num){
				cout<<"["<<f<<"]["<<c<<"], ";
				cont++;
			};
		}
	}
	cout<<endl<<"Hay "<<cont<<" veces "<<num<<" en el arreglo";
}


int main(){
	banner();
	cout<<endl;
	crear_arreglo();
	cout<<endl<<endl;
	buscar();
	return 0;
}
