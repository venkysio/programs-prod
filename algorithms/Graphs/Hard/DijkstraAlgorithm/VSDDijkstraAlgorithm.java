/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Dijstra's Algorithm*/

import java.util.LinkedList;

public class VSDDijkstraAlgorithm {
	//Class to represent the structure of the edge along with weights
public static class VSDEdge {
		int source;
		int destination;
		int weight;
		public VSDEdge(int source, int destination, int weight) {
			 this.source = source;
			 this.destination = destination;
			 this.weight =weight;
		}
}
//Class to represent the structure of the graph	
public static class VSDGraph{
	int vertices;//No.of vertices
	LinkedList<VSDEdge> adList[];//Adjacency list to mark the edges
	//Initializing vertices using constructor
	VSDGraph(int size){
		vertices=size;
		adList=new LinkedList[vertices];
		for(int i=0;i<vertices;i++)
			adList[i]= new LinkedList<VSDEdge>();
		}
	//Function to add edge to the graph
	public void VSDaddEgde(int source, int destination, int weight) {
		VSDEdge edge = new VSDEdge(source, destination, weight);
		adList[source].addLast(edge); // adding new edge to the list
	}
	
	
 public  void VSDdijkstra(VSDGraph graph) {
		   int count = graph.vertices;//no.of  vertices
		  boolean[] visitedVertex = new boolean[count];//Array to mark the vertices alredy visited
		   int[] distance = new int[count];
		   for (int i = 0; i < count; i++) {
			   visitedVertex[i] = false;
			   distance[i] = 999999;
		    }
		   distance[0] = 0;//Starting vertex
		    for (int i = 0; i < count; i++) {
		    		int minDistance = 999999;
		    		int u = 0;//Source vertex
		    		//Finding next minimum distance
		    		for (int k = 0; k <count; k++) {
		    			if (!visitedVertex[k] && distance[k] < minDistance) {
		    				minDistance = distance[k];
		    				u = k;
		    			}
		    		}
		    		
		    		visitedVertex[u] = true;//marking the vertex as visited and Updating the distancesof vertices connected to it
		    		LinkedList<VSDEdge> list = adList[u];
		    		 for(int j=0;j<list.size();j++) {
		    			 if ((!visitedVertex[list.get(j).destination])&& (distance[u] + list.get(j).weight<
		    					 distance[list.get(j).destination])){
		    				 distance[list.get(j).destination] = distance[u] + list.get(j).weight;
		    			 }
		    		 }
		    	
		    }
		    
		  for (int i = 0; i < distance.length; i++) {
		      System.out.println("Distance from 0 to "+i+" is "+distance[i]);
		    }

		  }
		
}

public static void main(String args[]) {
	VSDGraph g=new VSDGraph(7);
		g.VSDaddEgde(0,1,4);
		g.VSDaddEgde(1,0,4);
		g.VSDaddEgde(0,2,3);
		g.VSDaddEgde(2,0,3);
		g.VSDaddEgde(0,3,2);
		g.VSDaddEgde(3,0,2);
		g.VSDaddEgde(1,3,1);
		g.VSDaddEgde(3,1,1);
		g.VSDaddEgde(1,4,6);
		g.VSDaddEgde(4,1,6);
		g.VSDaddEgde(2,3,4);
		g.VSDaddEgde(3,2,4);
		g.VSDaddEgde(3,5,4);
		g.VSDaddEgde(5,3,4);
		g.VSDaddEgde(4,5,3);
		g.VSDaddEgde(5,4,3);
		g.VSDaddEgde(4,6,2);
		g.VSDaddEgde(6,4,2);
		g.VSDaddEgde(5,6,4);
		g.VSDaddEgde(6,5,4);
		g.VSDdijkstra(g);
	}
	}


