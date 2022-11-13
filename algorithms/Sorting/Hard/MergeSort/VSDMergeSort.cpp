
#include<iostream>

using namespace std;


void VSDmerge(int arr[],int l,int m,int r){

    int n1=m-l+1;
    int n2=r-m;

    int left[n1];
    int right[n2];

    for(int i=0;i<n1;i++){
        left[i]=arr[l+i];
    }
    for(int j=0;j<n2;j++){
        right[j]=arr[m+1+j];
    }
    int i=0,j=0;
    int k=l;
    while(i<n1 && j<n2){
        if(left[i]<=right[j]){
            arr[k]=left[i];
            i++;
        }
        else{
            arr[k]=right[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k]=left[i];
        i++;
        k++;
    }

    while(j<n2){
        arr[k]=right[j];
        j++;
        k++;
    }
    

}
void VSDmergesort(int arr[],int l,int r){
    if(l<r){
        int m=l+(r-l)/2;
        VSDmergesort(arr,l,m);
        VSDmergesort(arr,m+1,r);
        VSDmerge(arr,l,m,r);
    }
}
int main(){
    int n=7;
    int arr[]={2,24,12,96, 456, 899,34};
    VSDmergesort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";

    }
    cout<<endl;
    return 0;
}