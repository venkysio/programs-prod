/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Merge sort*/
import java.util.Scanner;

public class VSDMergeSort {
	static int size;//size of array
	static int array[];//array of numbers to be sorted
	
	static void VSDmerge(int l, int r)
	{
		if(l<r) {
			int m =l+(r-l)/2;
			//Recursively calling merge method to divide the array
			VSDmerge(l,m);
			VSDmerge(m+1,r);
			//Combines the divided array pieces in sorted order
			VSDMergesort(l,m,r);
		}
	}
	 
   static void VSDMergesort(int l, int m, int r){
	   //Assigning sizes for temporary arrays
	   	int n1 = m-l+1;
        int n2 = r-m;
        //Temporary arrays to sort divided elements
        int Left[] = new int[n1];
        int Right[] = new int[n2];
        //Assigning elements
        for (int i=0;i<n1;i++)
            Left[i] = array[l + i];
        for (int j=0;j<n2;j++)
            Right[j] = array[m+1+j];
        //Initial indexes to sort elements using temporary arrays
        int i = 0,j = 0;
        //Index for original array
        int k = l;
        //Comparing elements to arrange them in sorted order in original array
        while (i<n1 && j<n2) {
            if (Left[i]<=Right[j]) {
                array[k]=Left[i];
                i++;
            }
            else {
                array[k]=Right[j];
                j++;
            }
            k++;
        }
        //Arranging remaining elements from left array
        while (i < n1) {
           array[k]=Left[i];
            i++;
            k++;
        }
      //Arranging remaining elements from right array
        while (j < n2) {
            array[k]=Right[j];
            j++;
            k++;
        }
        VSDprintOutput();
    }
   //Function to take user input
public static void VSDuserInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	size=sc.nextInt();
	array=new int[size];
	System.out.println("Enter numbers to sort:");
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
	}
}
//Function to print output
public static void VSDprintOutput() {
	System.out.println("The sorted order is:");
	for(int i=0;i<size;i++) {
		System.out.println(array[i]);
	}
}
public static void main(String args[]) {
	VSDuserInput();//Taking user input
	VSDmerge(0,size-1);//Calling merge for the entire array
	VSDprintOutput();//Printing output
}
}
