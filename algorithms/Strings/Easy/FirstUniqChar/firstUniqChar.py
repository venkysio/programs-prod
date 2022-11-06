# Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

# Example 1:

# Input: s = "leetcode"
# Output: 0
# Example 2:

# Input: s = "loveleetcode"
# Output: 2
# Example 3:

# Input: s = "aabb"
# Output: -1
 

# Constraints:

# 1 <= s.length <= 105
# s consists of only lowercase English letters.


def firstUniqChar(string :str)->int:
    hashmap=dict()
    for index in range(len(string)):
        if string[index] in hashmap.keys():
            hashmap[string[index]]+=1
        else:
            hashmap[string[index]]=1
    
    for index in range(len(string)):
        if hashmap[string[index]]==1:
            return index 
    return -1