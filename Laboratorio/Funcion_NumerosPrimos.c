#include <stdio.h>

/* funci�n para n�meros primos */
int numerosPrimos(int num){
	int i;
	/* verifica si el n�mero es divisible por alg�n n�mero antes de �l */
	for(i=2; i<num; i++){
		if(num%i == 0){
			return 0; /* no es primo */
		}
	}
	return 1; /* es primo */
}

int main() {
	int numero;
	int contador = 0;
	printf("Ingrese una lista de numeros (finalice con 0): ");
	scanf("%d", &numero);
	
	
	while(numero != 0){
		if(numerosPrimos(numero) == 1){
			contador++;
		}
		printf("Ingrese un numero: ");
		scanf("%d", &numero);
	}
	printf("Se encontraron %d numeros primos en la lista.", contador);
	return 0;
}
