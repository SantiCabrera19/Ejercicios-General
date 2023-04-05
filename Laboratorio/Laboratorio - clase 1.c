#include <stdio.h>
#include <conio.h>
#define mensaje "Ingrese aqui: "

int main(int argc, char *argv[]) {
	char p;
	printf("ingresar un caracter por teclado: ");
	p=getchar();
	printf("El valor ingresado por teclado: ");
	putchar(p);
	return 0;
}

