#include <stdio.h>
#include <conio.h>
#include <math.h>

int numerosPrimos(int num){
	int i;
	/* verifica si el número es divisible por algún número antes de él */
	for(i=2; i<num; i++){
		if(num%i == 0){
			return 0; /* no es primo */
		}
	}
	return 1; /* es primo */
}

int main() {
	/*Definimos el arreglo y su tipo y la damos valores*/
	int arreglo[10] = {10, 5, 7, 8, 11, 5, 34, 53, 35, 123};
	int i, contador = 0;
	
	for (i = 0; i < 10; i++){
		contador += numerosPrimos(arreglo[i]);
	}
	
	printf("Hay %d numeros primos en el arreglo.\n", contador);
	
	printf("Numeros primos en el arreglo: %d", numerosPrimos(arreglo[i]));
	
	getch();
	return 0;
}

	
