#include <stdio.h>
#include <conio.h>

int horas(int a, int b, int c){
	int horas, minutos;
	horas = b / 60; /* Minutos a Horas */
	minutos = c / 60; /* Segundos a Minutos */
	horas += minutos; /* Suma de horas y minutos */
	horas += a; /* Suma de horas y horas ingresadas */
	return horas;
}

int minutos(int a, int b, int c){
	int minutos, segundos;
	minutos = a * 60; /* Horas a Minutos */
	segundos = c / 60; /* Segundos a Minutos */
	minutos += segundos; /* Suma de minutos y segundos */
	minutos += b; /* Suma de minutos y minutos ingresados */
	return minutos;
}

int segundos(int a, int b, int c){
	int segundos;
	segundos = (a * 3600) + (b * 60) + c; /* Conversión a segundos */
	return segundos;
}

int main() {
	int opc, total, a, b, c;
	
	printf("Eliga su conversor: \n");
	printf("1. Convertir a Horas\n");
	printf("2. Convertir a Minutos\n");
	printf("3. Convertir a Segundos\n");
	printf("Eleccion: ");
	scanf("%d", &opc);
	
	switch(opc){
	case 1:
		printf("Conversor de Hora\n");
		printf("Digite las Horas: ");
		scanf("%d", &a);
		printf("Digite los Minutos: ");
		scanf("%d", &b);
		printf("Digite los Segundos: ");
		scanf("%d", &c);
		total = horas(a, b, c);
		printf("El total de Horas es: %d", total);
		break;
	case 2:
		printf("Conversor de Minutos\n");
		printf("Digite las Horas: ");
		scanf("%d", &a);
		printf("Digite los Minutos: ");
		scanf("%d", &b);
		printf("Digite los Segundos: ");
		scanf("%d", &c);
		total = minutos(a, b, c);
		printf("\nEl total de Minutos es: %d", total);
		break;
	case 3:
		printf("Conversor de Segundos\n");
		printf("Digite las Horas: ");
		scanf("%d", &a);
		printf("Digite los Minutos: ");
		scanf("%d", &b);
		printf("Digite los Segundos: ");
		scanf("%d", &c);
		total = segundos(a, b, c);
		printf("El total de Segundos es: %d", total);
		break;
	default:
		printf("Opcion invalida!");
		break;
	}
	
	return 0;
}


