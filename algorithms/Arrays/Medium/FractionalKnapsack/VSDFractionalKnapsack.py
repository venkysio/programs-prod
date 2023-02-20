#  Copyrights to venkys.io
#  For more programs visit venkys.io 
#  Python program for FractionalKnapsack


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
    n=7
    capacity=15
    profits=[5,10,15,7,8,9,4]
    weights=[1,3,5,4,1,3,2]
    arr=VSDcalculatepwratio(n,capacity,profits,weights)
    result=VSDknapsack(arr,n,capacity)
    VSDprint(arr,n)
    print("maximum profit is :",result)
