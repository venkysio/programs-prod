public class Main{

    static int binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println("found at index "+mid);
                return mid;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Not found");
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        binarySearch(arr, 2);
        binarySearch(arr, 0);   
    }
}