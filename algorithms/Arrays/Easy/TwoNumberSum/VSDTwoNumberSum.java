/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program to return any two numbers that sum up to given target*/
import java.util.Scanner;
public class VSDTwoNumberSum {
	static int n;//size of array
	static int arr[];//array of numbers
	static int target;//target number
	//Function to take user input
	public static void VSDuserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter numbers of array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target sum:");
		target=sc.nextInt();
	}
	//Function to find two numbers that sum up to the given target
	public static void VSDsum() {
		int[] res=new int[2];//Holds the resultant numbers
		int j=0,i=j+1;//Initial indexes to traverse the array
		int e=arr[j];
		while(i<arr.length&&j<arr.length) {
			if(arr[i]==target-e) {
				res[0]=e;
				res[1]=arr[i];
				break;
			}
			i++;
			if(i==arr.length) {
				e=arr[j++];
				i=j+1;
				
			}
		}
		System.out.println("result:");
		for(int k:res) {
			System.out.println(k);
		}
	}
	
	public static void main(String args[]) {
		VSDuserInput();
		VSDsum();
		
		
	}
	
}
