#include<bits/stdc++.h>

using namespace std;

int binarySearch(int arr[],int n,int target){
    int low=0,mid,high=n-1;
    while(low<=high){
        mid=(low+high)/2;
        if(arr[mid]==target){
            cout<<"Found at index"<<" "<<mid<<endl;
            return mid;
        }
        else if(target<arr[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    cout<<"Not found"<<endl;
    return -1;
}

int main(){
    int arr[]{1,2,3,4,4,5,6,7,8,8};
    int n=sizeof(arr)/sizeof(arr[0]);
    binarySearch(arr,n,4);
    binarySearch(arr,n,0);
    return 0;
}