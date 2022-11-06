
# # # Basic Calculator II

# # Given a string s which represents an expression, evaluate this expression and return its value. 

# # The integer division should truncate toward zero.

# # You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

# # Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

# Example 1:

# Input: s = "3+2*2"
# Output: 7
# Example 2:

# Input: s = " 3/2 "
# Output: 1
# Example 3:

# Input: s = " 3+5 / 2 "
# Output: 5
 

# Constraints:

# 1 <= s.length <= 3 * 105
# s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
# s represents a valid expression.
# All the integers in the expression are non-negative integers in the range [0, 231 - 1].
# The answer is guaranteed to fit in a 32-bit integer.



def calculator(s):
    stack=list()
    curnum=0
    op="+"
    for i in range(len(s)):
        if s[i].isdigit():
            curnum=curnum*10+int(s[i])
        if (not (s[i].isdigit()) and s[i]!=" ") or i==len(s)-1:
            if op=="-":
                stack.append(-curnum)
            elif op=="+":
                stack.append(curnum)
            elif op=="*":
                stack.append(stack.pop()*curnum)
            elif op=="/":
                x=stack.pop()
                if x<0:
                    stack.append(-(abs(x)//curnum))
                else:
                    stack.append(x//curnum)
            op=s[i]
            curnum=0
    ans=0
    while stack:
        ans+=stack.pop()
    return ans 


if __name__=="__main__":
    s= " 3+5 / 2 "
    print(calculator(s))