

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