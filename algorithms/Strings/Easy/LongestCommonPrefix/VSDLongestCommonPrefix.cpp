
#include<iostream>
#include<string>
#include<vector>

using namespace std;


string getMinString(vector<string> &strs){
    string minstring=strs[0];
    for(int i=0;i<strs.size();i++){
        if(strs[i].size()<minstring.size())
            minstring=strs[i];
    
    }
    return minstring;

}

string longestCommonPrefix(vector<string> &strs){
    string answer="";
    int n=strs.size();
    if(n==1)
        return strs[0];
    string minstr=getMinString(strs);
    int m=minstr.size();
    for(int i=0;i<m;i++){
        char ch=strs[0][i];
        for(int j=0;j<n;j++){
            if(ch!=strs[j][i])
                return answer;
        }
        answer+=ch;

    }
    return answer;
}


int main(){
    vector<string> strs{"flower","flow","flight"};
    string ans=longestCommonPrefix(strs);
    cout<<ans;

    return 0;
}