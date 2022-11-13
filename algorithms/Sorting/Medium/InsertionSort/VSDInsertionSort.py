

def insertionSort(arr:list):
    for high in range(1,len(arr)):
        low=high 
        temp=arr[high]
        while low>0 and arr[low-1]>temp:
            arr[low]=arr[low-1]
            low-=1
        arr[low]=temp
    print(*arr,sep=" ")



if __name__=="__main__":
    arr=[34,456,12,96,24,899,2]
    insertionSort(arr)