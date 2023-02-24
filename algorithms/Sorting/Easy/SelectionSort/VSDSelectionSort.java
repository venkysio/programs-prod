/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Selection sort*/


public class Main {
	
	//Function to perform selection sort
	
	public static void VSDsort(int n,int[] a) {
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
	
	
	//Function to print output
	public static void VSDprintOutput(int n,int[] a) {
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
