#include <stdio.h>

int main() {
	char A, B;
	
	printf("Ingrese el primer Caracter: ");
	scanf(" %c", &A);
	
	printf("Ingrese el segundo Caracter: ");
	scanf(" %c", &B);
	
	if(A != B && A != 'a'){
		printf("Tu nombre es Santiago.\n");
	} else {
		printf("Tu apellido es Cabrera.\n");
	}

	return 0;
}

