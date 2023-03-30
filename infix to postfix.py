#Copyrights to venkys.io
#For more programs visit venkys.io
#Python program for Infix to Postfix
# collection of Operators
Operators = set(['+', '-', '*', '/', '(', ')', '^'])
# dictionary having priorities of Operators
Priority = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}
def infixToPostfix(expression):
    # initialization of empty stack
    stack = []
    output = ''
    for character in expression:
        # if an operand append in postfix expression
        if character not in Operators:
            output += character

        # else Operators push into stack
        elif character == '(':
            stack.append('(')
        elif character == ')':
            while stack and stack[-1] != '(':
                output += stack.pop()
            stack.pop()
        # If an operator, determine priority and push onto stack
        else:
            while stack and stack[-1] != '(' and Priority[character] <= Priority[stack[-1]]:
                output += stack.pop()
            stack.append(character)
    # Pop remaining operators from stack and append to output
    while stack:
        output += stack.pop()
    return output

print(infixToPostfix("m*n+(p-q)+r"))
#sample output
#mn*pq-+r+