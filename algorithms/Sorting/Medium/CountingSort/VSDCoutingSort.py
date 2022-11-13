

#Function to get maximum element in the array

def VSDmax(a):
    maxele=0
    for i in a:
        if i>maxele:
            maxele=i
    return maxele
    # or return max(a)


#Function to perform counting sort

def VSDCountingSort(max:int,n,a):
    count=[0 for i in range(max+1)]    
    output=[None for i in range(n)]
    for j in range(n):
        count[a[j]]+=1
    for i in range(1,len(count)):        
        count[i]+=count[i-1]
       
    for i in range(n):       
        output[count[a[i]]-1]=a[i]
        count[a[i]]-=1 
    
    print(*output,sep=" ")   


if __name__ == "__main__":
    n=7
    arr=[2,24,12,96, 456, 899,34]
    max=VSDmax(arr) 
    VSDCountingSort(max,n,arr)