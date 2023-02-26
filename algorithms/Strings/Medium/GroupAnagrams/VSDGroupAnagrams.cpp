
#include<bits/stdc++.h>

void groupAnagrams(std::vector<std::string>& strs){
    std::map<std::string,std::vector<std::string>> map;

    for(std::string s:strs){
        std::string prev=s;
        sort(s.begin(),s.end());
        if(map.find(s)==map.end()){
            std::vector<std::string> temp{prev};
            map[s]=temp;
        }
        else{
            map[s].push_back(prev);
        }
        
    }
    for(auto& it:map){
        std::vector<std::string> temp{it.second};
        for(int i=0;i<temp.size();i++)
            std::cout<<temp[i]<<" ";
        std::cout<<std::endl;
    }
    
}


int main(){
    std::vector<std::string> strs{"eat","tea","tan","ate","nat","bat"};
   groupAnagrams(strs);

    return 0;
}