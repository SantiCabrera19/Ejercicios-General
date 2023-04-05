#include <stdio.h>
#include <conio.h>


int main(int argc, char *argv[]) {
	char p;
	printf("ingresar un caracter por teclado: ");
	p=getchar();
	printf("El valor ingresado por teclado: ");
	putchar(p);
	printf("\n");
	printf("ingresar un caracter por teclado: ");
	scanf(" %c",&p);
	printf("El valor ingresado por teclado es: ");
	putchar(p);
	getch();
	return 0;
}
