
import java.util.HashMap;
public class jewelsAndStones {

    static void solution(String[][] testcases){
        int[] answers= new int[testcases.length];
        for (int i=0;i<testcases.length;i++){
            String jewel=testcases[i][0];
            String stones=testcases[i][1];
            answers[i]=count_jewels(jewel, stones);
        }
        for(int a:answers){
            System.out.print(a+" ");
        }
    }    
    

    static int count_jewels(String jewel,String stones){
        
        HashMap<Character,Integer> hash=new HashMap<>();

        int count=0;

        for(char a:jewel.toCharArray()){
            hash.put(a,0);
        }
        for(char c:stones.toCharArray()){
            if (hash.containsKey(c))
                count++;
            
        }
        return count;
    }
    public static void main(String args[]){
    String[][] testcases={{"aA","aAAbbbb"},{"z","ZZ"},{"abc","ABccds"},{"VSd","vSD"}};
    solution(testcases);
    }

}