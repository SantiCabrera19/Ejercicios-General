#include <stdio.h>

int main() {
	float num1, num2, res; 
	int opcion;
	
	printf("Calculadora Basica\n");
	printf("Ingrese el primer numero: ");
	scanf("%d", &num1);
	printf("Ingrese el Segundo numero: ");
	scanf("%d", %num2);
	
	printf("Eliga el numero de la operacion que desea realizar\n");
	printf("1.Suma");
	printf("2.Resta");
	printf("3.Multiplicacion");
	printf("4.Division");
	printf("5.Salir");
	printf("Operacion: ");
	scanf("%d" &opcion);
	
	if (opcion == 1){
		res = num1 + num2;
		printf("El resultado de la operacion es: %f", res);
	} else if(opcion == 2){
		res = num1 - num2;
		printf("El resultado de la operacion es: %f", res);
	}
	
	
	
	
}

