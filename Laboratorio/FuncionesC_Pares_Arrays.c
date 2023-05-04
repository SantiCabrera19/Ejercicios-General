#include <stdio.h>


int pares(int a[]){
	int i;
	for(i = 0; i<10; i++){
		printf("Elemento %d:%d\n",i+1,a[i]);
		if (a[i]%2==0){
			printf("Es par");
		} else {
			printf("No es par");
		}
	}
}


int main(int argc, char *argv[]) {
	
	return 0;
}

