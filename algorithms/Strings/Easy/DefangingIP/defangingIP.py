
# replace "." with a given charcter.

input=["1.1.1.1","255.100.50.0"]

character="[.]" 


output=["1[.]1[.]1[.]1","255[.]100[.]50[.]0"]

def solution(input : list,char):
    answers=list()
    for string in input:
        filteredans=defangeIP(string,char)
        answers.append(filteredans)
    if output==answers:
        print("Success")
        print(answers)
    else:
        print("Wrong Answer")

# By using replace function
def defangeIP_sol1(string : str,char) -> str :
    ans=string.replace(".",char)
    return ans

# Detailed approach
def defangeIP(string:str,char) -> str:
    ans=""
    for character in string:
        if character==".":
            ans+=char 
        else:
            ans+=character
    return ans 

if __name__=="__main__":
    solution(input,character)


    