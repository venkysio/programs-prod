
#include<iostream>

using namespace std;

void VSDInsertionSort(int arr[],int n){
    for(int i=1;i<n;i++){
        int temp=arr[i];
        int j=i;
        while(j>0 && arr[j-1]>temp){
            arr[j]=arr[j-1];
            j--;
        }
        arr[j]=temp;
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main(){
    int n=7;
    int arr[]={2,24,12,96, 456, 899,34};
    VSDInsertionSort(arr,n);
    return 0;
}