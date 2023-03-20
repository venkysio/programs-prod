#include<bits/stdc++.h>

std::string toString(std::stack<char> &stack){
    std::string ans="";
    while(!stack.empty()){
        ans.push_back(stack.top());
        stack.pop();
    }
    int i=0,j=ans.length()-1;
    while(i<j){
        int temp=ans[i];
        ans[i++]=ans[j];
        ans[j--]=temp;
    }
    for(char ch:ans){
        stack.push(ch);
    }
    return ans;
}

void util(int start,int end,int n,std::stack<char>& stack,std::vector<std::string>& res){
    
    if(start==end && end==n){
        std::string x=toString(stack);
        res.push_back(x);
    }
    if(start<n){
        stack.push('(');
        util(start+1,end,n,stack,res);
        stack.pop();
    }
    if(end<start){
        stack.push(')');
        util(start,end+1,n,stack,res);
        stack.pop();
    }

}


std::vector<std::string> generateParantheses(int n){
    std::stack<char> stack;
    std::vector<std::string> res;
    util(0,0,n,stack,res);
    return res;
    
}


int main(){
    std::vector<std::string> res=generateParantheses(2);
    for(std::string s:res){
        std::cout<<s<<" ";
    }
    std::cout<<std::endl;
    return 0;
}