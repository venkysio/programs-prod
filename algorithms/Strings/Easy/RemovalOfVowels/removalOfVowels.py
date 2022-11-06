input=["daalivardhan","leetcode","geeksforgeeks","vsdevelopers"]
output=["dlvrdhn","ltcd","gksfrgks","vsdvlprs"]

# Return a list of strings after removal of vowels in it.


def solution(input : list ):
    strings=input 
    answers=list()
    for string in strings:
        filteredstring=removeVowels(string)    
        answers.append(filteredstring)
    
    if output==answers:
        print("Success")
        print(answers)
    else:
        print("Wrong Answers")


def removeVowels(string : str) -> str:
    ans=""
    for char in string:
        if char not in "AEIOUaeiou":
            ans+=char 
    return ans

if __name__=="__main__":
    solution(input)
    