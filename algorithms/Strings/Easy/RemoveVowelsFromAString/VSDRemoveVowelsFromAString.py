
def removeVowels(string : str) -> str:
    ans=""
    for char in string:
        if char not in "AEIOUaeiou":
            ans+=char 
    return ans

if __name__=="__main__":
    input="vsdevelopers"
    print(removeVowels(input))
    