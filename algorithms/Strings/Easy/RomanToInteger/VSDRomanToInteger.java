import java.util.HashMap;

public class Main{

    static int romanToInt(String s){
        HashMap<String,Integer> d=new HashMap<>(){{
            put("M", 1000);
            put("CM", 900);
            put("D", 500);
            put("CD", 400);
            put("C", 100);
            put("XC", 90);
            put("L", 50);
            put("XL", 40);
            put("X", 10);
            put("IX", 9);
            put("V", 5);
            put("IV", 4);
            put("I", 1);
        }};

        int ans=0,i=0;
        int n=s.length();

        while(i<n){
            if(i!=n-1 && (s.charAt(i)=='I' ||  s.charAt(i)=='X' || s.charAt(i)=='C') && d.containsKey(s.charAt(i)+s.charAt(i+1))){
                ans+=d.get(""+s.charAt(i)+s.charAt(i+1));
                i+=2;
            }
            else{
                ans+=d.get(""+s.charAt(i));
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        System.out.println(romanToInt("VI"));
    }
}