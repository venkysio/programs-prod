#include<bits/stdc++.h>


void util(int index,std::string string,std::string digits,std::vector<std::string>& res,std::map<char,std::string> map){
    if(string.length() == digits.length()){
        res.push_back(string);
        return;
    }
    for(char ch:map[digits[index]]){
        util(index+1,string+ch,digits,res,map);
    }
}

std::vector<std::string> letterCombinations(std::string digits){
    std::vector<std::string> ans;
    if(digits.length()==0) return ans;
    std::map<char,std::string> map{{
        {'2',"abc"},
        {'3',"def"},
        {'4',"ghi"},
        {'5',"jkl"},
        {'6',"mno"},
        {'7',"pqrs"},
        {'8',"tuv"},
        {'9',"wxyz"},
    }};
    util(0,"",digits,ans,map);
    return ans;
}

int main(){
    std::string digits = "23";
    std::vector<std::string>ans=letterCombinations(digits);
    for(auto it:ans){
        std::cout<<it<<" ";
    }
    
    return 0;
}