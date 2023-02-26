
#include <bits/stdc++.h>

int numDecodings(std::string &s)
{
    if (s.length() == 0)
        return 0;
    int dp[s.length() + 1]{0};

    dp[0] = 1;
    dp[1] = s[0] == '0' ? 0 : 1;

    for (int i = 2; i <= s.length(); i++)
    {
        int num1 = stoi(s.substr(i - 1, i));
        int num2 = stoi(s.substr(i - 2, i));

        if (0 < num1 && num1 <= 9)
            dp[i] += dp[i - 1];
        if (10 <= num2 && num2 <= 26)
            dp[i] += dp[i - 2];
    }
    return dp[s.length()];
}

int main()
{
    std::string s = "12";
    std::cout << numDecodings(s);
    return 0;
}