#include <stdio.h> /* Incluye la librería estándar de entrada y salida de datos */
#include <conio.h> /* Incluye la librería para funciones de entrada y salida de la consola */

int suma(int a, int b); /* Declaración de la función suma */

int main(){
	int x,y,z; /* Declaración de variables enteras x, y y z */
	printf("Ingrese numero a sumar: "); /* Imprime en pantalla un mensaje pidiendo un número */
	scanf("%d", &x); /* Lee el número ingresado por el usuario y lo guarda en la variable x */
	printf("Ingrese numero a sumar: "); /* Imprime en pantalla otro mensaje pidiendo un número */
	scanf("%d", &y); /* Lee el número ingresado por el usuario y lo guarda en la variable y */
	
	z = suma(x,y); /* Llama a la función suma, pasando los valores de x e y como argumentos, y guarda el resultado en la variable z */
	printf("la suma es: %d", z); /* Imprime en pantalla el resultado de la suma */
	
	getch(); /* Espera a que el usuario presione cualquier tecla para salir */
	return 0; /* Termina la ejecución del programa */
}

int suma(int a, int b){ /* Definición de la función suma, que toma dos argumentos enteros y devuelve un entero */
	int total; /* Declaración de la variable entera total */
	total = a+b; /* Suma los valores de a y b y guarda el resultado en total */
	return total; /* Devuelve el valor de total */
}


