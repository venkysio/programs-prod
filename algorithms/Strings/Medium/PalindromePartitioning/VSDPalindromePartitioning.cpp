
#include<bits/stdc++.h>



bool isPalindrome(std::string s,int i,int j){
    while(i<=j){
        if(s[i++]!=s[j--]) return false;
    }
    return true;
}


void util(int i,std::string s,std::vector<std::vector<std::string>>& res,std::vector<std::string>& path){
    if(i==s.size()){
        res.push_back(path);
        return ;
    }
    for(int j=i;j<s.size();++j){
        if(isPalindrome(s,i,j)){
            path.push_back(s.substr(i,j-i+1));
            util(j+1,s,res,path);
            path.pop_back();
        }
    }
}

std::vector<std::vector<std::string>> partition (std::string s){
    std::vector<std::vector<std::string>> res;
    std::vector<std::string> path;
    util(0,s,res,path);
    return res;
}

int main(){
    std::string s = "aab";
    std::vector<std::vector<std::string>> ans=partition(s);
    for(auto& a:ans){
        for(auto& b:a){
            std::cout<<b<<" ";
        }
        std::cout<<std::endl;
    }
    return 0;
}