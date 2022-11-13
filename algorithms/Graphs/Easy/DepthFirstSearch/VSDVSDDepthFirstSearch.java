/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */	
/*Java program to perform DFS on a graph*/
/*The graph is represented using adjacency list*/
import java.util.*;


public class VSDDepthFirstSearch {

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
			//Function to perform DFS, taking initial vertex as parameter
			void VSD_Dfs(int s) {
				System.out.println("The DFS of given graph is:");
				boolean visited[]=new boolean[v];//Array to mark visited vertices
				LinkedList<Integer> stack=new LinkedList<Integer>();//Queue to traverse over vertices depth wise
				visited[s]=true;
				stack.push(s);
				while(stack.size()!=0) {
					s=(int) stack.pop();
					System.out.println(s);
					Iterator i=adList[s].iterator();
					while(i.hasNext()) {
						int temp=(int) i.next();
						if(visited[temp]!=true) {
							visited[temp]=true;
							stack.push(temp);
						}
						
					}
				}
				
			}
		}
		public static void main(String args[]) {
			VSDGraph g=new VSDGraph(15);
			g.VSDaddEdge(0,1);
			g.VSDaddEdge(0,2);
			g.VSDaddEdge(1,3);
			g.VSDaddEdge(1,4);
			g.VSDaddEdge(2,5);
			g.VSDaddEdge(2,6);
			g.VSDaddEdge(3,7);
			g.VSDaddEdge(3,8);
			g.VSDaddEdge(4,9);
			g.VSDaddEdge(4,10);
			g.VSDaddEdge(5,11);
			g.VSDaddEdge(5,12);
			g.VSDaddEdge(6,13);
			g.VSDaddEdge(6,14);
			g.VSD_Dfs(0);
			
		}

	}
