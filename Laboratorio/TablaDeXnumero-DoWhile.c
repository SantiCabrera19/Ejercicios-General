#include <stdio.h>

int main(int argc, char *argv[]) {
	
	int num, i, resultado;
	
	num = 7;


	
	for(i=10; i >= 1; i--){
		resultado=num*i;
		printf("%d x %d = %d \n",num,i,resultado);
	}
	
	return 0;
}
