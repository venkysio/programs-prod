// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for FourNumberSum



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    static List<List<Integer>> fourSum(int[] arr, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (arr == null || arr.length == 0)
            return res;
        
        int n = arr.length;
    
        Arrays.sort(arr); 
    
        for (int i = 0; i < n; i++) {
        
            int target_3 = target - arr[i];
        
            for (int j = i + 1; j < n; j++) {
            
                int target_2 = target_3 - arr[j];
            
                int front = j + 1;
                int back = n - 1;
            
                while(front < back) {
                
                    int two_sum = arr[front] + arr[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        List<Integer> quad = new ArrayList<>(); 
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[front]);
                        quad.add(arr[back]);
                        res.add(quad);
                    
                     
                        while (front < back && arr[front] == quad.get(2)) ++front;
                    
                        
                        while (front < back && arr[back] == quad.get(3)) --back;
                
                    }
                }
                
     
                while(j + 1 < n && arr[j + 1] == arr[j]) ++j;
            }
        
       
            while (i + 1 < n && arr[i + 1] == arr[i]) ++i;
        
        }
        
    
        return res;
    }


	public static void main (String[] args) {
		int arr[] = {1,0,-1,0,-2,2}; 
		int target = 0;

		List<List<Integer>> ls = fourSum(arr, target); 

		for(int i = 0;i<ls.size();i++) {
		    for(int j = 0;j<ls.get(i).size();j++) {
		        System.out.print(ls.get(i).get(j) + " "); 
		    }
		    System.out.println(); 
		}
	}
}