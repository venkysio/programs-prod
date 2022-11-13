/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Counting sort*/

import java.util.Scanner;
public class VSdCountingSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	static int output[];//Sorted output array
	//Function to perform counting sort
			public static void VSDsort(int max) {
				int count[]=new int[max+1];//Temporary array to hold the count of elements
				output=new int[n];//Sorted output array
				//Intializing all the elements of counting array to zero
				for(int i=0;i<count.length;i++)
					count[i]=0;
				//Storing the count of occurances of each element from input array to count array
				for(int i=0;i<n;i++)
					count[a[i]]++;
				//Computing cumulative sum from count array
				for(int i=1;i<count.length;i++)
					count[i]+=count[i-1];
				//For every element in input array find the cumulative sum from the respective index of count array
				//And insert theinput element in output array at index of cumulative sum-1
				for(int i=n-1;i>=0;i--)
					{
						output[count[a[i]]-1]=a[i];
						count[a[i]]--;//updating the cumulative sum
					}
			}
	
	//Function to get maximum element in the array
		public static int VSDMax() {
			int max=0;
			for(int i=0;i<n;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			return max;
		}
	//Function to take user input
	public static void VSDuserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter numbers to sort:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
	}
	//Function to print the output
		public static void VSDprintOutput() {
			System.out.println("The sorted array is:");
			for(int i=0;i<n;i++)
				System.out.println(output[i]);
			
			
		}
	
public static void main(String args[]) {
	VSDuserInput();
	int max=VSDMax();
	VSDsort(max);
	VSDprintOutput();
}
}
