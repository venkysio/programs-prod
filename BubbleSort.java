/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Bubble sort*/
public class BubbleSort {
	static int a[]={1,6,3,47,23,72,56};//array of numbers to be sorted
	static int n=a.length;//size of array
	
	//Function to perform Bubble sort
	public static void sort() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
     	            a[j]=a[j+1];
     	            a[j+1]=temp;//Swapping to place higher element correctly
                }
			}
		}
	}
		//Function to print output
		public static void printOutput() {
			System.out.println("The sorted order is:");
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
			}
		}
		public static void main(String args[]) {
			sort();//Call to sort the array
			printOutput();//Printing output
		}
}