// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Searching a sorted Matrix


#include<iostream>
#include<bits/stdc++.h>

using namespace std;

bool searchMatrix(vector<vector<int>> &matrix,int target){
    int rows=matrix.size();
    int cols=matrix[0].size();
    int items=rows*cols;
    int low=0;
    int high=items-1;

    while(low<=high){
        int mid = (low+high)/2;
        int temp = matrix[mid/cols][mid%cols];

        if(temp==target) return true;
        else if(target<temp) high=mid-1;
        else low=mid+1;
    }
    return false;
}

int main(){
    vector<vector<int>> matrix = {
        {1 , 3, 5, 7},
        {10,11,16,20},
        {23,30,34,60}
    };
    int target=3;
    if(searchMatrix(matrix,target)) cout<<target<<" is found in the matrix";
    else cout<<target<<" is not found in the matrix";
    return 0;
}