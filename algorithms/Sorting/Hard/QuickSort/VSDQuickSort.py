

 

def quicksort(arr,l,r):
    if l<r:
        p=l+(r-l)//2
        pivot=arr[p]
        i=l;j=r 
        while(l<r):
            if(arr[l]>=pivot  and arr[r]<=pivot):
                if(arr[l]==pivot):
                    p=r 
                if (arr[r]==pivot):
                    p=l 
                arr[l],arr[r]=arr[r],arr[l]
                r-=1 
            
            elif (arr[l]>pivot and arr[r]>pivot):
                r-=1 
            else:
                l+=1
        quicksort(arr,l,p)
        quicksort(arr,p+1,j)


if __name__=="__main__":
    n=7
    arr=[2,24,12,96, 456, 899,34]
    quicksort(arr,0,len(arr)-1)
    print(*arr,sep=" ")
            
