#include <stdio.h>
#include <conio.h>

int main(int argc, char *argv[]) {
	int a,b,c;
	printf("Ingrese el primer valor de A: ");
	scanf("%i",&a);
	printf("Ingrese el segundo valor de B: ");
	scanf("%i",&b);
	c=a;
	a=b;
	b=c;
	printf("El valor de A es %i\n", a);
	printf("El valor de B es %i", b);
	getch();
	return 0;
}
