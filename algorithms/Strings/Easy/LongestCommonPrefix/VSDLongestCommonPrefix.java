

public class Main{

    static String getMinString(String[] strs){
        String minString=strs[0];
        for(String s:strs){
            if(s.length()<minString.length())
                minString=s;
            
        }
        return minString;
    }

    static String longestCommonPrefix(String[] str){
        if(str.length==1)
            return str[0];
        String ans="";
        String minString = getMinString(str);

        for(int i=0;i<minString.length();i++){
            char ch = str[0].charAt(i);

            for(int j=0;j<str.length;j++){
                if (ch != str[j].charAt(i))
                    return ans;
            }
            ans+=ch;
        }
        return ans;

    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String ans=longestCommonPrefix(strs);
        System.out.println(ans);
    }
}