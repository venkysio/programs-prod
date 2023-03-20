#include<bits/stdc++.h>

using namespace std;

bool isAnagram(string s,string t){

    if(s.length()!=t.length()) return false;
    map<char,int> charCount;
    for(char ch:s){
        if(charCount.find(ch)==charCount.end()) charCount.insert({ch,1});
        else charCount[ch]++;
    }
   
    for( char ch:t){
        if(charCount.find(ch)==charCount.end())return false;
        charCount[ch]--;
    }
    
    for(auto& e:charCount){
        if(e.second!=0) return false;
        return true;
    }
}

int main(){
    if(isAnagram("hello","olleh")) cout<<"These are Anagrams";
    else cout<<"These are not Anagrams";
    return 0;
}