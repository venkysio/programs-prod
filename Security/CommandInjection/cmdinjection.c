#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
	char s1[5000];
	char s[5000]="path/";
	printf("Enter the file name ");
	gets(s1);
	strcat(s,s1);
	printf("Concatenated String is: '%s'\n", s);
	system(s);
	return 0;
}
