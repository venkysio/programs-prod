#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
char s1[5000];
char s[5000]="path/";
printf("Enter the filename ");
	gets(s1);
	int i=0;
	int flag=0;
	//Checking user input
	for(i=0;i<strlen(s1);i++){
		char c=s1[i];
		//Uppercase letters
		if((c>=65&&c<=90)){
			flag=0;
		}
		//Lowercase letters
		else if((c>=97&&c<=122))
		{
			flag=0;
		}
		//Digits
		else if((c>=48&&c<=57))
		{
			flag=0;
		}
		//'.' for extension
		else if(c==46)
		{
			flag=0;
		}
		else{
			flag=1;
			break;
		}


	}
	if(flag==0){
strcat(s,s1);
system(s);
}
else{
	printf("cannot find the file");
}
	return 0;
}
