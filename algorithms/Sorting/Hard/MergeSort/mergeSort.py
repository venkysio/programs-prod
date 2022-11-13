def merge_sort(array):
    # Divide strategy
	if len(array) > 1:

		# Finding the mid index of the array
		midx = len(array)//2

		# Dividing the array elements
		Larray = array[:midx]
		Rarray = array[midx:]

		merge_sort(Larray)
		merge_sort(Rarray)
		
    # Conqure strategy
    
		idx1 = 0 # to track left array
		idx2 = 0 # to track right array
		idx = 0 # to track array

		while idx1 < len(Larray) and idx2  < len(Rarray):
			if Larray[idx1] < Rarray[idx2]:
				array[idx] = Larray[idx1]
				idx1 += 1
			else:
				array[idx] = Rarray[idx2]
				idx2 += 1
			idx += 1

		# sorting the remaining elements
		
		while idx1 < len(Larray):
			array[idx] = Larray[idx1]
			idx1 += 1
			idx += 1

		while idx2 < len(Rarray):
			array[idx] = Rarray[idx2]
			idx2 += 1
			idx += 1




# Test drive code
if __name__=="__main__":
    n=7
    array=[2, 12, 24, 34, 96, 456, 899]
    merge_sort(array)
    print(*array)