
def VSDBucketSort(arr,n):
    mini=min(arr)
    maxi=max(arr)
    bucket=[[] for i in range(n)]
    for i in range(n):
        j=n*(arr[i]-mini)//(maxi+1-mini)
        bucket[j].append(arr[i])
    i=0
    for j in range(n):
        temp=bucket[j]
        temp.sort()
        for k in range(len(temp)):
            arr[i]=temp[k]
    
    print(*arr,sep=" ")

if __name__=="__main__":
    n=7
    arr=[2,24,12,96, 456, 899,34]
    VSDBucketSort(arr,n)