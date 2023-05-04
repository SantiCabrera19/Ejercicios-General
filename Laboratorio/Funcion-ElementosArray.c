#include <stdio.h>
#include <conio.h>

int main() {
	/*Definimos el arreglo y su tipo y la damos valores*/
	int arreglo[10] = {5,2,4,5,1,2,4,5,5,2};
	int i;
	/*Usando la estructura repetitiva "FOR" recorremos el arreglo, mostrando sus elementos*/
	for(i = 0; i<10; i++){
		printf("Digito %d: %d\n",i,arreglo[i]); /* Mostramos los elementos de arreglo[10] */
	}
	getch();
	return 0;
}

