
#include<bits/stdc++.h>

using namespace std;



bool wordBreak(std::string s,std::vector<std::string>& wordDict){
    std::set<std::string> word_set(wordDict.begin(),wordDict.end());
    int n=s.size();
    std::vector<bool>dp(n+1,0);
    dp[0]=1;
    for(int i=0;i<n;i++){
        if(!dp[i]) continue;
        for(int j=i+1;j<=n;j++){
            if(word_set.count(s.substr(i,j-i)))
                dp[j]=1;
        }
    }
    return dp[n];
}

int main(){
    std::string s = "applepenapple";
    std::vector<std::string> words{ "apple", "pen" };
    std::cout<<wordBreak(s,words);
    return 0;
}