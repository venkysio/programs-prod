

def toLowerCase(s: str)-> str:
    ans=""
    for i in s:
        
        if ord(i) in range(65,91):
            ans+=chr(ord(i)+32)
        else:
            ans+=i 
    return ans

string="UpperCase"
print(toLowerCase(string))