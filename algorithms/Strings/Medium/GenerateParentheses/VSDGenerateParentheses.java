import java.util.ArrayList;
import java.util.Stack;

public class Main {

    static String tostring(Stack<Character> stack){
        StringBuilder res=new StringBuilder();
        stack.forEach((ele)->{
            res.append(ele);
        });
        return res.toString();
    }

    static void util(int start, int end, int n, Stack<Character> stack, ArrayList<String> res) {
        if (start == end && end == n){
           
            res.add(tostring(stack));

        }

        if (start < n) {
            stack.push('(');
            util(start + 1, end, n, stack, res);
            stack.pop();
        }
        if (end < start) {
            stack.push(')');
            util(start, end + 1, n, stack, res);
            stack.pop();
        }
    }

    static ArrayList<String> generateParantheses(int n) {
        Stack<Character> stack = new Stack<>();
        ArrayList<String> res = new ArrayList<>();
        util(0, 0, n, stack, res);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = generateParantheses(2);
        for (String s : ans)
            System.out.print(s + " ");
        System.out.println();
    }
}