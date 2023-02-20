#  Copyrights to venkys.io
#  For more programs visit venkys.io 
#  Python program for PrefixSum

def prefixSum(arr):
    for i in range(1,len(arr)):
        arr[i]+=arr[i-1]
    print(*arr )

arr=[1,2,3,4,5,6]
prefixSum(arr)