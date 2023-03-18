#include <stdio.h>
#include <conio.h>
#include <math.h>

int main() 
{
	int	 a;
	float b, c, d;
	double potencia = 2;
	printf("Ingrese un numero para calcularlo: ");
	scanf("%i",&a);
	b = a/5;
	printf("Este es la quinta parte de %i : %f\n",a ,b);
	c = b/2;
	printf("Esta es la mitad de la quinta parte de %i: %f:\n",a, c);
	double elevado = pow(c, potencia);
	printf("La potencia de %f es: %f", c, elevado);
	getch();
	return 0;
}

