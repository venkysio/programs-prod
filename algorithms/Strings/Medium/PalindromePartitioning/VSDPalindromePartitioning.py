
def partition(string):
    dp=[[] for _ in range(len(string)+1)]

    dp[0]=[[]]

    for j in range(1,len(string)+1):
        for i in range(j):
            if string[i:j]==string[i:j][::-1]:
                for each in dp[i]:
                    dp[j].append(each+[string[i:j]])
    return dp[-1]

if __name__=="__main__":
    string="aab"
    print(partition(string))