import java.util.ArrayList;
import java.util.List;

class Main {
    static  boolean checkPalindrome(String str, int startIndex, int lastIndex){
        while(startIndex <= lastIndex){
            if(str.charAt(startIndex) != str.charAt(lastIndex))
                return false;
            startIndex++;
            lastIndex--;
        }
        return true;
    }
    static  void palindromePartition(int index, List<String> ds, List<List<String>> output, String str){
        if(index == str.length()){
            output.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index; i < str.length(); i++){
            if(checkPalindrome(str, index, i)){
                ds.add(str.substring(index, i + 1));
                palindromePartition(i+1, ds, output, str);
                ds.remove(ds.size()-1);
            }
        }
    }
    static List<List<String>> partition(String s) {
        List<List<String>> output = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        palindromePartition(0, ds, output, s);
        return output;
    }

    public static void main(String[] args) {
        String s="aab";
        System.out.println(partition(s));
    }

}