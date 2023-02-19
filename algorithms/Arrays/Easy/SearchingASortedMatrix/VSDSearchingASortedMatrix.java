//  Copyrights to venkys.io
//  For more programs visit venkys.io 
//  Java program for Searching a sorted Matrix


public class Main{
    static boolean searchMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int items=rows*cols;
        int low=0;
        int high=items-1;

        while(low<=high){
            int mid = (low+high)/2;
            int temp = matrix[mid/cols][mid%cols];
            if(temp==target) return true;
            else if(target<temp) high=mid-1;
            else low=mid+1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1 , 3, 5, 7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target=3;
        if(searchMatrix(matrix,target))System.out.println(target+" is found in the matrix");
        else System.out.println(target+" isnot found in the matrix");
    }
}