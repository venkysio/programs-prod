// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for ThreeNumberSum

#include<iostream>
#include<bits/stdc++.h>
using namespace std;


 vector<vector<int>> threeSum(vector<int>& arr,int target) {
        vector<vector<int>> res; 
        
        sort(arr.begin(), arr.end()); 

        for (int i = 0; i < (int)(arr.size())-2; i++) {
            
            if (i == 0 || (i > 0 && arr[i] != arr[i-1])) {
                
                int low = i+1, high = (int)(arr.size())-1, sum = target - arr[i];
                
                while (low < high) {
                    if (arr[low] + arr[high] == sum) {
                        
                        vector<int> temp; 
                        temp.push_back(arr[i]); 
                        temp.push_back(arr[low]); 
                        temp.push_back(arr[high]); 
                        res.push_back(temp);
                        
                        while (low < high && arr[low] == arr[low+1]) low++;
                        while (low < high && arr[high] == arr[high-1]) high--;
                        
                        low++; high--;
                    } 
                    else if (arr[low] + arr[high] < sum) low++;
                    else high--;
               }
            }
        }
        return res;
    }
int main() {
  vector < int > arr{-1,0,1,2,-1,-4};
  int target=0;
  vector < vector < int >> ans;
  ans = threeSum(arr,target);
  cout << "The triplets are : "<< endl;
  for (int i = 0; i < ans.size(); i++) {
    for (int j = 0; j < ans[i].size(); j++) {
      cout << ans[i][j] <<" ";
    }
    cout << endl;
  }
  return 0;
}