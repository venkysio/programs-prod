// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for PrefixSum

public class Main{
    static int prefixSum(int[] arr){
        int sum=0;
        for(int item:arr)sum+=item;
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("The prefix sum is "+prefixSum(arr));
    }
}