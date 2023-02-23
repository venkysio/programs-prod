#include<bits/stdc++.h>

using namespace std;


class Graph{
    
    public:
        int size;
        vector<vector<int>> graph;
        Graph(int v){
            size=v;
            graph.resize(v);
        }
        void addEdge(int v,int child){
            graph[v].push_back(child);
        }

        void dfs(int start){
            stack<int> s;
            vector<bool> visited(size,false);
            s.push(start);
            visited[start]=true;
            while(!s.empty()){                            
               start = s.top();
               s.pop();
               cout<<start<<" ";
                for(auto it:graph[start]){
                    
                    if(!visited[it]){
                        visited[it]=true;
                        s.push(it);
                    }
                }

            }

        }

};

int main(){
    Graph g(4);
    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(1,2);
    g.addEdge(2,0);
    g.addEdge(2,3);
    g.addEdge(3,3);
    g.dfs(0);
    return 0;
}