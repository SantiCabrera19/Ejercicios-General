#include <stdio.h>
#include <conio.h>

int main(int argc, char *argv[]) {
	
	int num;
	
	for(num = 1; num <= 5; num++){
		printf("%d  %d  ", num, num*-1);
	}
	
	getch();
	return 0;
}

