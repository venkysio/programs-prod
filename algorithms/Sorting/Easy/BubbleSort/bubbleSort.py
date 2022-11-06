

def bubbleSort(array):
    for i in range(len(array)):
        for j in range(i,len(array)-1-i):
            if array[j]>array[j+1]:
                array[j],array[j+1]=array[j+1],array[j]
    print(array)

if __name__=="__main__":
    array=[1,2,53,12,45,11,56]
    bubbleSort(array)