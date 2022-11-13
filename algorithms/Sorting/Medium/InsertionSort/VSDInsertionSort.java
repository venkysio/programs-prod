
public class VSDInsertionSort {
    static void printarray(int[] arr,int n){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    static void insertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
            arr[j]=arr[j-1];
            j--;
            }
            arr[j]=temp;
        }
        printarray(arr,n);
    }

    public static void main(String args[]){
        int[] arr={2, 12, 24, 34, 96, 456, 899};
        int n = arr.length;
        insertionSort(arr,n);
    }
}
