/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for auto completion of strings using tries */
public class VSDTriesAutoCompleteStrings {
	//Class to store the structure of trie
	public static class VSDTrieNode{
		VSDTrieNode []tnodes;//Array of tries node
		int DIGITS = 26;
		char character;//Actual character
		boolean endofWord;//Boolean flag to mark the end of word
		//Default constructor
		VSDTrieNode(){
			this.tnodes=new VSDTrieNode[DIGITS];
			this.character='\0';
			this.endofWord=false;
			for(int i=0;i<DIGITS;i++)
				tnodes[i] = null;
		}
	}
	//List of strings to be inserted into trie
	public static String[] stringList;
	//Root node of trie
	public static VSDTrieNode rootNode=new VSDTrieNode(); 
	
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
			//When the end of string is reached, marking the node with end of word
			if(j+1==stringList[i].length()) {
				rootNode.tnodes[(int)index].endofWord=true;
			}
		}
		//For characters already present, traversing the trie until mismatch of character is found
		else {
			if(j+1<stringList[i].length()) {
				rootNode = rootNode.tnodes[(int)index];
				VSDInsertNode(rootNode,i,j+1);
			}
			//When the end of string is reached, marking the node with end of word
			if(j+1==stringList[i].length()) {
				rootNode.tnodes[(int)index].endofWord=true;
			}
			
		}
	}
//Method to check whether the given character string pattern is present in the trie	
public static void VSDMatchString(VSDTrieNode rootNode,String s, int i) {
	if(i>=s.length()) {
		VSDAutoComplete(rootNode,s);
	}
	else {
	char c= s.charAt(i);
	int index=c-'a';
	if(rootNode.tnodes[index]==null) 
	System.out.println("no strings matched");
	else if(rootNode.tnodes[index].character==c) 
		VSDMatchString(rootNode.tnodes[index],s,i+1);
	}
}
//Method to find strings presnt in the trie that completes given string
public static void VSDAutoComplete(VSDTrieNode node,String s) {
	for(int i=0;i<25;i++) {
		if(i!=0 &&node.tnodes[i-1]!=null) {
			String temp="";
			for(int k=0;k<s.length()-1;k++) {
				temp+=s.charAt(k);
			}
			s=temp;
		}
		if(node.tnodes[i]!=null) {
			s+=node.tnodes[i].character;
			if(node.tnodes[i].endofWord==true)System.out.println(s);
			VSDAutoComplete(node.tnodes[i],s);
		}
	}
}

public static void main(String args[]) {
		stringList=new String[] {"search","seek","seaked","soak","settle","sea","setting"};
		//Inserting strings into the trie
		for(int i = 0;i<stringList.length;i++)
			 VSDInsertNode(rootNode,i,0);
		VSDMatchString(rootNode,"ab",0);
	}
}
