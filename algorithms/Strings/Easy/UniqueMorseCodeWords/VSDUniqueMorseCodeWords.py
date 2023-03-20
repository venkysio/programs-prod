

def uniqueMorseRepresentations(words:list[str])->int:
    morsedict=dict()
    morse=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    j=0
    for i in range(97,97+26):
        morsedict[chr(i)]=morse[j]
        j+=1
    
    lst=set()
    for word in words:
        answer=""
        for char in word:
            answer+=morsedict[char]
        lst.add(answer)
    return len(lst)    

words = ["gin","zen","gig","msg"]
print(uniqueMorseRepresentations(words))
