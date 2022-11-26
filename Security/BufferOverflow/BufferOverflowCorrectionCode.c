#include <stdio.h>
#include<string.h>
void DoThis(char* input)
{
char buf[1];
int i;
for(i=0;i<sizeof(buf);i++){
	buf[i]=input[i];
}
printf("Printing %s\n", buf);
}
int main()
{
    char string[3];
    FILE *fp;
    fp=fopen("file.txt","r");
    fgets(string,3,fp);
    printf("The string is: %s",string);
    fclose(fp);
	DoThis(string);
    return 0;
}
