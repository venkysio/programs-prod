#include <bits/stdc++.h>
using namespace std;

string VSD_Defang_an_IP_Address(string str)
{
    int VSD=0;
    string Defanged_IP_Address;
    while(VSD < str.length()){
        if(str[VSD]== '.'){
            Defanged_IP_Address+="[.]";
        }
        Defanged_IP_Address+=str[VSD];
        VSD++;
    }
    return Defanged_IP_Address;
    
}



int main() {
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
    cout<<"enter IP Address for defanging  ";
    string str;
    cin>>str;
    cout<<"Defanged_IP_Address is "  <<VSD_Defang_an_IP_Address(str)<<endl;
    VSD_test_count--;
    }
    return 0;
}
