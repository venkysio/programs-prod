/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for sorting given numbers using bucket sort */
import java.util.ArrayList;

public class Main {

	static ArrayList<Integer> temp[]=new ArrayList[10];//Array of  buckets
	//Function to perform bucket sort
	public static void VSDSort(int n,int[] arr) {
		//Creating buckets to hold certain range of numbers
		for(int i=0;i<10;i++) {
			temp[i]=new ArrayList<Integer>();
		}
		//Arranging input numbers into appropriate buckets in a sorted order using insertion sort
		for(int i=0;i<arr.length;i++) {
			int t=arr[i]/10;
			int element=arr[i];
			if(temp[t].isEmpty())
				temp[t].add(element);
			else if(element>temp[t].get(temp[t].size()-1))
				temp[t].add(element);
			else if(element< temp[t].get(0)) {
				for(int j=temp[t].size()-1;j>=0;j--)
				{	if(j+1==temp[t].size())
					temp[t].add(j+1,temp[t].get(j));
					else
					temp[t].set(j+1,temp[t].get(j));
				}
				temp[t].set(0, element);
				}
			else
			{
				for(int j=0;j<temp[t].size();j++) {
					if(element>temp[t].get(j)&&element<temp[t].get(j+1)) {
						for(int k=temp[t].size()-1;k>=j;k--) 
						{	if(k+1==temp[t].size())
								temp[t].add(k+1,temp[t].get(k));
							else
							temp[t].set(k+1,temp[t].get(k));
						}
						temp[t].set(j+1, element);
						}
				}
			}
		}
	}

	//Function to print output
	public static void VSDprintOutput() {
		System.out.println("The sorted order is:");
		for(int i=0;i<temp.length;i++) {
			for(int k=0;k<temp[i].size();k++) {
				System.out.print(temp[i].get(k)+" ");
				
			}
		}
		System.out.println();
	}
	public static void main(String args[]) {
	int[] a={1, 2, 53, 12, 45, 11, 56};
	int n=a.length;
	VSDSort(n,a);
	VSDprintOutput();
	}
}
