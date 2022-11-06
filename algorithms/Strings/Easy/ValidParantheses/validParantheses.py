
# Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

# An input string is valid if:

# Open brackets must be closed by the same type of brackets.
# Open brackets must be closed in the correct order.
# Every close bracket has a corresponding open bracket of the same type.
 

# Example 1:

# Input: s = "()"
# Output: true
# Example 2:

# Input: s = "()[]{}"
# Output: true
# Example 3:

# Input: s = "(]"
# Output: false
 

# Constraints:

# 1 <= s.length <= 104
# s consists of parentheses only '()[]{}'.

def isValidParanthesis(string:str)->bool:

    stack=list()

    for char in string:
        if char=="(" or char=="{" or char=="[":
            stack.append(char)
        else:
            if not stack:
                return False
            top=stack.pop()
            if char==")" and top!="(":
                return False
            if char=="}" and top!="{":
                return False
            if char=="]" and top!="[":
                return False
    return len(stack)==0
        