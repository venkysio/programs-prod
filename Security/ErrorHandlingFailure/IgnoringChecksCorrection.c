#include<stdio.h>
#include<conio.h>
#include <assert.h>
#include<string.h>
OpenFile(char *Filename) {
if (Filename == NULL || strlen(Filename) <= 3)
return ERROR_BAD_ARGUMENTS;
FILE *f = fopen(Filename,"r");
if (f == NULL)
return ERROR_FILE_NOT_FOUND;
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
