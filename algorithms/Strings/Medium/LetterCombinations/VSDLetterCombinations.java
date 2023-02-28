

import java.util.HashMap;
import java.util.ArrayList;


public class Main{
   
    private static HashMap<Character,String> letters ;
    static {
        letters=new HashMap<Character,String>();
        letters.put('2',"abc");
        letters.put('3',"def");
        letters.put('4',"ghi");
        letters.put('5',"jkl");
        letters.put('6',"mno");
        letters.put('7',"pqrs");
        letters.put('8',"tuv");
        letters.put('9',"wxyz");

    }

    
    

    static void util(int index,String string,String digits,ArrayList<String> res){
        if(string.length() == digits.length()){
            res.add(string);
            return;
        }
        else{
            for(char ch:letters.get(digits.charAt(index)).toCharArray()){
                util(index+1,string+ch,digits,res);
            }
        }
    }
    static String letterCombinations(String digits){

        if(digits.length()==0)
            return "[]";
        ArrayList<String> res = new ArrayList<>();
        util(0,"",digits,res);
        return res.toString();

    }
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}