#Copyrights to vsdevelopers.io
#For more programs visit vsdevelopers.io 
#Python program for Heap sort using max Heap


# Function to maintain max heap properties
def VSDmaxHeapify(arr,size,i):
    #declare current element index is largest element
    large=i 

    #find index of left child
    leftchild=(2*i)+1 

    #find index of right child
    rightchild=(2*i)+2 

    # check largest element between left child and current element
    if leftchild<size and arr[i]<arr[leftchild]:
        large=leftchild
    
    # check largest element between right child and large element
    if rightchild<size and arr[large]<arr[rightchild]:
        large=rightchild
    
    # if large element is not current element 
    # swap current element with large element 
    # heapify the the current array
    if large!=i:
        arr[large],arr[i]=arr[i],arr[large]
        VSDmaxHeapify(arr,size,large)


# Function to maintain max heap properties





# Function to sort the given array using maxheap in ascending order
def VSDMaxheapsort(array):
    size=len(array)

    # Heapify the given array into maxheap
    for i in range((size//2)-1,-1,-1):
        VSDmaxHeapify(array,size,i)

    # Find the max element in array
    # Swap the max element with last index element 
    # Decrease the last index by 1
    # Heapify the current array upto last index
    for i in range(size-1,0,-1):
        array[i],array[0]=array[0],array[i]
        VSDmaxHeapify(array,i,0)
  





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
