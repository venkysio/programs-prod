# # #  Zigzag Conversion

# # The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

# # P   A   H   N
# # A P L S I I G
# # Y   I   R
# # And then read line by line: "PAHNAPLSIIGYIR"

# # Write the code that will take a string and make this conversion given a number of rows:

# Example 1:

# Input: s = "PAYPALISHIRING", numRows = 3
# Output: "PAHNAPLSIIGYIR"
# Example 2:

# Input: s = "PAYPALISHIRING", numRows = 4
# Output: "PINALSIGYAHRPI"
# Explanation:
# P     I    N
# A   L S  I G
# Y A   H R
# P     I
# Example 3:

# Input: s = "A", numRows = 1
# Output: "A"
 

# Constraints:

# 1 <= s.length <= 1000
# s consists of English letters (lower-case and upper-case), ',' and '.'.
# 1 <= numRows <= 1000


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
