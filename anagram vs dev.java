import java.util.Arrays;

public class Anagram {

    public static void isAnagram(String string1, String string2) {
        //in order to  remove ths whitespaces
        String str1 = string1.replaceAll("\\s", "");
        String str2 = string2.replaceAll("\\s", "");

        boolean result = true;
        if (str1.length() != str2.length()) {
            result = false;
        } else {
            // convert to array from lowercase string
            char[] arrayS1 = str1.toLowerCase().toCharArray();
            char[] arrayS2 = str2.toLowerCase().toCharArray();

            // sorting arrays
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);

            // comparing arrays
            result = Arrays.equals(arrayS1, arrayS2);
        }

        if (result) {
            System.out.println(string1 + " & " + string2
                    + " are anagrams");
        } else {
            System.out.println(string1 + " & " + string2
                    + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram("Keep", "Peek");
        isAnagram("Know", "Program");
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("iare","aier");
    }
}