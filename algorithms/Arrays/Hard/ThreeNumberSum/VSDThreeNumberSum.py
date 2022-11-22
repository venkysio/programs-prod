# Copyrights to vsdevelopers.io
# For more programs visit vsdevelopers.io
# Python program to solve 3 Number Sum

# Function to take userinput
def VSDUserInput():
    n=int(input("Enter the number of Elements in an array(n>=3):"))
    if n<3:
        print("Not Enough elements!")
        return 0
    print("Enter the elements with space between: ")
    arr=list(map(int,input().split()))
    target=int(input("Enter the target sum"))
    return n,arr,target


# BruteForce Method
def threesum(n,arr,target):
    ans=[]
    for i in range(n-2):
        for j in range(i+1,n-1):
            for k in range(j+1,n):
                if arr[i]+arr[j]+arr[k]==target:
                    temp=sorted([arr[i],arr[j],arr[k]])
                    if temp not in ans:
                        ans.append(temp)
    print(*ans)


# Using Hashmap or Dictionary

def VSDthreesum(n,arr,target):
    ans=[]

    for i in range(n-2):
        target=-arr[i]
        d=dict()
        for j in range(i+1,n):
            
            if target-arr[j] in d.keys():
                a=sorted([arr[i],arr[j],target-arr[j]])
                if a not in ans:
                    ans.append(a)
            else:
                d[arr[j]]=i
    if len(ans)>0:
            print("Resultant Triplets are: ",*ans)           
    else:
        print("No triplets")

# Twopointer Approach

def VSDthreesum(n,arr,target):
    ans=[]
    arr.sort()
    for i in range(n-2):
        if (i==0 or (i>0 and arr[i]!=arr[i-1])):
            low=i+1
            high=n-1
            s=-arr[i]
            while(low<high):
                if arr[low]+arr[high]==s:
                    ans.append([arr[i],arr[low],arr[high]])
                    while(low<high and arr[low]==arr[low+1]):
                        low+=1
                    while(low<high and arr[high]==arr[high-1]):
                        high-=1
                    low+=1
                    high-=1
                elif (arr[low]+arr[high])<s:
                    low+=1
                else:
                    high-=1
    if len(ans)>0:
        print("Resultant Triplets are: ",*ans)           
    else:
        print("No triplets")

if __name__=="__main__":

    n,arr,target=VSDUserInput()
    VSDthreesum(n,arr,target)
