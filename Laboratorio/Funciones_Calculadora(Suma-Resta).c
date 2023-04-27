#include <stdio.h>
#include <conio.h>
int resta(int a, int b){ /* Definición de la función resta, que toma dos argumentos enteros y devuelve un entero */
	int total; /* Declaración de la variable entera total */
	total = a-b; /* Suma los valores de a y b y guarda el resultado en total */
	return total; /* Devuelve el valor de total */
}


int suma(int a, int b){ /* Definición de la función suma, que toma dos argumentos enteros y devuelve un entero */
	int total; /* Declaración de la variable entera total */
	total = a+b; /* Suma los valores de a y b y guarda el resultado en total */
	return total; /* Devuelve el valor de total */
}

int main(){
	int opc, calc, x, y, z;
	x = 0;
	y = 0;
	opc = 0;
	
	do{
		printf("¿Que operacion desea realizar?\n");
		printf("1. Suma\n");
		printf("2. Resta\n");
		printf("Operacion: ");
		scanf("%d", &opc);
		
		switch(opc){
		case 1:
			printf("Ingrese numero a sumar: "); 
			scanf("%d", &x); 
			printf("Ingrese numero a sumar: "); 
			scanf("%d", &y); 
			z = suma(x,y); 
			printf("la suma es: %d\n", z);
			break;
		case 2:
			printf("Ingrese numero a restar: "); 
			scanf("%d", &x); 
			printf("Ingrese numero a restar: "); 
			scanf("%d", &y); 
			z = resta(x,y); 
			printf("la resta es: %d\n", z);
		}
		
		printf("¿Desea seguir usando la calculadora?: \n");
		printf("1. Si\n");
		printf("2. No\n");
		printf("Eleccion: ");
		scanf("%d", &calc);
	}
	while((calc == 1));
	
	getch();
	return 0;
}

