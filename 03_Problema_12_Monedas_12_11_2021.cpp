/*
Programa:
Realizar un programa que resuelva el problema de las 12 monedas

Link Presentacion del problema:
https://www.canva.com/design/DAEvhzfZtow/share/preview?token=hhfuSRAnvRYdcUrEfMkUJw&role=EDITOR&utm_content=DAEvhzfZtow&utm_campaign=designshare&utm_medium=link&utm_source=sharebutton

A mejorar:
Organizar mas el tiempo para que se pueda terminar el programa.
*/
#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

int monedas[12];
int grupos[3][2]={{0,3},{4,7},{8,11}};

void crear_monedas(){
	
	for(int i = 0; i<12; i++){
		monedas[i]=0;
	}
	int falsa= rand() %12;
	monedas[falsa]=1;
	for(int i = 0; i<12; i++){
		cout<<monedas[i]<<" ";	
	}
	cout<<endl;
}
	
int pesar(int ig1, int fg1, int ig2, int fg2){
	
	int cont1=0;
	int cont2=0;
	
	for (int i=ig1; i<=fg1; i++){
		
		cont1+=monedas[i];
	}
	for (int i=ig2; i<=fg2; i++){
		
		cont2+=monedas[i];
	}
	
	if (cont1>cont2){
		
		return 0;
		
	}
	else if (cont1<cont2){
		
		return 1;
		
	}
	else{
		
		return 2;
	}
	
}
	
int main(){
	srand (time(NULL)) ;
	int grupo_p;
	crear_monedas();
	grupo_p=pesar(grupos[0][0],grupos[0][1],grupos[1][0],grupos[1][1]);//
	grupos[0][0]=grupos[grupo_p][0];
	grupos[1][1]=grupos[grupo_p][1];
	grupos[0][1]=grupos[0][0]+1;
	grupos[1][0]=grupos[1][1]-1;
	grupo_p=pesar(grupos[0][0],grupos[0][1],grupos[1][0],grupos[1][1]);
	grupos[0][0]=grupos[grupo_p][0];
	grupos[1][1]=grupos[grupo_p][1];
	grupos[0][1]=grupos[0][0];
	grupos[1][0]=grupos[1][1];
	grupo_p=pesar(grupos[0][0],grupos[0][1],grupos[1][0],grupos[1][1]);
	cout<<"la moneda mas pesada es la numero "<<grupos[grupo_p][0]+1<<endl;
	system("pause");
	return 0;
}
		
		
