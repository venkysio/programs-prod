//   Copyrights to venkys.io
//   For more programs visit venkys.io 
//   CPP program for Two number sum

#include<iostream>
#include<bits/stdc++.h>

using namespace std;

vector<int> twosum(vector<int> arr,int target){
    map<int,int> map;
    for(int i=0;i<arr.size();i++){
        if(map.find(arr[i])!=map.end())return {map.find(arr[i])->first,i};
        else map.insert({target-arr[i],i});
    }
    return {};
}


int main(){
    vector<int> arr={1,2,-1,4,5,6};
	int target=0;
    vector<int> result = twosum(arr,target);
    if(result.size()==2)
        cout<<"The two elements are"<<arr[result[0]]<<" "<<arr[result[1]];
    else
        cout<<"There are no such elements";
}