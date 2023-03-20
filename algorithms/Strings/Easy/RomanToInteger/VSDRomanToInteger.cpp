#include <bits/stdc++.h>

#include <string>
using namespace std;

int romanToInt(string s)
{
    map<string, int> d = {
        {"M", 1000},
        {"CM", 900},
        {"D", 500},
        {"CD", 400},
        {"C", 100},
        {"XC", 90},
        {"L", 50},
        {"XL", 40},
        {"X", 10},
        {"IX", 9},
        {"V", 5},
        {"IV", 4},
        {"I", 1}
    };

    int ans = 0, i = 0;
    string temp;
    int n = s.length();
    while (i < n)
    {
        temp = s[i];

        if (i != n - 1 && (temp == "I" || temp == "X" || temp == "C") && d.find("" + (temp + s[i + 1])) != d.end())
        {
            ans += d[temp + s[i + 1]];
            i += 2;
        }
        else
        {
            ans += d[temp];
            i += 1;
        }
    }
    return ans;
}

int main()
{
    cout << romanToInt("VI");
    return 0;
}