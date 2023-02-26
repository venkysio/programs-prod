#include <bit>
#include <iostream>
#include <string>

std::string Defang_an_IP_Address(std::string str)
{
    int VSD=0;
    std::string Defanged_IP_Address;
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

    std::cout<<"IP Address for defanging: \"1.1.1.1\"  ";
    std::string str = "1.1.1.1";
    std::cout<<"Defanged_IP_Address is "  <<Defang_an_IP_Address(str)<<std::endl;
    return 0;
}
