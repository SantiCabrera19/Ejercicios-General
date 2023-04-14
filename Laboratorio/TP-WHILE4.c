#include <stdio.h>

int main() {
	float aux, val, deprec;
	int n, anual, eleccion;
	
	eleccion = 0;
	
	while (eleccion != 4) {
		printf("\t*** MENU ***\n");
		printf("1. Metodo de linea recta\n");
		printf("2. Metodo de balance doblemente declinante\n");
		printf("3. Metodo de la suma de los digitos de los anos\n");
		printf("4. Salir\n");
		printf("\nSeleccione el metodo de depreciacion deseado: ");
		scanf("%d", &eleccion);
		
		switch(eleccion) {
		case 1:
			printf("\nMetodo de linea recta seleccionado.\n");
			printf("Introduzca el valor original del objeto: ");
			scanf("%f", &aux);
			printf("Introduzca el numero de anos por los que se depreciara el objeto: ");
			scanf("%d", &n);
			
			deprec = aux / n;
			val = aux;
			
			for (anual = 1; anual <= n; anual++) {
				printf("Ano %d: Valor remanente = %.2f, Depreciacion anual = %.2f\n", anual, val, deprec);
				val -= deprec;
			}
			
			break;
		case 2:
			printf("\nMetodo de balance doblemente declinante seleccionado.\n");
			printf("Introduzca el valor original del objeto: ");
			scanf("%f", &aux);
			printf("Introduzca el numero de anos por los que se depreciara el objeto: ");
			scanf("%d", &n);
			
			deprec = 2.0 / n;
			val = aux;
			
			for (anual = 1; anual <= n; anual++) {
				printf("Ano %d: Valor remanente = %.2f, Depreciacion anual = %.2f\n", anual, val, deprec * val);
				val -= deprec * val;
			}
			
			break;
		case 3:
			printf("\nMetodo de la suma de los digitos de los anos seleccionado.\n");
			printf("Introduzca el valor original del objeto: ");
			scanf("%f", &aux);
			printf("Introduzca el numero de anos por los que se depreciara el objeto: ");
			scanf("%d", &n);
			
			int suma_digitos = (n * (n + 1)) / 2;
			val = aux;
			
			for (anual = 1; anual <= n; anual++) {
				deprec = (n - anual + 1) / (float)suma_digitos;
				printf("Ano %d: Valor remanente = %.2f, Depreciacion anual = %.2f\n", anual, val, deprec * val);
				val -= deprec * val;
			}
			
			break;
		case 4:
			printf("\nAdios.\n");
			break;
		default:
			printf("\nError: opcion invalida.\n");
		}
	}
	
	return 0;
}
