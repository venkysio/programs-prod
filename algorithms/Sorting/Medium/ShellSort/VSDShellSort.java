/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for sorting given numbers using shell sort */
import java.util.ArrayList;

public class Main {
	static int n;//size of array
	static int arr[];//array of numbers to be sorted
	//Function to perform shell sort
	public static void VSDSort() {
			int shellsize=8;
			while(shellsize>=1){
				for(int i=shellsize,k=0;i<n&&k<shellsize;){
					int key=arr[i];
					int j=i-shellsize;
					for(;j>=0;j-=shellsize){
						if(arr[j]>key){
							arr[j+shellsize]=arr[j];
						}
						else{
							break;
						}
					}
					arr[j+shellsize]=key;
					if(i+shellsize>=n){
						k+=1;
						i=k+shellsize;
					}
					else{
						i+=shellsize;
					}
				}
				shellsize=shellsize/2;
			}
	}

	
	//Function to print output
	public static void VSDprintOutput() {
		System.out.println("The sorted order is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
				
			}
			System.out.println();
		}

	public static void main(String args[]) {
	arr=new int[]{1, 2, 53, 12, 45, 11, 56};
	n=arr.length;
	VSDSort();
	VSDprintOutput();
	}
}
