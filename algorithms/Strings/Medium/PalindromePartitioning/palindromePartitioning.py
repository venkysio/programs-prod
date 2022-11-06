
# # # Palindrome Partitioning

# # Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

# # A palindrome string is a string that reads the same backward as forward.

# Example 1:

# Input: s = "aab"
# Output: [["a","a","b"],["aa","b"]]
# Example 2:

# Input: s = "a"
# Output: [["a"]]
 

# Constraints:

# 1 <= s.length <= 16
# s contains only lowercase English letters.

def partition(string):
    dp=[[] for _ in range(len(string)+1)]

    dp[0]=[[]]

    for j in range(1,len(string)+1):
        for i in range(j):
            if string[i:j]==string[i:j][::-1]:
                for each in dp[i]:
                    dp[j].append(each+[string[i:j]])
    return dp[-1]

if __name__=="__main__":
    string="aab"
    print(partition(string))