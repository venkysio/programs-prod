
def multiply(num1,num2):
    res=0
    ans=""

    for i in range(len(num1)-1,-1,-1):
        x=int(num1[i])
        ans=""
        carry=0
        for j in range(len(num2)-1,-1,-1):
            y=int(num2[j])
            product=((x*y)+carry)
            carry=product//10
            ans+=str(product%10)
        x="0"*(len(num1)-i-1)
        ans=x+ans 
        if carry:
            ans+=str(carry)
        res+=int(ans[::-1])
    return str(res)

if __name__=="__main__":
    num1="123"
    num2="456"
    print(multiply(num1,num2))