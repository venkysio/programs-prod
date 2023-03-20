public class Main{

    static int balanceStringSplit(String s){
        int check=0,answer=0;
        for(char ch:s.toCharArray()){
            if(ch=='R')check++;
            else check--;
            if(check==0) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        System.out.println(balanceStringSplit(s));
    }
}