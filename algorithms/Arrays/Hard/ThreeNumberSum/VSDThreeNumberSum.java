// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for ThreeNumberSum


import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    static ArrayList < ArrayList < Integer >> threeSum(int[] arr,int target){
        Arrays.sort(arr);
        ArrayList < ArrayList < Integer >> res = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            if(i==0 || (i>0 && arr[i] != arr[i-1] )){
                int low=i+1,high=arr.length-1,sum=target-arr[i];
                while(low<high){
                    if(arr[low]+arr[high]==sum){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);
                        res.add(temp);
                        
                        while(low<high && arr[low] == arr[low+1])low++;
                        while(low<high && arr[high]==arr[high-1])high--;

                        low++;
                        high--;
                    }
                    else if (arr[low]+arr[high]<sum)low++;
                    else high--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ArrayList < ArrayList < Integer >> ans;
        int target=0;
        ans = threeSum(arr,target);
        System.out.println("The triplets are :");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}   
