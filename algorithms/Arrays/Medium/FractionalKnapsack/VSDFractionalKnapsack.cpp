//  Copyrights to venkys.io
//  For more programs visit venkys.io 
//  CPP program for FractionalKnapsack


#include<bits/stdc++.h>

using namespace std;
struct Node
{
    int profit;
    int weight;
    float ratio;
    bool operator < (const Node& n1) const{
        return n1.ratio < ratio;
    };
};


float knapsack(vector<Node> arr,int n,int m){
  int i=0,result=0;
  while(m>0){
    if(m-arr[i].weight >=0){
      result+=arr[i].profit;
      m=m-arr[i].weight;
    }
    else{
      result +=  arr[i].ratio * m;
      m=0;
    }
    i++;
  }
  return result;
}


int main(){
    int n=7;
    int capacity=15;
    int profits[]={5,10,15,7,8,9,4};
    int weights[]={1,3,5,4,1,3,2};
   vector<Node> arr;
   for(int i=0;i<n;i++){
    Node node;
    node.profit = profits[i];
    node.weight = weights[i];
    node.ratio = (float) profits[i]/weights[i];
    arr.push_back(node);
   }
   sort(arr.begin(),arr.end());
   float result = knapsack(arr,n,capacity);
   printf("The Maximum profit is %.2f",result);
    return 0;
}