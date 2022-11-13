/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */								
/*Java program to find whether a cycle exists in given graph*/
import java.util.Iterator;
import java.util.LinkedList;

public class VSDDetectingCycleInAGraph{
	public static class VSDGraph{
		int v;
		LinkedList<Integer> adList[];
		VSDGraph(int size){
			v=size;//No.of vertices
			adList=new LinkedList[v];//Adjacency list to mark the edges
			//Initializing vertices using constructor
			for(int i=0;i<v;i++)
				adList[i]= new LinkedList<Integer>();
		}
		//Function to add edge to the graph
		void VSDaddEdge(int v1,int v2) {
			adList[v1].add(v2);
		}
		//Function to detect the cycle using BFS
		boolean VSDCycle(int s) {
			boolean visited[]=new boolean[v];//Array to mark visited vertices
			LinkedList<Integer> Queue=new LinkedList<Integer>();//Queue to traverse over vertices breadth wise
			visited[s]=true;
			Queue.add(s);
			while(Queue.size()!=0) {
				s=(int) Queue.poll();
				Iterator i=adList[s].iterator();
				while(i.hasNext()) {
					int temp=(int) i.next();
					if(visited[temp]==true)return true;
					else {
						visited[temp]=true;
						Queue.add(temp);
					}
					
				}
			}
			
		
			
			return false;
		}
	}	
	public static void main(String args[]) {
		VSDGraph g=new VSDGraph(8);
		g.VSDaddEdge(0,7);
		g.VSDaddEdge(0,2);
		g.VSDaddEdge(1,3);
		g.VSDaddEdge(1,7);
		g.VSDaddEdge(2,4);
		g.VSDaddEdge(2,6);
		g.VSDaddEdge(3,5);
		
		boolean b=g.VSDCycle(0);
		if(b)System.out.println("Cycle exists");
		else System.out.println("Cycle does not exist");
		
		
	}



}
