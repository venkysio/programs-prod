import java.util.ArrayList;
import java.util.List;

public class Main{

    static boolean dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean[] visited,int parent){
        visited[node]=true;
        for(int neighbour:graph.get(node)){
            if(!visited[neighbour]){
                if(dfs(neighbour,graph,visited,node))
                    return true;
            }
            else if(neighbour!=parent) 
                return true;
            
        }
        return false;
    }

    static boolean isCycle(ArrayList<ArrayList<Integer>> graph){
        int v=graph.size();
        boolean[] visited = new boolean[v];
        for(int node=0;node<v;node++){
            if(!visited[node] && dfs(node,graph,visited,-1))
                return true;
        
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(){{
            add(new ArrayList<>(List.of(1,3)));
            add(new ArrayList<>(List.of(0,3)));
            add(new ArrayList<>(List.of(0)));
            add(new ArrayList<>(List.of(1)));
        }};

        System.out.println(isCycle(graph));
        
    }
}