#include <stdio.h>
#include <conio.h>

int main() {
	int arreglo[10];
	int i;
	
	for(i = 0; i < 10; i++){
		printf("Ingresar el elemento %d:\n", i);
		scanf("%d", &arreglo[i]);
	}
	
	for(i = 0; i<10; i++){
		printf("Elemento %d:%d\n",i+1,arreglo[i]);
		if (arreglo[i]%2==0){
			printf("Es par");
		} else {
			printf("No es par");
		}
	}
	
	return 0;
}

