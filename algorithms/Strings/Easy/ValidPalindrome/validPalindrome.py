
# A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

# Given a string s, return true if it is a palindrome, or false otherwise.

 

# Example 1:

# Input: s = "A man, a plan, a canal: Panama"
# Output: true
# Explanation: "amanaplanacanalpanama" is a palindrome.
# Example 2:

# Input: s = "race a car"
# Output: false
# Explanation: "raceacar" is not a palindrome.
# Example 3:

# Input: s = " "
# Output: true
# Explanation: s is an empty string "" after removing non-alphanumeric characters.
# Since an empty string reads the same forward and backward, it is a palindrome.
 

# Constraints:

# 1 <= s.length <= 2 * 105
# s consists only of printable ASCII characters.

# Recursive approach
def isPalindrome(string,low,high):
    if low>=high:
        return True 
    if string[low]!=string[high]:
        return False
    
    return isPalindrome(string,low+1,high-1)

def ispalindrome(string):
    
    rev=""
    for char in string:
        if char.isalpha():
            rev+=char.lower()
    
    low,high=0,len(rev)-1
    while low<high:
        if rev[low]!=rev[high]:
            return False
        low+=1
        high-=1
    return True

s="A man, a plan, a canal: Panama"
a=ispalindrome(s)
print(a)