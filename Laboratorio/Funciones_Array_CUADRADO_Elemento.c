#include <stdio.h>
#include <conio.h>
#include <math.h>
int main() {
	/*Definimos el arreglo y su tipo y la damos valores*/
	int arreglo[10] = {5,2,4,5,1,2,4,5,5,2};
	int i;
	
	/* For para sacar el cuadrado de cada elemento de un array...*/
	for (i = 0; i < 10; i++){
		arreglo[i] = pow(arreglo[i],2);
		printf("Potencia de elemento %d: %d\n",i, arreglo[i]);
	}
	

	getch();
	return 0;
}
