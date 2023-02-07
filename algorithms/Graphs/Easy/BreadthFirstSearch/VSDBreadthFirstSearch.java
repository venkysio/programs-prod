import java.util.*;
public class VSDBreadthFirstSearch{
    private int v;
    private LinkedList<Integer> lst[];
    //create a graph
    VSDBreadthFirstSearch(int ver){
        v=ver;
        lst=new LinkedList[v];
        for(int i=0;i<v;i++){
            lst[i]=new LinkedList();
        }
    }
    //add edges to graph
    public void addEdge(int ver,int ele){
        lst[ver].add(ele);
    }
    //BFS algorithm
    public void bfs(int s){
        boolean[] visited=new boolean[v];
        LinkedList<Integer> queue=new LinkedList();
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0){
            //removing and printing thr removed element
            s=queue.poll();
            System.out.print(s+" ");
            // iterating graph
            Iterator<Integer> i=lst[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    //driver code
    public static void main(String args[]){
        VSDBreadthFirstSearch obj=new VSDBreadthFirstSearch(6);
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
        System.out.println("The Breadth First Traversal of the graph is as follows(from 0th vertex):");
        obj.bfs(0);
    }
}