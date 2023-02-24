#include<bits/stdc++.h>
using namespace std;

string shuffleString(string s,int indices[]){
    int n=s.length();
    char ans[n];
    for(int i=0;i<n;i++){
        ans[indices[i]]=s[i];
    }   
    string x;
    for(char a:ans)x+=a;
    return x;
}

int main(){
    string s="vsdevelopers";
    int indices[] = {1,11,10,9,8,7,6,5,4,3,2,0};
    cout<<shuffleString(s,indices)<<endl;
    return 0;
}