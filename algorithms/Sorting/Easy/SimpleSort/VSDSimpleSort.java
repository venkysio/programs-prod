/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Simple sorting*/

public class Main {
	
	//Function to perform simple sorting
	public static void VSDsort(int n,int[] a) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (a[i] < a[j]) 
					VSDswapElementsAt(a,i,j);
			}
		}
	}
	//Function to swap the elements of array
	public static void VSDswapElementsAt(int[]a,int i,int j) {
			int temp=a[i];
	     	a[i]=a[j];
	     	a[j]=temp;
	}
	
	
	//Function to print output
	public static void VSDprintOutput(int n,int a[]) {
		System.out.println("The sorted order is:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String args[]) {
		int[] a={1, 2, 53, 12, 45, 11, 56};
		int n=a.length;
		VSDsort(n,a);//Call to sort the array
		VSDprintOutput(n,a);//Printing output
	}
}
