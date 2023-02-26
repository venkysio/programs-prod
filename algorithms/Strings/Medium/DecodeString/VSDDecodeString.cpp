#include<bits/stdc++.h>

std::string decodeString(std::string &s){
    std::stack<int> stack;
    std::stack<std::string> prevStack;
    int curnum=0;
    std::string str="";
    for(auto& ch:s){
        if(ch>=48 && ch<=57)
            curnum=curnum*10 + ch-'0';
        else if(ch=='['){
            stack.push(curnum);
            curnum=0;
            prevStack.push(str);
            str="";
        }
        else if(ch==']'){
            std::string temp=str;
            str=prevStack.top();prevStack.pop();
            int n=stack.top();stack.pop();
            while(n-->0){
                str+=temp;
            }

        }
        else{
            str+=ch;
        }
    } 
    return str;
}



int main(){
    std::string s="3[a2[bc]]";
    std::cout<< decodeString(s);
    return 0;
}