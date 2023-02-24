/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Simple sorting*/
public class SimpleSort {
	static int a[]={34,72,53,12,56,84,97,4,32};//array of numbers to be sorted
	static int n=a.length;//size of array
	//Function to perform simple sorting
	public static void sort() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (a[i] < a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
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