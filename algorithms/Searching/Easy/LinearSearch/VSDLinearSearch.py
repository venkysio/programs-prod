# program to search element using linear search
# function takes array and element to find as a parameter

def linear_search(array,element):
    for idx in range(len(array)):
        if array[idx] == element :
            print(f"The element {element} found at index {idx} in the given array")
            break
    else:
        print(f"The element {element} not found in the given array")



# Test drive code
n=int(input("Enter no of elements in array : "))
array=[int(x) for x in input(f"Enter {n} elements in to the array: ").split()]
element = int(input("Enter element to find in the array: "))
linear_search(array,element)