/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Counting sort*/

import java.util.Scanner;
public class Main {
	
	static int output[];//Sorted output array
	//Function to perform counting sort
	public static void VSDsort(int n,int a[],int max) {
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
		public static int VSDMax(int n,int[] a) {
			int max=0;
			for(int i=0;i<n;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			return max;
		}
	
	//Function to print the output
		public static void VSDprintOutput() {
			System.out.println("The sorted array is:");
			for(int i=0;i<output.length;i++)
				System.out.print(output[i]+" ");
			
			System.out.println();
		}
	
public static void main(String args[]) {
	int[] a={1, 2, 53, 12, 45, 11, 56};
	int n=a.length;
	int max=VSDMax(n,a);
	VSDsort(n,a,max);
	VSDprintOutput();
}
}
