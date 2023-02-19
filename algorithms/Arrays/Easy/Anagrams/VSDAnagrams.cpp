// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Anagrams


#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
  string s1="hello";
  string s2="olleh";
  
  if(s1.size()!=s2.size()){
    cout<<"Not Anagram";
  }
  else{
    map<char,int> map;
    for(int i=0;i<s1.size();i++){
      map[s1[i]]++;
    }
    for(int j=0;j<s2.size();j++){
      if(map.find(s2[j])!=map.end()){
        map[s2[j]]--;
      }
      else{
        cout<<s1<<" and "<<s2<<" are Not Anagrams";
        return false;
      }
    }
    for(auto items:map){
      if(items.second!=0){
         cout<<s1<<" and "<<s2<<" are Not Anagrams";
      }
    }
    cout<<s1<<" and "<<s2<<" are Anagrams";
    return true;
  }
   
  return 0;
}