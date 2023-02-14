/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Linear Search*/
public class VSDLinearSearch{
    public static void VSDlinearSearch(int[] arr,int n,int key){
        int flag=0;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==key){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(key+" not found");
        }
        else{
            System.out.println(key+" found at position "+i);
        }
    }
    public static void main(String args[]){
        int[] arr={1,7,43,27,72,110,2,17,54};
        int n=arr.length;
        int key=27;
        VSDlinearSearch(arr,n,key);
    }
}
