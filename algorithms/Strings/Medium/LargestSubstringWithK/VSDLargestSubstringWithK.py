from collections import Counter,defaultdict

def longestSubstring(string,k):
    d=Counter(string)
    max_nums=len(d)
    n=len(string)
    ans=0

    for num in range(1,max_nums+1):
        counter=defaultdict(int)
        left=0
        for right in range(n):
            counter[string[right]]+=1
            
            while len(counter)>num:
                counter[string[left]]-=1
                if counter[string[left]]==0:
                    del counter[string[left]]
                left+=1
            
            if all(count>=k for key,count in counter.items()):
                ans=max(ans,right-left+1)
    return ans
    
if __name__=="__main__":
    string="ababbc"
    k=2
    print(longestSubstring(string,k))