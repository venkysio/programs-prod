
# # # Reorganize String

# # Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

# # Return any possible rearrangement of s or return "" if not possible.

# Example 1:

# Input: s = "aab"
# Output: "aba"
# Example 2:

# Input: s = "aaab"
# Output: ""
 

# Constraints:

# 1 <= s.length <= 500
# s consists of lowercase English letters.

import math
from collections import Counter

def issame(d):
    val=max(d.values())
    for i in d.values():
        if i!=val:
            return False
    return True 


def reorganizeString(string):
    d=dict()
    for i in string:
        if i in d.keys():
            d[i]+=1
        else:
            d[i]=1
    
    if max(d.values())>math.ceil(len(string)/2):
        return ""
    
    if issame(d):
        arr=list(sorted(string))
    else:
        arr=list(sorted(string,reverse=True,key=lambda x:d[x]))
    
    ans=[""]*len(string)
    
    j=0
    for i in range(0,len(arr),2):
        ans[i]=arr[j]
        j+=1
    for i in range(1,len(arr),2):
        ans[i]=arr[j]
        j+=1
    return ("").join(ans)


if __name__=="__main__":

    string="aab"
    print(reorganizeString(string))