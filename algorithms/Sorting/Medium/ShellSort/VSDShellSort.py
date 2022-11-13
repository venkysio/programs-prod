

def VSDShellSort(arr,n):
    shellsize=8
    while(shellsize>=1):
        i=shellsize
        k=0 
        while(i<n and k<shellsize):
            key=arr[i]
            j=i-shellsize
            while j>=0:
                if(arr[j]>key):
                    arr[j+shellsize]=arr[j]
                else:
                    break
                j-=shellsize
            arr[j+shellsize]=key
            if(i+shellsize)>=n:
                k+=1
                i=k+shellsize
            else:
                i+=shellsize
        shellsize=shellsize//2
    print(*arr,sep=" ")

if __name__=="__main__":
    n=7
    arr=[2,24,12,96, 456, 899,34]
    VSDShellSort(arr,n)