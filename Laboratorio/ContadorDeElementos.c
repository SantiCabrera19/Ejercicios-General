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
		printf("El n�mero %d se encontr� %d veces",b,enc);
	} else {
		printf("No se encontr� el n�mero");
	}

}



int main() {
	int 
	int i, b, enc;
	printf("Ingrese un n�mero a buscar: ");
	scanf(" %d",&b);
	Buscador(b, lista[9]={1,1,2,2,5,6,7,8,9};);
	
	return 0;
}

