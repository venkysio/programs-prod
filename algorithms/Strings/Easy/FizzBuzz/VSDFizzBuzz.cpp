#include<iostream>
#include<string>
#include<bits/stdc++.h>

using namespace std;

vector<string> fizzbuzz(int n){
    vector<string> ans;
    for(int i=1;i<=n;i++){
        if (i%3==0 && i%5==0){
            ans.push_back("FizzBuzz");
        }
        else if (i%3==0){
            ans.push_back("Fizz");
        }
        else if (i%5==0){
            ans.push_back("Buzz");
        }
        else{
            string x;
            x=to_string(i);
            ans.push_back(x);
        }
    }
    return ans;



}

int main(){
    vector<string> ans=fizzbuzz(15);
    for(auto& a:ans){
        cout<<a<<" ";
    }
}