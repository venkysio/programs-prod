public class Main {

    static String toLowerCase(String s) {

        String ans = "";
        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 90) {
                
                ans += "" + (char)(ch+32);
            } else
                ans += "" + ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "UpperCase";
        System.out.println(toLowerCase(s));
    }
}