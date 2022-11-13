// package algorithms.Sorting.Medium.CountingSort;

public class VSDCountingSort{

    static int VSDmax(int[] arr){
        int maxele=0;
        for(int a:arr){
            if (a>maxele){
                maxele=a;
            }
        }

        return maxele;
    }
    static void coutingSort(int max,int n,int[] arr){
        int[] count=new int[max+1];
        for(int i=0;i<=max;i++){
            count[i]=0;
        }
        int[] output=new int[n];
        for(int j=0;j<n;j++){
            count[arr[j]]+=1;
        }
        for(int i=1;i<=max;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<n;i++){
            output[count[arr[i]]-1]=arr[i];
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
  public static void main(String args[]){
    int n=7;
    int[] arr={2,24,12,96, 456, 899,34};
    int max=VSDmax(arr);
    coutingSort(max,n,arr);
  }   
}
