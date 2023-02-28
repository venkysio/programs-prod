
#include<bits/stdc++.h>


int lengthOfLongestSubstring(std::string s){
    int start=0,end=0,ans=0;
    
    std::map<char,int> map;

    while(end<s.length()){  
           
        if(map.find(s[end]) == map.end()){
            map[s[end]]=end;
            end++;
            int l=map.size();
            ans=std::max(l,ans);

        }
        else{
            map.erase(s[start]);
            start++;
        }
        
    }
    return ans;
}

int main(){
    std::string s = "abcabcabb";
    std::cout<<lengthOfLongestSubstring(s);
    return 0;
}