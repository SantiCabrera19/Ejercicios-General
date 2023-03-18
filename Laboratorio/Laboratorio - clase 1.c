#include <stdio.h>
#include <conio.h>
#define mensaje "Ingrese aqui: "

int main() {
	char p;
	printf("ingresar un caracter por teclado: ");
	p=getchar();
	printf("El caracter ingresado es: ");
	putchar(p);
	getch();
	return 0;
}

