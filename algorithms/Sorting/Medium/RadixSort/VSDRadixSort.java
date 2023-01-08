/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Radix sort*/
import java.util.Scanner;

public class VSDRadixSort {
	static int n;//size of array
	static int a[];//array of numbers to be sorted
	static int output[];//Sorted output array
	//Function to sort radixes
			public static void VSDRadix(int digits) {
				int k=0;
				int temp[]=new int[n];//Temporary array to hold radixes
				while(k<digits) {
					for(int i=0;i<n;i++) {
						if(k>0)temp[i]=(int) ((a[i]/Math.pow(10,k))%10);
						else temp[i]=a[i]%10;
						}
					VSDcountingsort(temp);
					k++;
				}
				
			}
		//Function to perform counting sort on radixes
			public static void VSDcountingsort(int temp[]) {
				int[] count=new int[10];
				output=new int[n];
				//Intializing all the elements of counting array to zero
				for(int i=0;i<count.length;i++)
					count[i]=0;
				//Storing the count of occurances of each element from input array to count array
				for(int i=0;i<n;i++) {
					count[temp[i]]++;
				}
				//Computing cumulative sum from count array
				for(int i=1;i<10;i++) {
					count[i]+=count[i-1];
				}
				//Sorting radixes
				for(int i=n-1;i>=0;i--) {
					output[count[temp[i]]-1]=a[i];
					count[temp[i]]--;
					
				}
				//Assigning output array to input array
				for(int i=0;i<n;i++) {
					a[i]=output[i];
				}
				
				
			}
	//Function to count maximum number of digits
		public static int VSDdigitcount(int max) {
			int d=0;
			while(max>0) {
				d++;
				max=max/10;
			}
			return d;
			
		}
	//Function to get maximum element in the array
			public static int VSDMax() {
				int max=0;
				for(int i=0;i<n;i++) {
					if(a[i]>max) {
						max=a[i];
					}
				}
				return max;
			}
			//Function to take user input
			public static void VSDuserInput() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter size");
				n=sc.nextInt();
				a=new int[n];
				System.out.println("Enter numbers to sort:");
				for(int i=0;i<n;i++) {
					a[i]=sc.nextInt();
				}
				sc.close();
				
			}
			//Function to print the output
			public static void VSDprintOutput() {
				System.out.println("The sorted array is:");
				for(int i=0;i<n;i++)
					System.out.println(a[i]);
				
				
			}
	public static void main(String args[]) {
		VSDuserInput();
		int max=VSDMax();
		int d=VSDdigitcount(max);
		VSDRadix(d);
		VSDprintOutput();
	}

}
