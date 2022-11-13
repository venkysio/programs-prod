
// package algorithms.Sorting.Medium.RadixSort;




public class VSDRadixSort {
    static int max(int arr[],int n){
        int maxele=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]>maxele){
                maxele=arr[i];
            }
        }
        return maxele;
    }
    static void countingSort(int[] arr,int n,int decimalplace){
        int[] count=new int[10];
        int[] output=new int[n];
        for(int i=0;i<10;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            int index=arr[i]/decimalplace;
            count[index%10]+=1;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int index=arr[i]/decimalplace;
            output[count[index%10]-1]=arr[i];
            count[index%10]-=1;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    static void radixSort(int[] arr,int n){
        int m=max(arr,n);
        int decimalplace=1;
        while(m/decimalplace>0){
            countingSort(arr,n,decimalplace);
            decimalplace*=10;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){
        int n=7;
        int[] arr={2,24,12,96, 456, 899,34};
        radixSort(arr,n);
    }
}
