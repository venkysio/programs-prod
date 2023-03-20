import java.util.HashSet;

public class Main{

    static String[] morse_code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    static int code(String[] words){
        HashSet<String> lst=new HashSet<>();
        String ans;
        for(String word:words){
            ans="";
            for(char ch:word.toCharArray()){
                ans+=morse_code[ch-97];

            }
            lst.add(ans);
        }
        return lst.size();
    }
    public static void main(String[] args) {
        String[] words={"gin","zen","gig","msg"};
        System.out.println(code(words));
    }
}