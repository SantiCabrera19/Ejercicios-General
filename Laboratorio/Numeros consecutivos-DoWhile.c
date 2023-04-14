#include <stdio.h>

int main(int argc, char *argv[]) {
	
	int a, b, c;
	
	do{
		printf("Ingrese tres numeros consecutivos: ");
		scanf("%d %d %d",&a,&b,&c);
	}
	while((a=a) && (b!=a+1) && (c!=a+2));
	
	printf("gracias");
	return 0;
}

