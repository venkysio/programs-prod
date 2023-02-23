import java.util.*;
public class Main{
    private LinkedList<Integer> lst[];
    private boolean[] visited;
    //create a graph
    VSDDepthFirstSearch(int ver){
        lst=new LinkedList[ver];
        visited=new boolean[ver];
        for(int i=0;i<ver;i++){
            lst[i]=new LinkedList();
        }
    }
    //add edges to graph
    public void addEdge(int ver,int ele){
        lst[ver].add(ele);
    }
    //DFS algorithm
    public void dfs(int s){
        visited[s]=true;
        System.out.print(s+" ");
        //iterating the graph
        Iterator<Integer> i=lst[s].listIterator();
        //checking for child nodes. if it is not visited then print the node
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n]){
                dfs(n);
            }
        }
    }
    //driver code
    public static void main(String args[]){
        VSDDepthFirstSearch obj=new VSDDepthFirstSearch(6);
        obj.addEdge(0, 1);
        obj.addEdge(0, 3);
        obj.addEdge(0, 4);
        obj.addEdge(4, 5);
        obj.addEdge(3, 5);
        obj.addEdge(1, 2);
        obj.addEdge(1, 0);
        obj.addEdge(2, 1);
        obj.addEdge(4, 1);
        obj.addEdge(3, 1);
        obj.addEdge(5, 4);
        obj.addEdge(5, 3);
        System.out.println("The Depth First Traversal of the graph is as follows(from 4th vertex):");
        obj.dfs(4);
    }
}