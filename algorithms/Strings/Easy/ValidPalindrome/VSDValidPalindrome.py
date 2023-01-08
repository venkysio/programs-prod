.

# Recursive approach
# def isPalindrome(string,low,high):
#     if low>=high:
#         return True 
#     if string[low]!=string[high]:
#         return False
    
#     return isPalindrome(string,low+1,high-1)

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