

# Given a string s, find the length of the longest substring without repeating characters.

 

# Example 1:

# Input: s = "abcabcbb"
# Output: 3
# Explanation: The answer is "abc", with the length of 3.
# Example 2:

# Input: s = "bbbbb"
# Output: 1
# Explanation: The answer is "b", with the length of 1.
# Example 3:

# Input: s = "pwwkew"
# Output: 3
# Explanation: The answer is "wke", with the length of 3.
# Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

# Constraints:

# 0 <= s.length <= 5 * 104
# s consists of English letters, digits, symbols and spaces.

def lengthOFLongestSunstring(string : str) -> int:

    start=end=ans=0
    hashset=dict()

    while end<len(string):
        if string[end] not in hashset.keys():
            hashset[string[end]]=end
            end+=1
            ans=max(len(hashset,ans))
        else:
            del hashset[string[start]]
            start+=1
    return ans 
