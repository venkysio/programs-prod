
/* Copyrights to venkys.io
For more information, visit https://venkys.io */

// C++ program to find a cycle in a graph using DFS
// Stable: Yes
// Inplace: No
// Adaptive: No

// Space complexity: O(V+E)
// Time complexity:
//| Algorithm | Best | Average | Worst     |
//|-----------|------|---------|-------    |
//| GraphCycle| Ω(V) | Θ(V + E)| O(V + E)  |
//|-----------|------|---------|-----------|

#include<bits/stdc++.h>

// function to perform DFS
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

// Function to check if there is a cycle in the graph
bool isCycle(std::vector<std::vector<int>>& graph){
    // get the number of vertices
    int v=graph.size();
    // create a visited array
    bool visited[v]{false};
    
    // call the dfs function for each node
    for(int i=0;i<v;i++){
        if(!visited[i] && dfs(i,graph,visited,-1)) //if the node is not visited and there is a cycle
            return true ;
    
    }
    return false;
}

// main function
int main(){
    // graph is represented as an adjacency list
    std::vector<std::vector<int>> graph={
        {1,2},
        {0,3},
        {0},
        {1}
    };
    // print the result of the function
    std::cout<<isCycle(graph);
    return 0;
}