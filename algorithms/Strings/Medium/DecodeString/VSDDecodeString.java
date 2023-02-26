import java.util.Stack;

public class Main {

    static String decodeString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> ans = new Stack<>();
        StringBuilder str = new StringBuilder();
        int curNum = 0;
        for (char ch : s.toCharArray()) {
            
            if (ch >= 48 && ch <= 57) {
                curNum = curNum * 10 + (ch - '0');
            } else if (ch == '[') {
                stack.push(curNum);
                ans.push(str);
                curNum = 0;
                str = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder temp=str;
                int num = stack.peek();
                stack.pop();
                str=ans.peek();ans.pop();
                while(num-->0){
                    str.append(temp);
                    
                }
                
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[bc]]";
        System.out.println(decodeString(s));
    }
}