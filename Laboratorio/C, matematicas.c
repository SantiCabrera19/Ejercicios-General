#include <stdio.h>
#include <math.h>

int main() {
	double a, b, c, discriminante, root1, root2;
	printf("Ingrese los coeficientes: ");
	printf("Coeficiente a: ";
	scanf("%lf", &a)
	scanf("%lf", &b)
	scanf("%lf", &c)

	discriminante = b * b - 4 * a * c;
	
	if (discriminante >= 0) {
		root1 = (-b + sqrt(discriminante)) / (2 * a);
		root2 = (-b - sqrt(discriminante)) / (2 * a);
		printf("%.2lf %.2lf\n", root1, root2);
	} else {
		printf("La ecuación no tiene soluciones reales\n");
	}
	
	return 0;
}


