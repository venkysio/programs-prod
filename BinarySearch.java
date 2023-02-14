/*Copyrights to vsdevelopers.io*/
/*For more programs visit vsdevelopers.io */
/*Java program for Binary Search*/
public class BinarySearch{
    public static void binarySearch(int[] arr,int low,int high,int key){
        int mid;
        mid=(low+high)/2;//mid value
        while(low<=high){//checking whether mid value matches to key value
            if(arr[mid]>key){//if mid value > key value update high value
                high=mid-1;
            }
            else if(arr[mid]==key){
                System.out.println(key+" found at position "+mid);
                break;
            }
            else{//if mid value < key value update low value
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        if(low>high){
            System.out.println(key+" not found");
        }
    }
    public static void main(String[] args){
        int[] arr={1,5,7,43,63,72,78,156,220};
        int n=arr.length;//length of array(high value)
        int key=72;//key value
        binarySearch(arr, 0, n, key);
    }
}