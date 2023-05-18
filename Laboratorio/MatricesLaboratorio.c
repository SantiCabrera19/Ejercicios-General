#include <stdio.h>
#include <conio.h>

/*Procedimiento para Mostrar un arreglo*/
void mostrarMatriz(int Arreglo[5][2]){
	int i, j;
	
	for (i = 0; i < 5; i++){
		for (j = 0; j < 2; j++){
			printf("Matriz [%d][%d]= ", i, j);
			printf("%d \t", Arreglo[i][j]);
		}
		printf("\n");
	}
	/*Muestra la matriz en forma de Matriz*/
	for (i = 4; i >= 0; i--){
		for (j = 0; j < 2; j++){
			printf("%d", Arreglo[i][j]);
		}
		printf("\n");
	}
}

/* Procedimiento para sumar los elementos de un Arreglo */
	
int sumarElementos(int Arreglo[5][2]){
	int i, j, suma;
	suma = 0;
		
	for(i = 0; i < 5; i++){
		for (j = 0; j < 2; j++){
			suma = suma + Arreglo[i][j];
		}
	}
		
	return suma;
}

	
/*Procedimiento para buscar elementos en un Arreglo*/
	
void buscarElementos(int Arreglo[5][2], int A){
	int i, j, cont;
	cont = 0;
		
	for (i = 0; i < 5; i++){
		for (j = 0; j < 2; j++){
			if (Arreglo[i][j] == A){
				cont++;
			}
		}
	}
	printf("%d aparece y se repite %d veces en el Arreglo.\n", A, cont);
}

int main() {
	int suma;
	int matriz[5][2] = {{0, 0}, {1, 2}, {2, 4}, {3, 6}, {4, 8}};
	
	mostrarMatriz(matriz);
	suma = sumarElementos(matriz);
	printf("La suma de los elementos de la matriz es: %d\n", suma);
	buscarElementos(matriz, 3);
	
	getch();
	return 0;
}
	
