
public class Main{

    static String convert(String s,int numRows){
        if(numRows == 1 || numRows >= s.length()) return s;

        String[] L = new String[numRows];
        for(int i=0;i<numRows;i++){
            L[i]="";
        }
        int index=0,step=1;
        for(char x:s.toCharArray()){
            L[index]+=x;
            if(index==0) step=1;
            else if(index == numRows-1) step=-1;
            index+=step;
        }
        return String.join("",L);

    }
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int numRows=4;
        System.out.println(convert(s,numRows));
    }
}