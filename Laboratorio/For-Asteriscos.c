#include <stdio.h>
#include <conio.h>
int main(int argc, char *argv[]) {
	
	int i, j, cantidad;
	scanf("%d", &cantidad);
	for (i=1; i<=cantidad ; i++){ 			
			
		for(j=1; j<=cantidad; j++){
			printf("*");
		}
		printf("\n");
	}
	
	getch();
	return 0;
}

