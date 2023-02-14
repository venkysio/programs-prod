/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Insertion Sort*/
public class InsertionSort {
	
	static int a[]={27,54,17,73,91,45,36,89};//array of numbers to be sorted
    static int n=a.length;//size of array
	//Function to perform Insertion sort
	public static void sort() {
		//Inserting elements while sorting
		for (int i = 1; i < n; ++i){ 
            //Taking next element
            int key = a[i]; 
            int j = i-1; 
            //Comparing existing elements with new element
			while (j>=0 && a[j]>key){ 
			    a[j + 1] = a[j]; //Finding correct place for the new element
			    j = j - 1; 
			} 
			a[j + 1] = key; 
		}	
	}
    //Function to print output
    public static void printOutput() {
        System.out.println("The sorted order is:");
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }
	}
	public static void main(String args[]) {//Main method
		sort();//Call to sort the array
		printOutput();//Printing output	
	}
	
}