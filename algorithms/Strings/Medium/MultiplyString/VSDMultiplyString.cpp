
#include <bits/stdc++.h>

std::string multiply(std::string num1, std::string num2)
{
    int m = num1.length(), n = num2.length();
    int pos[m + n]{0};

    for (int i = m - 1;i>=0;i--){
        for(int j=n-1;j>=0;j--){
            int mul = (num1[i] - '0') * (num2[j]-'0');
            int p1 = i+j, p2 = i+j+1;
            int sum = mul + pos[p2];
            
            pos[p1] += sum/10;
            pos[p2] = (sum) % 10;
        }
    }
    std::string ans = "";
    for(int p :pos) 
        if(!(ans.length() == 0 && p==0))ans+=std::to_string(p);
    
    return ans.length() == 0 ? "0" : ans;
}

int main()
{
    std::string num1 = "123";
    std::string num2 = "456";
    std::cout << multiply(num1, num2);
    return 0;
}