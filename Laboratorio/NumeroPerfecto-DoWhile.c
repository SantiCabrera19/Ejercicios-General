#include <stdio.h>
#include <conio.h>

int main(int argc, char *argv[]) {
	
	int num, i, acum;
	
	printf("Ingrese el numero: ");
	scanf("%d", &num);
	
	acum = 0;
	
	for(i=1; i < num; i++){
		if (num % i == 0){
			acum = acum + i;
		}
	}
	
	if(num == acum){
		printf("El numero %d es perfecto", num);
	} else {
		printf("el numero %d no es perfecto", num);
	}
	
	getch();
	return 0;
}

