
# # #  Group Anagrams

# # Given an array of strings strs, group the anagrams together. You can return the answer in any order.

# # An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


# Example 1:

# Input: strs = ["eat","tea","tan","ate","nat","bat"]
# Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
# Example 2:

# Input: strs = [""]
# Output: [[""]]
# Example 3:

# Input: strs = ["a"]
# Output: [["a"]]
 

# Constraints:

# 1 <= strs.length <= 104
# 0 <= strs[i].length <= 100
# strs[i] consists of lowercase English letters.


def groupAnagrams(strings):

    d=dict()
    for i in strings:
        string="".join(sorted(i))
        if string not in d.keys():
            d[string]=[i]
        else:
            d[string].append(i)
    return list(d.values())

if __name__=="__main__":
    strs = ["eat","tea","tan","ate","nat","bat"]
    print(groupAnagrams(strs))