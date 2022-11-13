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
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
    cout<<"enter string ";
    string str;
    cin>>str;
    cout<<"String after removing vovels: "<<VSD_remove_vowel(str)<<endl;
    VSD_test_count--;
    }
    return 0;
}

