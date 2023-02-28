
public class Main{

    static int atoi(String s) {
        int num = 0, i = 0, sign = 1;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if ((num > Integer.MAX_VALUE / 10) || ((num == Integer.MAX_VALUE / 10) && (digit > 7))) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = (num * 10) + digit;
            i++;
        }
        return num * sign;
    }
    public static void main(String[] args) {
        String s="42";
        System.out.println(atoi(s));
    }
}