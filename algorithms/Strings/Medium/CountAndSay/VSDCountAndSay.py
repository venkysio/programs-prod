




def util(string):
    res=""
    string+="#"
    count=1
    for i in range(len(string)-1):
        if string[i]==string[i+1]:
            count+=1
        else:
            res+=str(count)+string[i]
    return res

def countAndSay(n):
    start="1"
    for i in range(n-1):
        start=util(start)
    return start


if __name__=="__main__":
    n=4
    print(countAndSay(n))