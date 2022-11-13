

# Function to get maximum element in the array:
def vsdmax(arr: list):
    return max(arr)


# Function to perform counting sort
def vsdcountingsort(arr: list,decimalplace:int ):
    
    size=len(arr)

    # Create count array of length 10 (0-9 are decimal literals)
    count=[0 for i in range(10)]

    # Create a output array to hold sorted elements
    output=[None for i in range(size)]
    
    # Iterate through the  given array
    for i in range(size):

        # Find the element according to the decimal place likes ones,tens...
        index=arr[i]//decimalplace

        # Count each element and store in count array 
        # mod 10 is used to isolate element from the number
        count[index%10]+=1
        
    # Iterate through the count array 
    # and add previous element value to current element
    for i in range(1,len(count)):
        count[i]+=count[i-1]

    # Iterate from end of outpurt array
    # Find the max element and place it in the output array
    for i in range(size-1,-1,-1):
        index=arr[i]//decimalplace
        output[count[index%10]-1]=arr[i]
        count[index%10]-=1
    
    # Replace the element of given array from output array
    for i in range(size):
        arr[i]=output[i]


# Function to perform radix sort
def vsdradixsort(arr:list):

    # Find the max element in array
    m=max(arr)

    # Start from the ones place 
    # Sort the elements using counting sort on place value
    decimalplace=1
    while m//decimalplace >0:
        vsdcountingsort(arr,decimalplace)
        decimalplace*=10
    print(*arr,sep=" ")



if __name__=="__main__":
    n=7
    array=[2,24,12,96, 456, 899,34]
    vsdradixsort(array)
