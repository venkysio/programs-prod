

public class Main{

    static boolean returnOrigin(String moves){
        int x=0,y=0;
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'U':y++;break;
                case 'D':y--;break;
                case 'R':x++;break;
                default:x--;
            }
        }
        if(x==0 && y==0) return true;
        return false;
    }
    public static void main(String[] args) {
        String moves="UD";
        System.out.println(returnOrigin(moves));
    }
}