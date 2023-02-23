public class Main{

    static void reverseString(String[] s){
        int i=0,j=s.length-1;
        while(i<j) swap(s,i++,j--);

    }
    static void swap(String[] s,int i,int j){
        String temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public static void main(String[] args) {
        String[] s={"h","e","l","l","o"};
        reverseString(s);
        for(String a:s)System.out.print(a+" ");

    }
}