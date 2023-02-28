
#include<bits/stdc++.h>

std::string largestNumber(std::vector<int>& num){
    std::vector<std::string> arr;
    for(auto i:num)
        arr.push_back(std::to_string(i));
    sort(begin(arr),end(arr),[](std::string& s1,std::string& s2){ return s1+s2>s2+s1;});
    std::string res;
    for(auto s:arr)
        res+=s;
    while(res[0]=='0' && res.length()>1)
        res.erase(0,1);
    return res;
}


int main(){
    std::vector<int> arr{3,30,34,5,9};
    std::cout<<largestNumber(arr);
    return 0;
}