
def excelSheetColumnTitleToNumber(string):
    if(len(string)==0):
            print("Empty String")
            return 
    sum=0
    for i in range(len(string)):
          sum = (sum*26 + ord(string[i])-64)
    return sum


string="AA"
print(excelSheetColumnTitleToNumber(string))