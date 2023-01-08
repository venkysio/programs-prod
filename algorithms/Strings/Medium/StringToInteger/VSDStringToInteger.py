
def check(answer):
    if answer<-2**31:
        return -2**31
    elif answer>=2**31:
        return 2**31-1
    else:
        return answer

def myAtoi(string):
    answer=0
    sign=0
    i=0

    while(i<len(string) and string[i]==" "):
        i+=1
    if i==len(string):
        return answer 
    if string[i]=="+" and sign==0:
        sign=1
        i+=1
    if i==len(string):
        return answer
    if string[i]=="-" and sign==0:
        sign=-1 
        i+=1
    while (i<len(string)):
        if string[i].isdigit():
            answer=answer*10+int(string[i])
            i+=1
        else:
            if sign!=0:
                answer=sign*answer 
            return check(answer)
    if sign!=0:
        answer=sign*answer
    return check(answer)



if __name__=="__main__":
    s="42"
    print(myAtoi(s))
