#include<iostream>
#include<bits/stdc++.h>
#include<string>


using namespace std;

int firstuniqchar(string s){
    map<char,int> hashmap;

    for(int i=0;i<s.size();i++){
        char ch=s[i];
        if(hashmap.find(ch)==hashmap.end()){
            hashmap[ch]=1;
        }
        else{
            hashmap[ch]+=1;
        }


    }
    for(int i=0;i<s.size();i++){
        if(hashmap[s[i]]==1)
        return i;
    }
    return -1;
}

int main(){

    int ans=firstuniqchar("vsdevelopers");
    cout<<ans;
    return 0;
}