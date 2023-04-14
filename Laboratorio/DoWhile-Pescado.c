#include <stdio.h>
#include <conio.h>


int main(int argc, char *argv[]){
	
	int i, totalPescado, kgLimite, pescado;
	totalPescado=0;
	kgLimite = 10;
	do { 
		printf("Introduzca lo pescado: ");
		scanf(" %d", &pescado);
		totalPescado = totalPescado + pescado;
		
	}
	while((totalPescado<kgLimite) && (pescado!=0));
	if (totalPescado>kgLimite) {
		printf("¡Ha superado el límite!");
		
	}
	else {
		printf("Usted a pescado: %dkg",totalPescado);
	}
}
	

