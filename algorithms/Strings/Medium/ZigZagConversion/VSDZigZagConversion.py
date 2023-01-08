
def convert(string,numRowstring):
    if numRows == 1 or numRows >= len(string):
        return string

    L = [''] * numRows
    index, step = 0, 1

    for x in string:
        L[index] += x
        if index == 0:
            step = 1
        elif index == numRows -1:
            step = -1
        index += step

    return ''.join(L)
    


if __name__=="__main__":
    string="PAYPALISHIRING"
    numRows=4
    print(convert(string,numRows))
