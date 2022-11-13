/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for implementing Tries */
import java.util.Arrays;

public class VSDBuildingTries {
//Class to hold the structure of a trie node
public static class VSDTrieNode{
	VSDTrieNode []tnodes;//Array of tries nodes
	int DIGITS = 10;
	private long aadharNum; //Actual aadhaar number 
	//DEfault constructor
	VSDTrieNode(){
		this.tnodes=new VSDTrieNode[DIGITS];
		this.aadharNum= -1;
		//Intially making the nodes of trie node empty
		for(int i=0;i<DIGITS;i++)
			tnodes[i] = null;
	}
}
//Standard lenght of the Aadhaar number
public static int AADHAARLENGTH=12;

public static int TOTALAADHAARNUMBERS=6;

//To access root node of the Trie
public static VSDTrieNode rootNode; 

//Convert the long aadhaar numbers to two-dimensional array for indexing
public static long[][] twodarray=new long[6][12];

//An array of input aadhaar numbers
public static long [] aadhaarList = {0};

//Method to convert given long array of aadhar numbers to a two dimensional array
public static void VSDlongto2d(long aadhar[],int n) {
	long[] local = Arrays.copyOf(aadhar, aadhar.length); 
	for(int i=0;i<n;i++) {
		for(int j=11;j>=0;j--) {
			long d=local[i]%10;
			twodarray[i][j]=d;
			local[i]=local[i]/10;
		}
	}
}
//Method to convert given long array of aadhar to long 
public static long VSDconvertlongArray2long(long [] larray)
{
	long converted2long =0L;
	
	for (int i=0;i<12;i++)
	{
		converted2long = larray[i]*10 + converted2long;
		
	}
	return converted2long;
}
//Method to convert given long aadhar to long array of digits
public static long[] VSDconvertlong2longarray(long longint)

{
	long converted2Array[] = new long[12];
	
	for (int i=11;i>=0;i--)
	{
		converted2Array[i] = longint % 10;
		longint = longint / 10;
		
	}
	return converted2Array;
}
//Method to insert aadhar number into trie
public static void VSDInsertNode(VSDTrieNode rootNode, int rowindex, int colindex)
{
	long index = twodarray[rowindex][colindex];
	//If the root node of required index is null insert the number 
	if(rootNode.tnodes[(int) index] == null)
	{
		rootNode.tnodes[(int) index] = new VSDTrieNode();
		rootNode.tnodes[(int) index].aadharNum = aadhaarList[rowindex];
		
	}

	//There is an aadhaar number already at the index, create a new node and reassign the aadhaar
	else
	{
		long existingaadhaar = rootNode.tnodes[(int) index].aadharNum;
		rootNode.tnodes[(int) index].aadharNum = -1;
		
		rootNode = rootNode.tnodes[(int)index];
		long[]existingaadhaarArray = VSDconvertlong2longarray(existingaadhaar);
		index = existingaadhaarArray[colindex+1];
		rootNode.tnodes[(int) index] = new VSDTrieNode();		

		rootNode.tnodes[(int) index].aadharNum = existingaadhaar;
		
		VSDInsertNode(rootNode, rowindex, colindex++);
	}
	return;
	
}

//Method to recursively search for an element in the trie
public static boolean VSDSearchTrieRecursive(VSDTrieNode node, long[] searchKey, int i)
{
	int index = (int) searchKey[i];
		if(node.tnodes[index]==null)
		{	
			return false;
		}
		else if(node.tnodes[index].aadharNum == -1)
		{
			
			VSDSearchTrieRecursive(node.tnodes[index],searchKey, i++);	
			
		}
		else 
		{
			System.out.println("Key found "+node.tnodes[index].aadharNum);
		}
		
	
	return true;
}
//Method to Print Trie recursively
public static void VSDPrintTrieRecursive(VSDTrieNode rootNode)
{
	for (int i=0;i<10;i++)
	{
		if(rootNode.tnodes[i]==null)
			continue;
		else if(rootNode.tnodes[i].aadharNum != -1)
			System.out.println(rootNode.tnodes[i].aadharNum);
		else if(rootNode.tnodes[i]!=null && rootNode.tnodes[i].aadharNum == -1)
			VSDPrintTrieRecursive(rootNode.tnodes[i]);	
	}
}

public static void main(String args[]) {
	 aadhaarList =new long[] {550512345678L,123456789012L,123467890123L,678901234567L,689012345678L,901234567890L};
	 rootNode = new VSDTrieNode();
	
	//Store the long aadhaar numbers into a 2-D array
	VSDlongto2d(aadhaarList,TOTALAADHAARNUMBERS);
	
	
	//Insert the aadhaar numbers into Trie here
	for(int i = 0;i<TOTALAADHAARNUMBERS;i++)
		 VSDInsertNode(rootNode,i,0);
	
	VSDPrintTrieRecursive(rootNode);	
	
	long[] searchKey = VSDconvertlong2longarray(aadhaarList[1]);
	
	if(VSDSearchTrieRecursive(rootNode,searchKey,0) != true)
		System.out.println("Key not found");

	

	}
}
