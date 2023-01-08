

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


s = "3+2*2"
print(calculator(s))