

public class Main{
    
    static int linearSearch(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("Found at index "+i);
                return i;
            }

        }
        System.out.println("Not found");
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr={87,48,464,16,54,18,87,87,684};
        int n=arr.length;
        linearSearch(arr,n , 54);
        linearSearch(arr, n, 0);
    }
}