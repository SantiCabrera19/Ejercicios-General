#include <stdio.h>
#include <conio.h>

int main(int argc, char *argv[]) {
	// Aqui definimos la variable
	char p;
	// Aqui le pedimos al usuario que ingrese UN solo caracter
	printf("Ingrese un caracter: ");
	// Ese caracter ese lee Aqui
	p=getchar();
	printf("El caracter ingresado es: ");
	// Aqui se imprime el Caracter que el usuario Ingreso
	putchar(p);
	getch();
	return 0;
}

