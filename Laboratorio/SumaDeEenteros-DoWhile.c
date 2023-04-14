#include <stdio.h>


int main(int argc, char *argv[]) {
	
	int num, acum, suma;
	char o;
	acum=0;
	suma=0;
	
	do{
		printf("Introduzca un numero entero: ");
		scanf("%d", &num);
		acum = acum + 1;
		suma = suma + num;
		printf("desea introducir otro numero?(s / n): ");
		scanf(" %c", &o);
	}
	while((o!='n'));
	
	 
	
	printf("Usted a ingresado %d numeros, la suma de ellos es de: %d", acum, suma);
	
	return 0;
}

