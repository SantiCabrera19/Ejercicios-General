#include <stdio.h>
#include <conio.h>

int main(int argc, char *argv[]) {
	
	int num = 1;
	
	do{
		printf("%d\n", num);
		num++;
	}
	while(num <= 10);
	
	printf("condicion: %d", num);
	
	return 0;
}

