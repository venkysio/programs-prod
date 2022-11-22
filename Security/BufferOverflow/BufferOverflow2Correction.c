#include <stdio.h>
#include<string.h>
int main()
{
    char string[2];
    FILE *fp;
    fp=fopen("file.txt","r");
    fgets(string,2,fp);
    printf("The string is: %s",string);
    fclose(fp);
    return 0;
}