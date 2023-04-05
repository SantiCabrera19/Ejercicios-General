#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() 
{
	int a, b, c;
	printf("Ingrese el precio del articulo: ");
	scanf("%i",&a);
	printf("Ingrese el numero de unidades del articulo: ");
	scanf("%i",&b);
	c = a * b;
	printf("El precio a pagar es de: %i",c*15/100);
	getch();
	return 0;
}

