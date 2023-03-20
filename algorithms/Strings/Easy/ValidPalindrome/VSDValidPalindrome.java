
public class Main {

    static boolean isPalindrome(String s) {
        String rev = "";
        for (char ch : s.toCharArray()) {
            if (ch >= 97 && ch <= 122)
                rev += ch + "";
            else if (ch >= 65 && ch <= 90)
                rev += (char) (ch + 32) + "";
        }
        int i = 0, j = rev.length() - 1;
        while (i < j)
            if (rev.charAt(i++) != rev.charAt(j--))
                return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}