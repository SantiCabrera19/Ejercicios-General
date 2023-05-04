#include <stdio.h>
#define MAX 5


void mostrar(int a[]){
	int i;
	for(i = 0; i < a[MAX]; i++){
		printf("Elementos: %d", a[MAX]);
	}
}

int main(int argc, char *argv[]) {
	int vec[5];
	int i;
	
	for(i=0; i < 5; i++){
		printf("Ingrese un numero entero: ");
		scanf("%d", &vec[i]);
	}
	
	mostrar(int a[]);
	
	return 0;
}

