/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Radix sort*/
import java.util.Scanner;

public class Main {
	
	static int output[];//Sorted output array
	//Function to sort radixes
			public static void VSDRadix(int n,int[] a,int digits) {
				int k=0;
				int temp[]=new int[n];//Temporary array to hold radixes
				while(k<digits) {
					for(int i=0;i<n;i++) {
						if(k>0)temp[i]=(int) ((a[i]/Math.pow(10,k))%10);
						else temp[i]=a[i]%10;
						}
					VSDcountingsort(n,a,temp);
					k++;
				}
				
			}
		//Function to perform counting sort on radixes
			public static void VSDcountingsort(int n,int[] a,int temp[]) {
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
			public static int VSDMax(int n,int[] a) {
				int max=0;
				for(int i=0;i<n;i++) {
					if(a[i]>max) {
						max=a[i];
					}
				}
				return max;
			}
		
			//Function to print the output
			public static void VSDprintOutput(int n,int[] a) {
				System.out.println("The sorted array is:");
				for(int i=0;i<n;i++)
					System.out.print(a[i]+" ");
				
				System.out.println();
			}
	public static void main(String args[]) {
		int[] a={1, 2, 53, 12, 45, 11, 56};
		int n=a.length;
		int max=VSDMax(n,a);
		int d=VSDdigitcount(max);
		VSDRadix(n,a,d);
		VSDprintOutput(n,a);
	}

}
