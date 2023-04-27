#include <stdio.h> /* Incluye la librer�a est�ndar de entrada y salida de datos */
#include <conio.h> /* Incluye la librer�a para funciones de entrada y salida de la consola */

int resta(int a, int b); /* Declaraci�n de la funci�n resta */

int main(){
	int x,y,z; /* Declaraci�n de variables enteras x, y y z */
	printf("Ingrese numero a restar: "); /* Imprime en pantalla un mensaje pidiendo un n�mero */
	scanf("%d", &x); /* Lee el n�mero ingresado por el usuario y lo guarda en la variable x */
	printf("Ingrese numero a restar: "); /* Imprime en pantalla otro mensaje pidiendo un n�mero */
	scanf("%d", &y); /* Lee el n�mero ingresado por el usuario y lo guarda en la variable y */
	
	z = resta(x,y); /* Llama a la funci�n suma, pasando los valores de x e y como argumentos, y guarda el resultado en la variable z */
	printf("la resta es: %d", z); /* Imprime en pantalla el resultado de la resta */
	
	getch(); /* Espera a que el usuario presione cualquier tecla para salir */
	return 0; /* Termina la ejecuci�n del_programa */
}

int resta(int a, int b){ /* Definici�n de la funci�n resta, que toma dos argumentos enteros y devuelve un entero */
	int total; /* Declaraci�n de la variable entera total */
	total = a-b; /* Suma los valores de a y b y guarda el resultado en total */
	return total; /* Devuelve el valor de total */
}
