
def VSDInsertionSort(arr,n):
    for i in range(1,n):
        temp=arr[i]
        j=i 
        while j>0 and arr[j-1]>temp:
            arr[j]=arr[j-1]
            j-=1
        arr[j]=temp 
    print(*arr,sep=" ")

if __name__=="__main__":
    n=7
    arr=[2,24,12,96, 456, 899,34]
    VSDInsertionSort(arr,n)