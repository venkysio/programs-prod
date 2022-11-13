
#include<iostream>

using namespace std;


void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

void quicksort(int arr[],int l,int r){
    if(l<r){
        int p=l+(r-l)/2;
        int pivot=arr[p];
        int i=l,j=r;

        while(l<r){
            if(arr[l]>pivot && arr[r]<=pivot){
                if(arr[l]==pivot) p=r;
                if(arr[r]==pivot) p=l;
                swap(arr,l,r);
                r--;
            }
            else if(arr[l]>pivot && arr[r]>pivot) r--;
            else l++;
        }
        quicksort(arr,i,p);
        quicksort(arr,p+1,j);
    }
}




int main(){
    int n=7;
    int arr[]={2,24,12,96, 456, 899,34};
    quicksort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}