#Copyrights to vsdevelopers.io
#For more programs visit vsdevelopers.io 
#Python program for knapsack problem using greedy algorithm


# Function to take user input
def VSDuserinput():
    n=int(input("Enter the number of items: "))
    m=int(input("Enter the capacity of knapsack: "))
    p=list(map(int,input("Enter the profits of each item with space between: ").split()))
    w=list(map(int,input("Enter the weights of each item with space between: ").split()))
    return n,m,p,w



# Function to calculate P/W ratio
def VSDcalculatepwratio(n,m,p,w):
    ratioarray=[[0 for i in range(3)] for i in range(n)]
    for i in range(n):
        ratioarray[i][0]=p[i]
        ratioarray[i][1]=w[i]
        ratioarray[i][2]=p[i]/w[i]

    return sorted(ratioarray ,reverse=True,key=lambda x:x[2])


# Function to find maximum profit possible
def VSDknapsack(sortedarray,n,m):
    
    i=result=0
    while m>0:
        if m-sortedarray[i][1]>=0:
            result+=sortedarray[i][0]
            m=m-sortedarray[i][1]
            
        else:
            result+=sortedarray[i][2]*m
            m=0
        i+=1
    return "{:.2f}".format(result)

    

# Function to print array
def VSDprint(sortedarray,n):
    print("\nProfits:")
    for i in range(n):
        print(sortedarray[i][0],end="  ")
    print("\nweights:")
    for i in range(n):
        print(sortedarray[i][1],end="  ")
    print("\nP/W ratio:")
    for i in range(n):
        print(sortedarray[i][2],end="  ")
    print("\n")


# Main Function
if __name__=="__main__":
    n,capacity,profits,weights=VSDuserinput()
    arr=VSDcalculatepwratio(n,capacity,profits,weights)
    result=VSDknapsack(arr,n,capacity)
    VSDprint(arr,n)
    print("maximum profit is :",result)
