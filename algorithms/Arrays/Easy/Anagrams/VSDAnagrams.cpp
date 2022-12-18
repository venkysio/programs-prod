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
    Map<char,int> map;
    for(int i=0;i<s1.size();i++){
      map[s1[i]]++;
    }
    for(int j=0;j<s2.size();j++){
      if(map.find(s[j])!=map.end()){
        map[b[j]]--;
      }
      else{
        return false;
      }
    }
    for(auto items:map){
      if(items.second!=0){
        return false;
      }
    }
    return true;
  }
   
  return 0;
}
