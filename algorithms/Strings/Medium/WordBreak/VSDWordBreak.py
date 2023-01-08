
def wordBreak(string, words):

    d=[False]*len(string)

    for i in range(len(string)):
        for w in words:

            if w == string[i-len(w)+1:i+1] and (d[i-len(w)] or i-len(w) == -1):
                d[i]=True
            
    print(d)
    return d[-1]

if __name__=="__main__":
    string="applepenapple"
    words=["apple","pen"]
    print(wordBreak(string,words))
