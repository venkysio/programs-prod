
#include<iostream>
#include<vector>
#include<bits/stdc++.h>

using namespace std;
int min(int arr[],int n){
    int mini=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<mini)
            mini=arr[i];
    }
    return mini;
}
int max(int arr[],int n){
    int maxi=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>maxi)
            maxi=arr[i];
    }
    return maxi;
}

void bucketSort(int arr[],int n){
    int mini=min(arr,n);
    int maxi=max(arr,n);
    vector<vector<int>> bucket(n);

    for(int i=0;i<n;i++){
        int j=n*(arr[i]-mini)/(maxi+2-mini);
        bucket[j].push_back(arr[i]);
    }
    int i=0;
    for(int j=0;j<n;j++){
        vector<int> bj=bucket[j];
        sort(bj.begin(),bj.end());
        for(int k=0;k<bj.size();k++){
            arr[i++]=bj.at(k);
        }
    }
}

int main(){

    int arr[]={5,2, 9, 12, 54, 31, 65, 31, 45, 65};
    int n=sizeof(arr)/sizeof(arr[0]);
    bucketSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}