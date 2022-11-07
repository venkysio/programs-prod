#include<iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;



int main(){
    string s="1.1.1.1";
    string ans="";
    for(int i=0;i<s.size();i++){
        if(s[i]=='.'){
            ans+="[.]";
        }
        else{
            ans+=s[i];
        }
    }
    cout<<ans<<endl;
}