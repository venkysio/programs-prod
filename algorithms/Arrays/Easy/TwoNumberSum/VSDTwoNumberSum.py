#  Copyrights to venkys.io
#  For more programs visit venkys.io 
#  Python program for Two number sum

def twosum_hash(arr,k):
    hash=dict()
    for i in range(len(arr)):
        if arr[i] in hash.keys():
            return hash[arr[i]],i
        else:
            hash[k-arr[i]]=i
    return []
if __name__=="__main__":
    arr=[1,2,-1,4,5,6]
    k=0
    result=twosum_hash(arr,k)
    if(len(result)==2):
        print(f"the two elements are {arr[result[0]]} {arr[result[1]]}")
    else:
        print("There are no such elements")