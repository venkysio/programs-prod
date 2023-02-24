/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Insertion Sort*/



public class Main {
	
	//Function to perform Insertion sort
	public static void VSDsort(int n,int[] a) {
		//Inserting elements while sorting
				for (int i = 1; i < n; ++i)  
				{ 
				//Taking next element
				 int key = a[i]; 
				 int j = i-1; 
				 //Comparing existing elements with new element
				 while (j>=0 && a[j]>key)  
				  { 
				  a[j + 1] = a[j]; //Finding correct place for the new element
				  j = j - 1; 
				  } 
				 a[j + 1] = key; 
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
