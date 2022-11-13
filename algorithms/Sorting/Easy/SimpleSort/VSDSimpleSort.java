/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Simple sorting*/

import java.util.*;
public class VSDSimpleSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	//Function to perform simple sorting
	public static void VSDsort() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (a[i] < a[j]) 
					VSDswapElementsAt(i,j);
			}
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
		VSDuserInput();//Taking user input
		VSDsort();//Call to sort the array
		VSDprintOutput();//Printing output
	}
}
