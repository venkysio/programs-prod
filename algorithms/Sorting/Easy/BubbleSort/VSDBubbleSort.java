/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Bubble sort*/


public class Main {
	
	//Function to perform Bubble sort
	public static void VSDsort(int n,int[] a) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if (a[j]>a[j+1]) 
					VSDswapElementsAt(a,j+1,j);//Swapping to place higher element correctly
			}
		}
	}
	//Function to swap the elements of array
	public static void VSDswapElementsAt(int[] a,int t1,int t2) {
		int temp=a[t1];
     	a[t1]=a[t2];
     	a[t2]=temp;
}
	
		//Function to print output
		public static void VSDprintOutput(int n,int a[]) {
			System.out.println("The sorted order is:");
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
			}
		}
		public static void main(String args[]) {
			int n=7;
			int[] a={1, 2, 53, 12, 45, 11, 56};
			VSDsort(n,a);//Call to sort the array
			VSDprintOutput(n,a);//Printing output
		}
}
