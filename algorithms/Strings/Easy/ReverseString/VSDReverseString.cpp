
#include<bits/stdc++.h>
using namespace std;

void swap(string s[],int i,int j){
    string temp=s[i];
    s[i]=s[j];
    s[j]=temp;
}

void reverseString(string s[],int n){
    int i=0,j=n-1;
    while(i<j)swap(s,i++,j--);
}


int main(){
    string s[]={"h","e","l","l","o"};
    int n=sizeof(s)/sizeof(s[0]);
    reverseString(s,n);
    for(string x:s)cout<<x<<" ";
    cout<<endl;
    return 0;
}