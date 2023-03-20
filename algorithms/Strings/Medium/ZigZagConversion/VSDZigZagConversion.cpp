
#include<bits/stdc++.h>


std::string convert(std::string s,int numRows){

    if(numRows ==1 || numRows >=s.length()) return s;

    std::string L[numRows]{""};
    int index=0,step=1;
    for(char x:s){
        L[index]+=x;
        if(index==0) step=1;
        else if(index==numRows-1) step=-1;
        index+=step;
    }
    std::string d="";
    for(std::string x:L) d+=x;
    return d;
}

int main(){
    std::string s="PAYPALISHIRING";
    int numRows=4;
    std::cout<<convert(s,numRows);
}