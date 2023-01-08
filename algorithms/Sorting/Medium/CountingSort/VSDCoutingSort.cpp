
#include<iostream>

using namespace std;

void countingSort(int max,int n,int arr[],int output[]){
    int count[max+1];
    for(int i=0;i<=max;i++){
        count[i]=0;
    }
    // int output[n];
    for(int j=0;j<n;j++){
        count[arr[j]]+=1;
    }
    for(int i=1;i<=max;i++){
        count[i]+=count[i-1];
    }
    for(int i=0;i<n;i++){
        output[count[arr[i]]-1]=arr[i];
    }
    for(int i=n-1;i>0;i--){
        output[count[arr[i]]-1]=arr[i];
        count[arr[i]]--;

    }
    

}
int VSDmax(int arr[],int n){
    int maxele=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>maxele){
            maxele=arr[i];
        }
    }
    return maxele;
}
int main(){
    int n=7;
    int arr[]={2,24,12,96, 456, 899,34};
    int max=VSDmax(arr,n);
    int output[n];
    countingSort(max,n,arr,output);
    for(int i=0;i<n;i++)
                cout<<output[i];
    return 0;
}
