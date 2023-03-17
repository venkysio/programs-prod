#Copyrights to venkys.io
#For more programs visit venkys.io
#Python program for longest Valid Parentheses

#function to calculate longest valid parentheses
def longest_valid_parentheses(s):
    # Initialize a stack and push a dummy element at index -1
    stack = [-1]
    #Initialize a variable to store the length of the longest valid substring
    max_len = 0

    #Iterate over the string characters using index
    for i in range(len(s)):
        # If the current character is an opening parenthesis, push its index onto the stack
        if s[i] == '(':
            stack.append(i)
        else:
            #If the current character is a closing parenthesis, pop the top element from the stack
            stack.pop()
            #if the stack is not empty, the top element represents the index of the last unmatched opening parenthesis.
            if stack:
                #Update max length if longer valid substring found
                max_len = max(max_len, i - stack[-1])
            else:
                #If stack empty,push the current index to the stack
                stack.append(i)

    # Return the length of the longest valid substring
    return max_len
print(longest_valid_parentheses("()()()"))
