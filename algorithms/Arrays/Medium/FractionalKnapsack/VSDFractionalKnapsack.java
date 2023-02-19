//  Copyrights to venkys.io
//  For more programs visit venkys.io 
//  Java program for FractionalKnapsack


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Node  {
    public static class OrderByRatio implements Comparator<Node>{
        @Override
        public int compare(Node n1,Node n2){
            return n1.ratio>n2.ratio ? -1 : (n1.ratio<n2.ratio ? 1 :0);
        }
    }
    int profit,weight;
    float ratio;
    Node(int profit,int weight,float ratio){
        this.profit=profit;
        this.weight=weight;
        this.ratio = ratio;
    }
}

public class Main{
    static float knapsack(ArrayList<Node> arr,int n,int m){
        int i=0,result=0;
        while(m>0){
            if(m- arr.get(i).weight>=0){
                result+=arr.get(i).profit;
                m=m-arr.get(i).weight;
            }
            else{
                result+=arr.get(i).ratio * m;
                m=0;
            }
            i+=1;
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Node> sack = new ArrayList<>();
        int n=7;
        int capacity=15;
        int[] profits={5,10,15,7,8,9,4};
        int[] weights={1,3,5,4,1,3,2};
        
        for(int i=0;i<n;i++){
            float ratio = (float) profits[i]/weights[i];
            
            Node node= new Node(profits[i],weights[i],ratio);
            sack.add(node);
            
        }
        Collections.sort(sack,new Node.OrderByRatio());
        float result = knapsack(sack, n, capacity);
        System.out.printf("The maximux profit is %.2f",result);
        

    }
}