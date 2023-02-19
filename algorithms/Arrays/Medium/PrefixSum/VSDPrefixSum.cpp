// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Anagrams


#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int prefixSum(vector<int> arr){
    int sum=0;
    for(int i=0;i<arr.size();i++)sum+=arr[i];
    return sum;
}

int main(){
    vector<int> arr{1,2,3,4,5,6,7,8,9};
    int sum=prefixSum(arr);
    cout<<"The prefixsum is "<<sum;
    return 0;
}