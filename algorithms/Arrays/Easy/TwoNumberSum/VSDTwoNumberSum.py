
def twosum(arr,k):
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):

            if arr[i]+arr[j]==k:
                return (i,j)

def twosum_hash(arr,k):
    hash=dict()
    for i in range(len(arr)):
        if arr[i] in hash.keys():
            return hash[arr[i]],i
        else:
            hash[k-arr[i]]=i

if __name__=="__main__":
    arr=[1,2,-1,4,5,6]
    k=0
    print(twosum(arr,k))
    print(twosum_hash(arr,k))