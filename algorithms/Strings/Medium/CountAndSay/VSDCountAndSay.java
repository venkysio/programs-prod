public class Main{

    static String util(String s){
        String res="";
        s+="#";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) count++;
            else 
                res+=String.valueOf(count)+s.charAt(i);
        }
        return res;
    }
    static String countAndSay(int n){
        String start="1";
        for(int i=0;i<n-1;i++){
            start=util(start);
        }
        return start;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countAndSay(n));
    }
}