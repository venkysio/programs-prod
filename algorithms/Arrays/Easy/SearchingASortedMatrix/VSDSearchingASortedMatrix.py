# Copyrights to venkys.io
# For more programs visit venkys.io 
# Python program for Searching a sorted Matrix


def searchMatrix( matrix, target: int):
        rows=len(matrix)
        cols=len(matrix[0])
        items=rows*cols
        low=0
        high=items-1
        
        while low<=high:
            mid=(low+high)//2
            temp=matrix[mid//cols][mid%cols]
            
            if temp==target:
                return True
            elif target<temp:
                high=mid-1
            else:
                low=mid+1
        return False


if __name__=="__main__":
    matrix = [[1 , 3, 5, 7],
              [10,11,16,20],
              [23,30,34,60]
            ]
    target = 3
    if(searchMatrix(matrix,target)):
        print(f"{target} is found in the matrix")
    else:
         print(f"{target} is not found in the matrix")