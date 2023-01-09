
def excelSheetColumnTitleToNumber(string):
    d=dict()
    for i in range(65,65+26):
        d[chr(i)]=i-64
    ans=0
    j=0
    for i in range(len(string)-1,-1,-1):
        ans+=(d[string[i]])*26**j
        j+=1
    return ans


string="AA"
print(excelSheetColumnTitleToNumber(string))