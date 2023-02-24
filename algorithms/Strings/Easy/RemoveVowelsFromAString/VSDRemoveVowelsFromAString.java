
public class Main {
	

		//Function to remove vowels from the given String
		public static String VSDRemoveVowels(String s) {
			String output="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='A'||s.charAt(i)=='a'||
						s.charAt(i)=='E'||s.charAt(i)=='e'||
						s.charAt(i)=='I'||s.charAt(i)=='i'||
						s.charAt(i)=='O'||s.charAt(i)=='o'||
						s.charAt(i)=='U'||s.charAt(i)=='u') {
					continue;
				}
				else {
					output+=s.charAt(i);
				}
			}
			return output;
		}
		//Function to print output
		public static void VSDprintOutput(String out) {
			System.out.println("The string without vowels is:");
				System.out.println(out);
				
			}
public static void main(String args[]) {
	String s="vsdevelopers;";//Taking user input
	String out=VSDRemoveVowels(s);
	VSDprintOutput(out);
}
}
