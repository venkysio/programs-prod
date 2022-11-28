#include<stdio.h>
#include<conio.h>
#include <assert.h>
#include<string.h>
OpenFile(char *Filename) {
assert(Filename != NULL);
assert(strlen(Filename) > 3);
FILE *f = fopen(Filename,"r");
assert(f);
// Do work on the file
return 1;
}
int main(){
	printf("Please enter file name to open");
	char filename[100];
	scanf("%s",&filename);
	int x=OpenFile(filename);
	printf("%d",x);
	return 0;
}
