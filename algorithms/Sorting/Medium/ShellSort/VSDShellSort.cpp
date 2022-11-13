

#include<iostream>

using namespace std;


void shellSort(int arr[],int n){
    int shellsize=8;
    while(shellsize>=1){
        for(int i=shellsize,k=0;i<n&&k<shellsize;){
            int key=arr[i];
            int j=i-shellsize;
            for(;j>=0;j-=shellsize){
                if(arr[j]>key){
                    arr[j+shellsize]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+shellsize]=key;
            if(i+shellsize>=n){
                k+=1;
                i=k+shellsize;
            }
            else{
                i+=shellsize;
            }
        }
        shellsize=shellsize/2;
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;

}

int main(){

    int n=7;
    int arr[] = {2,24,12,96, 456, 899,34};
    shellSort(arr,n);

    return 0;
}