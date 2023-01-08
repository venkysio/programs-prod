
def numDecodings(string):
    if not string:
        return 0
    dp=[0 for x in range(len(string)+1)]

    dp[0]=1
    dp[1]=0 if string[0]=="0" else 1

    for i in range(2,len(string)+1):

        if 0 < int(string[i-1:i]) <= 9:
            dp[i]+=dp[i-1]
        if 10 <= int(string[i-2:i]) <=26:
            dp[i]+=dp[i-2]
    return dp[len(string)]

if __name__=="__main__":
    s="12"
    print(numDecodings(s))