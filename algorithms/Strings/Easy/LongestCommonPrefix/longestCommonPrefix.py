

# Write a function to find the longest common prefix string amongst an array of strings.

# If there is no common prefix, return an empty string "".

 

# Example 1:

# Input: strs = ["flower","flow","flight"]
# Output: "fl"
# Example 2:

# Input: strs = ["dog","racecar","car"]
# Output: ""
# Explanation: There is no common prefix among the input strings.
 

# Constraints:

# 1 <= strs.length <= 200
# 0 <= strs[i].length <= 200
# strs[i] consists of only lowercase English letters.
def getminstring(strings):
    minstring=strings[0]
    for string in strings:
        if len(string)<len(minstring):
            minstring=string
    return minstring
def longestCommonPrefix(strings : str)->str:
    if len(strings)==1:
        return strings[0]

    answer=""
    minstring=getminstring(strings)
    
    for index in range(len(minstring)):

        char=strings[0][index]

        for j in range(len(strings)):
            if char!=strings[j][index]:
                return answer
        answer+=char 
    return answer 