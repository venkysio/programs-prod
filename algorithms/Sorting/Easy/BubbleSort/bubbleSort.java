

public class bubbleSort {
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void VSDbubbleSort(int[] array,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n-i-1;j++){
                if (array[j]>array[j+1]){
                    swap(array,j,j+1);
                }

            }
        }
        for(int a:array){
            System.out.print(a);
        }
    }

    public static void main(String args[]){
        int[] array={1,2,53,12,45,11,56};
        int n=array.length;
        VSDbubbleSort(array,n);

    }
}
