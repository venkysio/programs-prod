
# Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

# Example 1:

# Input: s = "Hello"
# Output: "hello"
# Example 2:

# Input: s = "here"
# Output: "here"
# Example 3:

# Input: s = "LOVELY"
# Output: "lovely"
 

# Constraints:
#   1 <= s.length <= 100
#   s consists of printable ASCII characters.


# By using in-built method
def toLowerCase(s):
    return s.lower()


def toLowerCase(s: str)-> str:
    ans=""
    for i in s:
        
        if ord(i) in range(65,91):
            ans+=chr(ord(i)+32)
        else:
            ans+=i 
    return ans

