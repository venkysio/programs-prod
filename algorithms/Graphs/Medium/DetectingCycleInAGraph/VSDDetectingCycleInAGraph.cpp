#include<bits/stdc++.h>


bool dfs(int node,std::vector<std::vector<int>>& graph,bool visited[],int parent){
    visited[node]=true;
    for(int neighbour:graph[node]){
        if(!visited[neighbour]){
            if(dfs(neighbour,graph,visited,node))
                return true;
        }
        else if(neighbour!=parent)
            return true;
    }
    return false;
}

bool isCycle(std::vector<std::vector<int>>& graph){
    int v=graph.size();
    bool visited[v]{false};
    
    for(int i=0;i<v;i++){
        if(!visited[i] && dfs(i,graph,visited,-1))
            return true ;
    
    }
    return false;
}

int main(){
    std::vector<std::vector<int>> graph={
        {1,2},
        {0,3},
        {0},
        {1}
    };
    std::cout<<isCycle(graph);
    return 0;
}