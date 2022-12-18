

# # # Multiply Strings

# # Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

# # Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

# Example 1:

# Input: num1 = "2", num2 = "3"
# Output: "6"
# Example 2:

# Input: num1 = "123", num2 = "456"
# Output: "56088"
 

# Constraints:

# 1 <= num1.length, num2.length <= 200
# num1 and num2 consist of digits only.
# Both num1 and num2 do not contain any leading zero, except the number 0 itself.

def multiply(num1,num2):
    res=0
    ans=0

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