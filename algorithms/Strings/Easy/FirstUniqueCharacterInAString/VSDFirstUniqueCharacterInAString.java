


import java.util.HashMap;


public class Main {
    static int firstuniqchar(String s){
        HashMap<Character,Integer> hashmap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            int count=hashmap.containsKey(x) ? hashmap.get(x):0;
            hashmap.put(x,count+1);
        }
        for(int i=0;i<s.length();i++){
            int value=hashmap.get(s.charAt(i));
            if(value==1){
                return i;
            }
        }


        return -1;

    }
    public static void main(String args[]){
        String s="vsdevelopers";
        int ans=firstuniqchar(s);
        System.out.println(ans);
    }
}
