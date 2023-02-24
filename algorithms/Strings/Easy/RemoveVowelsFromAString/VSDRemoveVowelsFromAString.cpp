#include <bits/stdc++.h>
using namespace std;

bool VSD_check_vowel(char ch){
    switch(ch) {
     case 'a':
     case 'e':
     case 'i':
     case 'o':
     case 'u':
     case 'A':
     case 'E':
     case 'I':
     case 'O':
     case 'U': {
        return true;
    break;
   }
        default :
    return false;
    }
}

string VSD_remove_vowel(string str)
{
    int VSD=0;
    while(VSD < str.length()){
        if(VSD_check_vowel(str[VSD])){
            str = str.replace(VSD,1,"");
        }
        VSD++;
    }
    return str;
    
}



int main() {
    
    string str="vsdevelopers";    
    cout<<"String after removing vovels: "<<VSD_remove_vowel(str)<<endl;
    return 0;
}

