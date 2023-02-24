
public class Main{


    static String shuffleString(String s,int[] indices){
        int n=s.length();
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
			ans[indices[i]]=""+s.charAt(i);
		}
		return String.join("",ans);
   }

    public static void main(String[] args) {
        String s= "vsdevelopers";
        int[] indices={1,11,10,9,8,7,6,5,4,3,2,0};
        System.out.println(shuffleString(s,indices));
    }
}