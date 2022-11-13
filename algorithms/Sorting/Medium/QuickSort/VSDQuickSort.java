/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for implementing quick sort*/

import java.util.Scanner;

public class VSDQuickSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	//Method to perform quick sort
	public static void VSDquicksort(int a[],int l,int r) {
		if(l<r) {
			int p=l+(r-l)/2;//Taking index of pivot as the mid element of array
			int pivot=a[p];//Taking pivot element
			int i=l,j=r;//Remembering initial array indices
			//Placing pivot at right place
			while(l<r) {
				if(a[l]>=pivot&&a[r]<=pivot) {
					if(a[l]==pivot)p=r;//When the place of pivot is changed, noting its index
					if(a[r]==pivot)p=l;
					VSDswapElementsAt(l,r);
				     r--;
				}
				else if(a[l]>pivot&&a[r]>pivot) r--;
				else l++;
			}
			//Recursively sorting remaining elements in array
			VSDquicksort(a,i,p);
			VSDquicksort(a,p+1,j);
		}
	}
	//Function to swap the elements of array
		public static void VSDswapElementsAt(int i,int j) {
				int temp=a[i];
		     	a[i]=a[j];
		     	a[j]=temp;
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
	//Function to print output
			public static void VSDprintOutput() {
				System.out.println("The sorted order is:");
				for(int i=0;i<n;i++) {
					System.out.println(a[i]);
				}
			}
public static void main(String args[]) {
	VSDuserInput();
	VSDquicksort(a,0,n-1);
	VSDprintOutput();
}
}
