#include <stdio.h>

int main() {
	int A, B, C;
	
	printf("Ingrese el valor de A: ");
	scanf("%d", &A);
	printf("Ingrese el valor de B: ");
	scanf("%d", &B);
	printf("Ingrese el valor de c: ");
	scanf("%d", &C);
	
	if(A > B && A > C){
		printf("A Es el mayor");
	} else if (B > A && B > C){
		printf("B Es el mayor");
	} else {
		printf("C Es el mayor");
	}

	return 0;
}

