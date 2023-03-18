#include <stdio.h>
#include <conio.h>

int main(int argc, char *argv[]) {
	int a,b,c;
	printf("Ingrese los valores para realizar a operacion resta");
	printf("\nIngrese el primer valor: ");
	scanf("%i",&a);
	printf("Ingrese el segundo valor: ");
	scanf("%i",&b);
	c=a-b;
	printf("El resultado de la resta es %i", c);
	getch();
	return 0;
}

