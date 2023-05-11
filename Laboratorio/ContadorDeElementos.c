#include <stdio.h>


int Buscador(int lista[9]={1,1,2,2,5,6,7,8,9)){
	
	int i, b, enc;
	while (i<9){
		if (b==listaa[i]){
			enc++;
			i++;
		}
	}
	
	if (enc != 0){
		printf("El número %d se encontró %d veces",b,enc);
	} else {
		printf("No se encontró el número");
	}

}



int main() {
	int 
	int i, b, enc;
	printf("Ingrese un número a buscar: ");
	scanf(" %d",&b);
	Buscador(b, lista[9]={1,1,2,2,5,6,7,8,9};);
	
	return 0;
}

