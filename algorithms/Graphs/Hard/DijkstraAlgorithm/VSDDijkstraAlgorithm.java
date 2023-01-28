
public class VSDDijkstraAlgorithm {
    static final int totalVertex=9;
    //compute the shortest distance
    public int minimumDistance(int distance[],boolean spSpent[]){
        int m=Integer.MAX_VALUE,m_index=-1;
        for(int i=0;i<totalVertex;i++){
            if(spSpent[i]==false && distance[i]<=m){
                m=distance[i];
                m_index=i;
            }
        }
        return m_index;
    }
    //a unity method to display the built distance array
    public void display(int distance[],int n){
        System.out.println("The shortest distance from source node to all other nodes are:");
        for(int i=0;i<n;i++){
            System.out.println("To "+i+" the shortest distance is:"+distance[i]);
        }
    }
    //dijkstra algorithm
    public void dijkstra(int graph[][],int s){
        int[] distance=new int[totalVertex];
        boolean[] spSet=new boolean[totalVertex];
        for(int i=0;i<totalVertex;i++){
            distance[i]=Integer.MAX_VALUE;
            spSet[i]=false;
        }
        //distance from the source vertex to itself is 0
        distance[s]=0;
        //compute the shortest path
        for(int j=0;j<totalVertex;j++){
            int ux=minimumDistance(distance, spSet);
            spSet[ux]=true;
            //updating the distance value of the neighbour vertices
            for(int k=0;k<totalVertex;k++){
                if(!spSet[k] && graph[j][k]!=-1 && distance[j]!=Integer.MAX_VALUE && distance[j]+graph[j][k]<distance[k]){
                    distance[k]=distance[j]+graph[j][k];
                }
            }
        }
        display(distance, totalVertex);
    }
    //driver code
    public static void main(String args[]){
        int[][] graph=new int[][] { { -1, 3, -1, -1, -1, -1, -1, 7, -1 },  
        { 3, -1, 7, -1, -1, -1, -1, 10, 4 },  
        { -1, 7, -1, 6, -1, 2, -1, -1, 1 },  
        { -1, -1, 6, -1, 8, 13, -1, -1, 3 },  
        { -1, -1, -1, 8, -1, 9, -1, -1, -1 },  
        { -1, -1, 2, 13, 9, -1, 4, -1, 5 },  
        { -1, -1, -1, -1, -1, 4, -1, 2, 5 },  
        { 7, 10, -1, -1, -1, -1, 2, -1, 6 },  
        { -1, 4, 1, 3, -1, 5, 5, 6, -1 } };
        VSDDijkstraAlgorithm obj=new VSDDijkstraAlgorithm();
        obj.dijkstra(graph, 0);
    }
}
