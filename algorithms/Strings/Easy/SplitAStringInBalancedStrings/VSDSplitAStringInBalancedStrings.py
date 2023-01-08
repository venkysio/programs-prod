

def balancedStringSplit( string : str ) -> int :
    check=answer=0
    for char in string:
        if char=="R":
            check+=1
        else:
            check-=1
        if check==0:
            answer+=1
    return answer

input="LLLLRRRR"
print(balancedStringSplit(input))