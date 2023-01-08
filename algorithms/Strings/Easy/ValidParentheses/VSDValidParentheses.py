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
        
input= "()[]{}"
print(isValidParanthesis(input))