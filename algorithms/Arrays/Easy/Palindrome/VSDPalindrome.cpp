// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Palindrome


#include <iostream>
using namespace std;

bool checkPalindrom(string str){
    int len=str.size();
    int i=0,j=len-1;
    while(i<j){
        if(str[i]!=str[j])return false;
        i++;j--;
    }
    return true;
}


int main() {
    string str="level";
    if(checkPalindrom(str))cout<<str<<" is a palindrom";
    else cout<<str<<" is not a palindrome";
    return 0;
}
