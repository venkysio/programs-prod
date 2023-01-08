

def expandFromCenter(string,left,right):
    global maxlength
    global start
    while left>-1 and right<len(string) and string[left]==string[right]:
        left-=1
        right+=1
    if maxlength<right-left-1:
        maxlength=right-left-1
        start=left+1
global maxlength 
maxlength=0

global start
start=0
def longestPalindrome(string):
    global maxlength
    global start
    for i in range(len(string)):
        expandFromCenter(string,i,i)
        expandFromCenter(string,i,i+1)
    return string[start:start+maxlength]


if __name__=="__main__":
    string="badad"
    print(longestPalindrome(string))