/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for sorting given numbers using shell sort */
import java.util.ArrayList;
import java.util.Scanner;
public class VSDShellSort {
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
	//Function to take user input
	public static void VSDuserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter numbers to sort:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	}
	//Function to print output
	public static void VSDprintOutput() {
		System.out.println("The sorted order is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
				
			}
		}

	public static void main(String args[]) {
	VSDuserInput();//Taking user input
	VSDSort();
	VSDprintOutput();
	}
}
