#include <stdio.h>


int main() {
	int A,B,C;
	
	printf("Dime el primer valor de A: ");
	scanf("%d",&A);
	printf("Dime el primer valor de B: ");
	scanf("%d",&B);
	printf("Dime el primer valor de C: ");
	scanf("%d",&C);
	
	if(A == B && A == C){
		printf("Los numeros %d, %d, %d son iguales", A, B, C);
	} else if (A != B && A != C && B == C){ 
		printf("Los numeros %d y %d son iguales", B, C);
	} else if (C != B && C != A && B == A){
		printf("Los numeros %d y %d son iguales", A, B);
	} else if (B != C && B != A && C == A){
		printf("los numeros %d y %d son iguales", A, C);
	} else {
		printf("los numeros ingresados %d %d y %d son distintos", A, B, C);
	}
	return 0;
}

