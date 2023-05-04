#include <stdio.h>
#include <math.h>

int main() {
	
	float a, b, c, discriminante, raiz1, raiz2;
	printf("Ingrese los coeficientes a, b y c de la ecuación cuadrática (ax^2 + bx + c): ");
	scanf("%f %f %f", &a, &b, &c);
	discriminante = b*b - 4*a*c;
	if (discriminante > 0) {
		raiz1 = (-b + sqrt(discriminante)) / (2*a);
		raiz2 = (-b - sqrt(discriminante)) / (2*a);
		printf("Las raíces son: %.2f y %.2f", raiz1, raiz2);
	} else if (discriminante == 0) {
		raiz1 = -b / (2*a);
		printf("La única raíz es: %.2f", raiz1);
	} else {
		printf("No hay raíces reales.");
	}
	return 0;
}
