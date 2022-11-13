
#include<iostream>
#include<bits/stdc++.h>

using namespace std;


void printarray(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

void insertionSort(int arr[],int n){
    for(int i=1;i<n;i++){
        int temp=arr[i];
        int j=i;
        while(j>0 && arr[j-1]>temp){
        arr[j]=arr[j-1];
        j--;
        }
        arr[j]=temp;
    }
    printarray(arr,n);

    
}


int main(){
    int arr[]={2, 12, 24, 34, 96, 456, 899};
    int n = sizeof(arr) / sizeof(arr[0]);
    insertionSort(arr,n);
    return 0;
}