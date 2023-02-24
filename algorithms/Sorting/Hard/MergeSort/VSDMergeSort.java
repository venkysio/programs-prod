/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Merge sort*/


public class Main {
	
	
	static void VSDmerge(int[] array,int l, int r)
	{
		if(l<r) {
			int m =l+(r-l)/2;
			//Recursively calling merge method to divide the array
			VSDmerge(array,l,m);
			VSDmerge(array,m+1,r);
			//Combines the divided array pieces in sorted order
			VSDMergesort(array,l,m,r);
		}
	}
	 
   static void VSDMergesort(int[] array,int l, int m, int r){
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
        
    }
   //Function to take user input

//Function to print output
public static void VSDprintOutput(int[] array) {
	System.out.println("The sorted order is:");
	for(int a:array){
        System.out.print(a+" ");
    }
    System.out.println();
}
public static void main(String args[]) {
	int[] array={1, 2, 53, 12, 45, 11, 56};
    int size=array.length;
	VSDmerge(array,0,size-1);//Calling merge for the entire array
	VSDprintOutput(array);//Printing output
}
}
