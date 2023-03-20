public class Main {

    static void print(int[] mat) {
        for (int a : mat)
            System.out.print(a + " ");
        System.out.println();
    }

    static int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {

            int num1 = Integer.parseInt(s.substring(i - 1, i));
            int num2 = Integer.parseInt(s.substring(i - 2, i));
            if (0 < num1 && num1 <= 9)
                dp[i] = dp[i - 1];
            if (10 <= num2 && num2 <= 26)
                dp[i] += dp[i - 2];
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "12";
        System.out.println(numDecodings(s));
    }
}