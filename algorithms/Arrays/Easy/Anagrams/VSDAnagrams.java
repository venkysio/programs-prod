
// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Anagrams

import java.util.HashMap;
import java.util.Map;

public class Main {
    static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            int value = map.getOrDefault(map, 0);
            if(value==0)
                return false ;
            map.put(ch,value-1);
        }
        return true;
    }
    public static void main(String[] args) {
            String s1="hello";
            String s2="olleh";
            if(isAnagram(s1,s2)){
                System.out.println(s1+" and "+s2+" are Anagrams");
            }
            else{
                System.out.println(s1+" and "+s2+" are not Anagrams");
            }
    }
}
