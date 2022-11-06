


def findmin(arr,left,right):
    m=left
    for i in range(left,right):
        if arr[i]<arr[left]:
            m=i 
    return m 
def selectionSort(arr):
    for i in range(len(arr)):
        j=findmin(arr,i,len(arr))
        arr[i],arr[j]=arr[j],arr[i]
    print(*arr)


if __name__=="__main__":
    arr=[1,2,53,12,45,11,56]
    selectionSort(arr)

