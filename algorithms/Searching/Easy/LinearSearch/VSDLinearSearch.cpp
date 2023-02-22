
#include<bits/stdc++.h>

using namespace std;

int linearSearch(int arr[],int n,int target){
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            cout<<"Found at index "<<i<<endl;
            return;
        }
    }
    cout<<"Not found"<<endl;
    return -1;
}

int main(){
    int arr[]{25,49,879,1984,894,6879,3419,354,165};
    int n=sizeof(arr)/sizeof(arr[0]);
    linearSearch(arr,n,894);
    linearSearch(arr,n,0);
    return 0;
}