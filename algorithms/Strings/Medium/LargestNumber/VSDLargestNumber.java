import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main{

    static String largestNumber(int[] nums){

        ArrayList<String> arr=new ArrayList<>();

        for(int i:nums) arr.add(String.valueOf(i));
        
        Comparator<String> comp = new Comparator<String>() {
            
            @Override
            public int compare(String str1,String str2){
                return (str2+str1).compareTo(str1+str2);
            }
        };

        Collections.sort(arr,comp);

        StringBuilder ans=new StringBuilder();

        arr.forEach((s)->{
            if(s!="0")
                ans.append(s);
        });
        
        return ans.toString();
    }
    public static void main(String[] args) {

        int[] nums = {3,30,34,5,9};
        
        System.out.println(largestNumber(nums));
    }
}