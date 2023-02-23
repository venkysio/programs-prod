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
    
    string jewels="aA";
    string stones="aAAbbbb";
    cout<<"jewels in stones count is: "  <<VSD_Jewels_In_Stones(jewels,stones)<<endl;
    
    return 0;
}
