

# Given two strings s and t, return true if t is an anagram of s, and false otherwise.

# An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

# Example 1:

# Input: s = "anagram", t = "nagaram"
# Output: true
# Example 2:

# Input: s = "rat", t = "car"
# Output: false
 

# Constraints:

# 1 <= s.length, t.length <= 5 * 104
# s and t consist of lowercase English letters.

def isAnagram(string1,string2):
    if len(string1)!=len(string2):
        return False
    
    charcount=dict()
    for char in string1:
        if char in charcount.keys():
            charcount[char]+=1
        else:
            charcount[char]=1
    
    for char in string2:
        if char not in charcount or charcount[char]==0:
            return False
        else:
            charcount[char]-=1
    
    for value in charcount.values():
        if value!=0:
            return False
    return True