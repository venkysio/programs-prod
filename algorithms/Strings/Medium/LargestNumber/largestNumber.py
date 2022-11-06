# # # Largest Number

# # Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

# # Since the result may be very large, so you need to return a string instead of an integer.

# Example 1:

# Input: nums = [10,2]
# Output: "210"
# Example 2:

# Input: nums = [3,30,34,5,9]
# Output: "9534330"
 

# Constraints:

# 1 <= nums.length <= 100
# 0 <= nums[i] <= 109

import functools as f 


def compare(x,y):
   
    return (x<y)-(x>y)


def largestNumber(nums):
    arr=list(map(str,nums))
    arr.sort(key=f.cmp_to_key(lambda x,y:compare(x+y,y+x)))
    return "".join(arr).lstrip("0") or "0"

if __name__=="__main__":
    nums=[3,30,34,5,9]
    print(largestNumber(nums))