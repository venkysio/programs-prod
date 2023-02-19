//   Copyrights to venkys.io
//   For more programs visit venkys.io 
//   Java program for Two number sum

import java.util.HashMap;

public class Main {

	//Function to find two numbers that sum up to the given target
	static int[] twosum(int[] arr,int target){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])) return new int[]{map.get(arr[i]),i};
			else map.put(target-arr[i],i);
		}
		return  new int[]{};
	}

	
	public static void main(String args[]) {
		int[] arr={1,2,-1,4,5,6};
		int target=0;
        int[] result = twosum(arr, target);
		if(result.length==2)
			System.out.println("The two number sum elements are "+arr[result[0]]+" "+arr[result[1]]);
		else
			System.out.println("There are no such elements");
		
	}
	
}
