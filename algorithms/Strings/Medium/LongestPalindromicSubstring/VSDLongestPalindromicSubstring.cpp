

#include<bits/stdc++.h>



int expandFromCenter(std::string& string,int left,int right){
    while(left>-1 && right<string.length() && string[left]==string[right]){
        left--;
        right++;
    }
    return right-left-1;
}


std::string longestPalindrome(std::string& string){
    int start=0,end=0;
    for(int i=0;i<string.length();i++){
        int len1 = expandFromCenter(string,i,i);
        int len2 = expandFromCenter(string,i,i+1);
        int len = std::max(len1,len2);
        if(len > end - start){
            start=i - (len - 1) /2;
            end = i + len /2;
        }

    }
    
    return string.substr(start,end+1);
}


int main(){
    
    std::string string = "badab";
    std::cout<< longestPalindrome(string);
}