
def lengthOFLongestSubstring(string : str) -> int:

    start=end=ans=0
    hashset=dict()

    while end<len(string):
        if string[end] not in hashset.keys():
            hashset[string[end]]=end
            end+=1
            ans=max(len(hashset),ans)
        else:
            del hashset[string[start]]
            start+=1
    return ans 

if __name__=="__main__":
    s = "abcabcbb"
    print(lengthOFLongestSubstring(s))