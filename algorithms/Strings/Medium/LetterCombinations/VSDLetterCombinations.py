
def letterCombinations(digits):
    
    if len(digits)==0:
        return []
    res=list()
    letters={
        "2":"abc",
        "3":"def",
        "4":"ghi",
        "5":"jkl",
        "6":"mno",
        "7":"pqrs",
        "8":"tuv",
        "9":"wxyz"
        
    }
    def util(index,string):
        if len(string)==len(digits):
            res.append(string)
            return 
        else:
            for char in letters[digits[index]]:
                util(index+1,string+char)
        
    
    util(0,"")
    return res 

if __name__=="__main__":
    digits = "23"
    print(letterCombinations(digits))
