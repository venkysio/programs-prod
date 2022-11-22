#include <stdio.h>
#include<string.h>
int main(int argc, char* argv[])
{
char buf[1];
gets(buf);
printf("%s\n", buf);
return 0;
}