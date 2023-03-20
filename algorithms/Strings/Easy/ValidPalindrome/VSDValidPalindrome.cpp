#include<bits/stdc++.h>

using namespace std;

bool isPalindrome(string s){
    string rev="";
    for(char ch:s){
        if(ch>=97 && ch<=122)
            rev+=ch;
        else if(ch>=65 && ch<=90)
            rev+=ch+32;
    }
    int i=0,j=rev.length()-1;
    while(i<j){
        if(rev[i++]!=rev[j--]) return false;
    }
    return true;
}

int main(){
    string s="A man, a plan, a canal: Panama";
    if(isPalindrome(s))cout<<"It is a palindrome";
    else cout<<"It is not a palindrome";
    return 0;
}