#include<iostream>
#include<bits/stdc++.h>

using namespace std;
void swap(int array[],int i,int j){
    int temp=array[i];
    array[i]=array[j];
    array[j]=temp;
}
int findmin(int array[],int i,int n){
    int m=i;
    for(;i<n;i++){
        if (array[m]>array[i]){
            m=i;
        }
    }

}
void selectionSort(int array[],int n){
    for(int i=0;i<n;i++){
        int j=findmin(array,i,n);
        swap(array,i,j);
    }
    for(int i=0;i<n;i++){
        cout<<array[i]<<" ";
    }
}

int main(){
    int array[]={1,2,53,12,45,11,56};
    int n=7;
    selectionSort(array,n);
    return 0;
}
