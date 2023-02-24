
def isAnagram(string1,string2):
    if len(string1)!=len(string2):
        return False
    
    charcount=dict()
    for char in string1:
        if char in charcount.keys():
            charcount[char]+=1
        else:
            charcount[char]=1
    
    for char in string2:
        if char not in charcount or charcount[char]==0:
            return False
        else:
            charcount[char]-=1
    
    for value in charcount.values():
        if value!=0:
            return False
    return True

s = "anagram"
t = "nagaram"
print(isAnagram(s,t))