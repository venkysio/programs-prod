
public class Main{

    static void colNo(String s){
        int len=s.length();
        if(len==0){
            System.out.println("Empty String");
            return;
        }
        int sum=0;
        for(int i=0;i<len;i++){
            sum=(sum*26+((int)s.charAt(i)-64));

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String s="AA";
        
    }
}