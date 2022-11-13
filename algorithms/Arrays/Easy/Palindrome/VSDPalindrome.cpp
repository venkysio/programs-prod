
#include <iostream>
using namespace std;


void VSDcheck_palindrome(string str){
    int len=str.length();
    int ptr=1;
    for(int i=0;i<len;i++){
        if(str[i]!=str[len-i-1]){
            ptr=0;
            break;
        }
    }
    if(ptr){
        cout<<str<<" is a palindrome";
        
    }
    else{
        cout<<str<<" is not a palindrome";
    }

}
int main() {
    cout<<"enter a string to check palindrome ";
    string str;
    cin>>str;
    cout<<endl;
    VSDcheck_palindrome(str);
    return 0;
}
