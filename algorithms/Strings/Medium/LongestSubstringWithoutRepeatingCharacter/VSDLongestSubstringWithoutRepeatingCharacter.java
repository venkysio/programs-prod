import java.util.HashMap;

public class Main{

    static int lengthOfLongestSubstring(String s){
        int start=0,end=0,ans=0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        while(end<s.length()){
            if(!map.containsKey(end)){
                map.put(s.charAt(end), end);
                end++;
                ans=Math.max(map.size(),ans);
            }
            else{
                map.remove(s.charAt(start));
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}