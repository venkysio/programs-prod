
#include<bits/stdc++.h>


void prims(int graph[][5],int n){
    bool visited[n]{false};
    int edge_count=0;
    int cost=0;
    visited[0]=true;

    while(edge_count<n-1){
        int mini=INT_MAX;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(visited[i]){
                for(int j=0;j<n;j++){
                    if(!visited[j] && graph[i][j]!=0){
                        if(mini > graph[i][j]){
                            mini = graph[i][j];
                            x=i;
                            y=j;
                        }
                    }
                }
            }
        }
        std::cout<<"edge pair is "<<x<<" "<<y<<" "<<"weight is "<<graph[x][y]<<std::endl;
        cost+=graph[x][y];
        visited[y]=true;
        edge_count+=1;
    }
    std::cout<<"The total cost of Prim's MST is "<<cost;

}



int main(){
    int v=5;
    int graph[5][5] = { { 0, 2, 0, 6, 0 },
                    { 2, 0, 3, 8, 5 },
                    { 0, 3, 0, 0, 7 },
                    { 6, 8, 0, 0, 9 },
                    { 0, 5, 7, 9, 0 } 
                };
    prims(graph,v);
    return 0;
}

