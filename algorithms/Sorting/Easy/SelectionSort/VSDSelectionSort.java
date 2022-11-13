/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Selection sort*/

import java.util.*;
public class VSDSelectionSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	//Function to perform selection sort
	
	public static void VSDsort() {
		for(int i=0;i<n;i++) {
		int min=a[i];
		int minind=i;
			for(int j=i+1;j<n;j++) {
				if (a[j] < min) 
					{
						min=a[j];
						minind=j;
					}
			}
			int temp=a[i];
			a[i]=min;
			a[minind]=temp;
		}
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
