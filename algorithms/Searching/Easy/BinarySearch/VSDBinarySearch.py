


def VSDBinarySearch(arr,k):
    arr.sort()
    low=0
    high=len(arr)-1
    while(low<high):
        mid=low+high//2
        if arr[mid]==k:
            return mid 
        elif k<arr[mid]:
            high=mid-1 
        else:
            low=mid+1 
    return -1


if __name__=="__main__":
    arr=[1,2,3,4,5,6,7,8,9,10]
    k=2
    print(VSDBinarySearch(arr,k))