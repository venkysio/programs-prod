
# # # Longest Substring with At Least K Repeating Characters

# # Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k.`

# Example 1:

# Input: s = "aaabb", k = 3
# Output: 3
# Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
# Example 2:

# Input: s = "ababbc", k = 2
# Output: 5
# Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 

# Constraints:

# 1 <= s.length <= 104
# s consists of only lowercase English letters.
# 1 <= k <= 105

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