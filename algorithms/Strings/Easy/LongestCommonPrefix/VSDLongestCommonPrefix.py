
def getminstring(strings):
    minstring=strings[0]
    for string in strings:
        if len(string)<len(minstring):
            minstring=string
    return minstring
def longestCommonPrefix(strings : str)->str:
    if len(strings)==1:
        return strings[0]

    answer=""
    minstring=getminstring(strings)
    
    for index in range(len(minstring)):

        char=strings[0][index]

        for j in range(len(strings)):
            if char!=strings[j][index]:
                return answer
        answer+=char 
    return answer 

print(longestCommonPrefix(["flower","flow","flight"]))