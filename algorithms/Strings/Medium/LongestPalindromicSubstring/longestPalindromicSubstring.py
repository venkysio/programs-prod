# # Longest Palindromic Substring

# Given a string s, return the longest palindromic substring in s.

# A string is called a palindrome string if the reverse of that string is the same as the original string.

 

# Example 1:

# Input: s = "babad"
# Output: "bab"
# Explanation: "aba" is also a valid answer.
# Example 2:

# Input: s = "cbbd"
# Output: "bb"
 

# Constraints:

# 1 <= s.length <= 1000
# s consist of only digits and English letters.


def expandFromCenter(string,left,right):
    global maxlength
    global start
    while left>-1 and right<len(string) and string[left]==string[right]:
        left-=1
        right+=1
    if maxlength<right-left-1:
        maxlength=right-left-1
        start=left+1
global maxlength 
maxlength=0

global start
start=0
def longestPalindrome(string):
    global maxlength
    global start
    for i in range(len(string)):
        expandFromCenter(string,i,i)
        expandFromCenter(string,i,i+1)
    return string[start:start+maxlength]


if __name__=="__main__":
    string="badad"
    print(longestPalindrome(string))