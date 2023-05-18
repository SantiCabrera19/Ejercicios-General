#include <stdio.h>
#include <conio.h>


/*Funcion para cargar Arreglos*/

int cargarArreglo(int arreglo[]){
	int i;
	
	for (i = 0; i < 5; i++) {
		printf("Dime la nota %d: ", i+1);
		scanf("%d", &arreglo[i]);
	}
	return 0;
}
	
	

/* Funcion void para mostrar Arreglos */
	
void mostrarArreglo(int arreglo[]) {
	int i;
	printf("Las notas son: ");
	for (i = 0; i < 5; i++) {
		printf("%d ", arreglo[i]);
	}
	printf("\n");
}

/*Funcion void para mostrar la nota media*/

void mostrarArregloMediaNota(int arreglo[]) {
	int i, suma;
	suma = 0;
	float promedio;
	
	for (i = 0; i < 5; i++) {
		suma = suma + arreglo[i];
	}
	
	promedio = (float)suma / 5;
	printf("El promedio es: %.2f\n", promedio);
}

/*Funcion void para mostrar la nota baja*/

void mostrarArregloBajaNota(int arreglo[]) {
	int i, baja;
	baja = arreglo[0];
	
	for (i = 0; i < 5; i++) {
		/*If que comprueba si, el elemento 0 es menor a los demas elementos*/
		if (arreglo[i] < baja){
			baja = arreglo[i]; /*si es asi, se remplaza*/
		}
	}
	
	printf("la nota mas baja es: %d\n", baja);
}

/*Funcion void para mostrar la nota alta*/

void mostrarArregloAltaNota(int arreglo[]) {
	int i, alta;
	alta = arreglo[0];
	
	for (i = 0; i < 5; i++) {
		/*If que comprueba si, el elemento 0 es menor a los demas elementos*/
		if (arreglo[i] > alta){
			alta = arreglo[i]; /*si es asi, se remplaza*/
		}
	}
	
	printf("la nota mas alta es: %d\n", alta);
}
	
int main() {
	int notas[5];
	printf("<===========================>\n");
	/*Cargamos las notas*/
	cargarArreglo(notas);
	printf("<===========================>\n");
	/*Mostramos las notas*/
	mostrarArreglo(notas);
	printf("<===========================>\n");
	/*Mostramos la nota media*/
	mostrarArregloMediaNota(notas);
	printf("<===========================>\n");
	/*Mostramos la nota baja*/
	mostrarArregloBajaNota(notas);
	printf("<===========================>\n");
	/*Mostramos la nota alta */
	mostrarArregloAltaNota(notas);
	printf("<===========================>\n");
	getch();
	return 0;
}

