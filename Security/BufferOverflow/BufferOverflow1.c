#include <stdio.h>
#include<string.h>
void DontDoThis(char* input)
{
char buf[1];
strcpy(buf, input);
printf("%s\n", buf);
}
int main(int argc, char* argv[])
{
// So we're not checking arguments
// What do you expect from an app that uses strcpy?
DontDoThis(argv[1]);
return 0;
}