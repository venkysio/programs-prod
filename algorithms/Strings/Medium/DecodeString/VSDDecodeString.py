
def decodeString(string):
    stack=list()
    curNum=0
    curString=''
    for c in string:
        if c=="[":
            stack.append(curString)
            stack.append(curNum)
            curString=''
            curNum=0
        elif c==']':
            num=stack.pop()
            prevString=stack.pop()
            curString=prevString+num*curString
        elif c.isdigit():
            curNum=curNum*10+int(c)
        else:
            curString+=c 
    return curString


if __name__=="__main__":
    string="3[a]2[bc]" 
    print(decodeString(string))