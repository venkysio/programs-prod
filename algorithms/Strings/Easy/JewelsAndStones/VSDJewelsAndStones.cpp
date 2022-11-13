#include <bits/stdc++.h>
using namespace std;

int VSD_Jewels_In_Stones(string jewels,string stones)
{
    unordered_map<char,int> VSD;
    int VSD_count=0;
    for(int ptr=0;ptr<jewels.length();ptr++){
        if(VSD.find(jewels[ptr])==VSD.end()){
            VSD[jewels[ptr]]=0;
        }
    }
    
    for(int ptr=0;ptr<stones.length();ptr++){
        if(VSD.find(stones[ptr])!=VSD.end()){
            VSD[stones[ptr]]+=1;
        }
    }
    
    for(int ptr=0;ptr<jewels.length();ptr++){
            VSD_count+=VSD[jewels[ptr]];
        }
    return VSD_count;
}



int main() {
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
    cout<<"enter jewels string   ";
    string jewels;
    cin>>jewels;
    cout<<"enter stones string   ";
    string stones;
    cin>>stones;
    cout<<"jewels in stones count is: "  <<VSD_Jewels_In_Stones(jewels,stones)<<endl;
    VSD_test_count--;
    }
    return 0;
}
