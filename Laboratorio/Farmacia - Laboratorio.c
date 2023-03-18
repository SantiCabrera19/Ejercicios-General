#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() 
{
	float a, b, c, d;
	printf("Ingrese el precio del articulo: ");
	scanf("%f",&a);
	printf("Ingrese el numero de unidades del articulo: ");
	scanf("%f",&b);
	c = a * b;
	d = c - c*15/100;
	printf("El precio a pagar es de: %f", d);
	getch();
	return 0;
}

