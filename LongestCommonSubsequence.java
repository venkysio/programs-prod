/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for longestCommonSubsequence*/

class LongestCommonSubsequence {
    public static String lcs(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        // Create a 2D array of zeros to store the lengths of the LCSs
        int[][] lcsLengths = new int[m + 1][n + 1];

        // Calculate the lengths of the LCSs for each pair of prefixes
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lcsLengths[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcsLengths[i][j] = lcsLengths[i - 1][j - 1] + 1;
                } else {
                    lcsLengths[i][j] = Math.max(lcsLengths[i - 1][j], lcsLengths[i][j - 1]);
                }
            }
        }

        // Traverse 2D array to construct the LCS string
        int index = lcsLengths[m][n];
        char[] lcs = new char[index];
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs[--index] = s1.charAt(i - 1);
                i--;
                j--;
            } else if (lcsLengths[i - 1][j] > lcsLengths[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        // Return the LCS string
        return new String(lcs);
    }

    public static void main(String[] args) {
        System.out.println(lcs("abbcbc", "cabbcc"));
        /* Sample output*/
        // abbcc
    }
}