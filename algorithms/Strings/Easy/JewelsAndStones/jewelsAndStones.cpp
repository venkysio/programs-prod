#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;

int count_jewels(string jewels, string stones)
{
    map<char, int> hash;
    int count = 0;
    for (char &a : jewels)
    {
        hash[a] = 0;
    
    }
    for (char &a : stones)
    {
        if (hash.find(a) != hash.end())
        {
            count++;
        }
    }
    return count;
}

void solution(vector<pair<string,string>> testcases)
{
    vector<int> answers;

    for (int i = 0; i < testcases.size(); i++)
    {
        string jewels=testcases[i].first;
        string stones=testcases[i].second;
    
       int x=count_jewels(jewels,stones);
       answers.push_back(x);
    } 
    for(int& a:answers){
        cout<<a<<" ";
    }
}


int main()
{
    vector<pair<string, string>> testcases = {{"aA", "aAAbbbb"}, {"z", "ZZ"}, {"abc", "ABccds"}, {"VSd", "vSD"}};
    solution(testcases);
    return 0;
}