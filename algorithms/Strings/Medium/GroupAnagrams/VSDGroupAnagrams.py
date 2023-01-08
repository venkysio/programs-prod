

def groupAnagrams(strings):

    d=dict()
    for i in strings:
        string="".join(sorted(i))
        if string not in d.keys():
            d[string]=[i]
        else:
            d[string].append(i)
    return list(d.values())

if __name__=="__main__":
    strs = ["eat","tea","tan","ate","nat","bat"]
    print(groupAnagrams(strs))