#include <stdio.h>
#include <conio.h>

int maximoComunDivisor(int a, int b){
	int resto;
	while(b != 0){
		resto = a % b;
		a = b;
		b = resto;
	}
	return a;
}


int main(){
	int x, y, maxdiv;
	printf("Ingrese el primer numero: ");
	scanf("%d", &x);
	printf("Ingrese el segundo numero: ");
	scanf("%d", &y);
	
	maxdiv = maximoComunDivisor(x, y);
	printf("%d", maxdiv);
	
	return 0;
}

