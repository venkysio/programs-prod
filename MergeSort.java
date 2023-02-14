/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Selection sort*/
public class MergeSort {
    public static void partition(int[] arr,int low, int high){
        if(low<high){//recursively calling prtition to divide array
            int mid=(low+high)/2;
            partition(arr, low,mid);
            partition(arr, mid+1, high);
            mergeSort(arr,low,mid,high);//combines the divided pieces into same array
        }
    }
    public static void mergeSort(int[] arr,int low,int mid,int high){
        //arranging sizes for temporary arrays
        int n1=mid-low+1;
        int n2=high-mid;
        //temporary arrays
        int[] larr=new int[n1];
        int[] rarr=new int[n2];
        //assigning elements to temporary arrays
        for(int i=0;i<n1;i++){
            larr[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            rarr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=low;
        //comparing elements to arrange them in sorted order in original matrix
        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        //arranging remaining elements from left array to original array
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        //arranging remaining elements from right array to original array
        while(j<n2){
            arr[k]=rarr[j];
            i++;
            j++;
        }
    }
    //method to print out the array
    public static void printOut(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //main method
    public static void main(String[] args){
        int[] arr={34,72,53,12,56,84,97,4,32};
        int n=arr.length;
        partition(arr, 0, n-1);
        printOut(arr, n);
    }
}
