
def generateParentheses(n):
    stack=list()
    res=list()

    def util(start,end):
        if start==end==n:
            res.append("".join(stack))
        if start<n:
            stack.append("(")
            util(start+1,end)
            stack.pop()
        if end<start:
            stack.append(")")
            util(start,end+1)
            stack.pop()
    
    util(0,0)
    return res

if __name__=="__main__":
    print(generateParentheses(2))