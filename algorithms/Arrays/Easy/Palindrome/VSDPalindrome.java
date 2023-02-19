// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for Palindrom

public class Main {
	//Function to take user input

	//Function to compute reverse of given string and return boolean value by matching it against original string
	public static boolean VSDispalindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if (rev.equals(s)) return true;
		else return false;
		
	}
public static void main(String args[]) {
	String s="level";
	boolean b=VSDispalindrome(s);
	if(b)System.out.println(s+ "is Palindrome");
	else System.out.println("is not a Palindrome");
}
}
