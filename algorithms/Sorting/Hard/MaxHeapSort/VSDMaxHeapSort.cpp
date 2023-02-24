
#include<iostream>

using namespace std;

void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
void printarray(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

void VSDmaxheapify(int arr[],int n,int i){
    int large=i;
    int leftchild=(2*i)+1;
    int rightchild=(2*i)+2;

    if(leftchild<n && arr[i]<arr[leftchild])
        large=leftchild;
    if(rightchild<n && arr[large]<arr[rightchild])
        large=rightchild;
    if(large!=i){
        swap(arr,i,large);
        VSDmaxheapify(arr,n,large);
    }
}

void VSDminheapify(int arr[],int n,int i){
    int small=i;
    int leftchild=(2*i)+1;
    int rightchild=(2*i)+2;

    if(leftchild<n && arr[i]>arr[leftchild]){
        small=leftchild;
    }
    if(rightchild<n && arr[small]>arr[rightchild]){
        small=rightchild;
    }
    if(small!=i){
        swap(arr,small,i);
        VSDminheapify(arr,n,small);
    }
}


void VSDMaxheapsort(int arr[],int n){
    for(int i=(n/2)-1;i>=0;i--){
        VSDmaxheapify(arr,n,i);
    }
    for(int i=n-1;i>0;i--){
        swap(arr,i,0);
        VSDmaxheapify(arr,i,0);
    }
}
void VSDMinheapsort(int arr[],int n){
    for(int i=(n/2)-1;i>=0;i--){
        VSDminheapify(arr,n,i);
    }
    for(int i=n-1;i>0;i--){
        swap(arr,i,0);
        VSDminheapify(arr,i,0);
    }

}
int main(){
    int arr[]={5,2, 9, 12, 54, 31, 65, 31, 45, 65};
    int n=sizeof(arr)/sizeof(arr[0]);
    VSDMaxheapsort(arr,n);
    printarray(arr,n);
    VSDMinheapsort(arr,n);
    printarray(arr,n);
    return 0;
}