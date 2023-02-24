/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for implementing quick sort*/



public class Main {
	
	public static void VSDquicksort(int a[],int l,int r) {
		if(l<r) {
			int p=l+(r-l)/2;//Taking index of pivot as the mid element of array
			int pivot=a[p];//Taking pivot element
			int i=l,j=r;//Remembering initial array indices
			//Placing pivot at right place
			while(l<r) {
				if(a[l]>=pivot&&a[r]<=pivot) {
					if(a[l]==pivot)p=r;//When the place of pivot is changed, noting its index
					if(a[r]==pivot)p=l;
					VSDswapElementsAt(a,l,r);
				     r--;
				}
				else if(a[l]>pivot&&a[r]>pivot) r--;
				else l++;
			}
			//Recursively sorting remaining elements in array
			VSDquicksort(a,i,p);
			VSDquicksort(a,p+1,j);
		}
	}
	//Function to swap the elements of array
		public static void VSDswapElementsAt(int[] a,int i,int j) {
				int temp=a[i];
		     	a[i]=a[j];
		     	a[j]=temp;
		}
		
	
	//Function to print output
			public static void VSDprintOutput(int[] a) {
				System.out.println("The sorted order is:");
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println();
			}
public static void main(String args[]) {
	int[] a={1, 2, 53, 12, 45, 11, 56};
	int n=a.length;
	VSDquicksort(a,0,n-1);
	VSDprintOutput(a);
}
}
