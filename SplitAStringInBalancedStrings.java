/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java program for Split A String In Balanced Strings*/
public class SplitAStringInBalancedStrings {
    //method to find the length of balanced string
    public static int lenghtOfBalancedString(String str){
        int len=str.length();//length of a string
        int count=0;
        int flag=0;
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch=='R'){
                count++;
            }
            if(ch=='L'){
                count--;
            }
            if(count==0){
                flag++;
            }
        }
        return flag;
    }
    //main method
    public static void main(String[] args) {
        String str="RLRRLLRLRL";
        System.out.println("Original string-"+str);
        int n;
        n=lenghtOfBalancedString(str);
        System.out.println("Length of balanced string in main string is "+n);
    }
    
}
