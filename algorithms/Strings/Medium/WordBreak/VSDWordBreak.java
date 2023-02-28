import java.util.ArrayList;
import java.util.HashSet;

public class test{

   static boolean wordBreak(String s,ArrayList<String> words){
    HashSet<String> set = new HashSet<>(words);
    boolean[] dp = new boolean[s.length()+1];
    dp[0]=true;
    for(int i=1;i<=s.length();i++){
        for(int j=0;j<i;j++){
            if(dp[j]&& set.contains(s.substring(j, i))){
                dp[i]=true;
                break;
            }
        }
    }
    return dp[s.length()];
   }
    public static void main(String[] args) {
        String s="applepenapple";
        ArrayList<String> words=new ArrayList<>(){{ add("apple");add("pen");}};
        System.out.println(wordBreak(s,words));
    }
}