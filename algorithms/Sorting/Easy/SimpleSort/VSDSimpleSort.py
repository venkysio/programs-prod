
def VSDSimpleSort(arr,n):
    for i in range(n):
        for j in range(n):
            if(arr[i]<arr[j]):
                arr[i],arr[j]=arr[j],arr[i]
    print(*arr,sep=" ")

if __name__=="__main__":
    n=7
    arr=[2,24,12,96, 456, 899,34]
    VSDSimpleSort(arr,n)