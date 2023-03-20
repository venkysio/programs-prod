#include<bits/stdc++.h>
#include<string>

std::string util(std::string s){
    std::string res="";
    s+="#";
    int count=1;
    for(int i=0;i<s.length()-1;i++){
        if (s[i]==s[i+1]) count++;
        else 
            res+=std::to_string(count)+s[i];
    }
    return res;

}
std::string countAndSay(int n){
    std::string start="1";
    for(int i=0;i<n-1;i++){
        start=util(start);
    }
    return start;
}

int main(){
    int n=4;
    std::cout<<countAndSay(n);
   return 0;
}