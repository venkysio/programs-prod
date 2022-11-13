/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for inserting strings Tries */
public class VSDTriesWithStrings{

public static class VSDTrieNode{
	VSDTrieNode []tnodes;//Array of tries node
	int DIGITS = 26;
	char character;//Actual character
	//Default constructor
	VSDTrieNode(){
		this.tnodes=new VSDTrieNode[DIGITS];
		this.character='\0';
		for(int i=0;i<DIGITS;i++)
			tnodes[i] = null;
	}
}
//List of strings to be inserted into trie
public static String[] stringList;
//Root node of trie
public static VSDTrieNode rootNode=new VSDTrieNode(); 
//String variable to store search string 
public static String searchstring="";
//Method to insert strings into the trie
public static void VSDInsertNode(VSDTrieNode rootNode, int i,int j)
{	//getting index to store the character 
	int index = stringList[i].charAt(j)-'a';
	//Checking for the appropriate position to inserrt character
	if(rootNode.tnodes[index] == null) {
		rootNode.tnodes[(int) index] = new VSDTrieNode();
		rootNode.tnodes[(int) index].character = stringList[i].charAt(j);
		if(j+1<stringList[i].length()) {
			rootNode = rootNode.tnodes[(int)index];
			VSDInsertNode(rootNode,i,j+1);
		}
	}
	//For characters already present, traversing the trie until mismatch of character is found
	else {
		if(j+1<stringList[i].length()) {
			rootNode = rootNode.tnodes[(int)index];
			VSDInsertNode(rootNode,i,j+1);
		}
		
	}
}
//Method to find wheather a string is present in trie
public static String VSDSearchTrieRecursive(VSDTrieNode node, String s, int j)
{
	int index = s.charAt(j)-'a';
		if(node.tnodes[index]==null)
		{	
			return searchstring;
		}
		else if(node.tnodes[index].character!='\0')
		{
			searchstring+=node.tnodes[index].character;
			if(j+1<s.length()) {
			VSDSearchTrieRecursive(node.tnodes[index],s, j+1);	
			}
			
		}
		return searchstring;
}

public static void main(String args[]) {
	stringList=new String[] {"apple","applet","amazon","azure","applet","amazing","laptop"};
	//Inserting strings into the trie
	for(int i = 0;i<stringList.length;i++)
		 VSDInsertNode(rootNode,i,0);
	String searchkey="applicable";
	searchstring="";
	String searchres=VSDSearchTrieRecursive(rootNode,searchkey,0);
	if(searchkey.contentEquals(searchres))
		System.out.println("Key found");
	else
		System.out.println("Key not found");
}
}
