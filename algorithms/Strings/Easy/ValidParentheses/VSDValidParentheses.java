import java.util.HashMap;
import java.util.Stack;

public class Main {

    static boolean validParantheses(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> valid = new HashMap<>() {
            {
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }
        };

        for (char ch : s.toCharArray()) {

            if (ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.empty())
                    return false;

                if (ch != valid.get(stack.pop()))
                    return false;

            }

        }
   
        if (stack.empty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "[](){}";
      
        if (validParantheses(s))
        System.out.println("Valid Parantheses");
        else
        System.out.println("Invalid Parantheses");
    }
}