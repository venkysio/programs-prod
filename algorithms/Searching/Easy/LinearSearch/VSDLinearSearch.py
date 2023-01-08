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
arr=[1,2,3,4,5,6,7,8,9,10]
target=10
linear_search(arr,target)