#include <stdio.h>
#include <conio.h>

/* Función para cargar el arreglo */
int cargarArreglo(int arreglo[]){
	int i;
	for (i = 0; i < 5; i++) {
		printf("Dime el elemento %d: ", i);
		scanf("%d", &arreglo[i]);
	}
	return 0;
}

/* Función para sumar dos arreglos */
int sumarArreglos(int vector1[], int vector2[], int vector3[]) {
	int i;
	for (i = 0; i < 5; i++) {
		vector3[i] = vector1[i] + vector2[i];
	}
	return 0;
}

/* Función para mostrar un arreglo */
void mostrarArreglo(int arreglo[]) {
	int i;
	for (i = 0; i < 5; i++) {
		printf("%d ", arreglo[i]);
	}
	printf("\n");
}

/* Main donde se ejecutan las funciones */
int main() {
	
	int vector1[5];
	int vector2[5];
	int vector3[5];
	
	printf("Ingrese los valores para el vector1:\n");
	cargarArreglo(vector1);
	
	printf("Ingrese los valores para el vector2:\n");
	cargarArreglo(vector2);
	
	sumarArreglos(vector1, vector2, vector3);
	
	printf("El vector1 es: ");
	mostrarArreglo(vector1);
	
	printf("El vector2 es: ");
	mostrarArreglo(vector2);
	
	printf("El vector3 es: ");
	mostrarArreglo(vector3);
	
	getch();
	return 0;
}

