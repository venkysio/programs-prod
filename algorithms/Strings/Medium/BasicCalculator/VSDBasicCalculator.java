import java.util.Stack;

public class Main{


    static int calculator(String s){
        Stack<Integer> stack=new Stack<>();
        int curnum=0;
        char op='+';

        for(int i=0;i<s.length();i++){

            if(s.charAt(i) >=48 && s.charAt(i) <=57)
                curnum =curnum * 10 + (int) s.charAt(i)-48;

            if(!(s.charAt(i) >=48 && s.charAt(i) <=57 && s.charAt(i)!=' ') || i==s.length()-1){
                
                if(op=='-')
                    stack.push(-curnum);

                else if(op=='+')
                    stack.push(curnum);

                else if(op=='*'){
                    int x=stack.peek();
                    stack.pop();
                    stack.push(curnum*x);
                }

                else if (op=='/'){
                    int x = stack.peek();
                    stack.pop();
                    if(x<0)
                        stack.push(-(Math.abs(x)/curnum));
                    else
                        stack.push(x/curnum);
                }
                op=s.charAt(i);
                curnum=0;
            }
        }

        int ans=0;
        while(!stack.empty()){
            ans+=stack.peek();
            stack.pop();

        }
        return ans;
    }
    public static void main(String[] args) {
        String s="3+2*2";
        System.out.println(calculator(s));

    }
}