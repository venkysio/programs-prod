/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Selection sort*/
class SelectionSort{
	static int a[]={34,72,53,12,56,84,97,4,32};//array of numbers to be sorted
	static int n=a.length;//size of array
	//Function to perform selection sort
	public static void sort() {
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
	public static void printOutput() {
		System.out.println("The sorted order is:");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
        System.out.println();
	}
	public static void main(String args[]) {
		sort();//Call to sort the array
		printOutput();//Printing output
	}
}