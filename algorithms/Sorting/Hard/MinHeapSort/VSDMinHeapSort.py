#Copyrights to vsdevelopers.io
#For more programs visit vsdevelopers.io 
#Python program for Heap sort using max Heap



# Function to maintain max heap properties
def VSDminHeapify(arr,size,i):
    
    #Declare the current element index as smallest
    small=i

    #Find the index of leftchild element
    leftchild=(2*i)+1

    #Find the index of rightchild element
    rightchild=(2*i)+2

    #Check the smallest element between leftchild and current element
    if leftchild<size and arr[i]>arr[leftchild]:
        small=leftchild
    
    #Check the smallest element between rightchild and smallest element
    if rightchild<size and arr[small]>arr[rightchild]:
        small=rightchild
    
    # If smallest element is not current element
    # Swap the smallest element and current element
    # Heapify the current array
    if small!=i:
        arr[small],arr[i]=arr[i],arr[small]
        VSDminHeapify(arr,size,small)





# Function to sort the given array using minheap in descending order
def VSDMinheapsort(array):
    size=len(array)

    # Heapify the given array into min heap
    for i in range((size//2)-1,-1,-1):
        VSDminHeapify(array,size,i)
    
    # Find the min element in array
    # Swap the min element with last index element
    # Decrease the last index by 1
    # Heapify the current array upto last index
    for i in range(size-1,-1,-1):
        array[0],array[i]=array[i],array[0]
        VSDminHeapify(array,i,0)





#Fucntion to print array
def printarray(array):

    for i in array:
        print(i,end=" ")
    print()


if __name__=="__main__":
    arr=[5,2, 9, 12, 54, 31, 65, 31, 45, 65]
    print("Sorted array using maxheapsort:")
    VSDMaxheapsort(arr)
    printarray(arr)
    print("Sorted array using minheapsort:")
    VSDMinheapsort(arr)
    printarray(arr)    
