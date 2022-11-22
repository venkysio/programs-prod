#include <stdio.h>
void DoThis(char* input)
{
char buf[1];
int i;
for(i=0;i<sizeof(buf);i++){
	buf[i]=input[i];
}
printf(" Copied %s\n", buf);
}
int main(int argc, char* argv[])
{
DoThis(argv[1]);
return 0;
}