
def firstUniqChar(string :str)->int:
    hashmap=dict()
    for index in range(len(string)):
        if string[index] in hashmap.keys():
            hashmap[string[index]]+=1
        else:
            hashmap[string[index]]=1
    
    for index in range(len(string)):
        if hashmap[string[index]]==1:
            return index 
    return -1


if __name__=="__main__":
    s="vsdevelopers"
    print(firstUniqChar(s))