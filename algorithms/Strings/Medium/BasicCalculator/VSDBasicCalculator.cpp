#include <bits/stdc++.h>

using namespace std;

int calculator(string s)
{
    stack<int> stack;
    int curnum = 0;
    char op = '+';

    for (int i = 0; i < s.length(); i++)
    {

        if (s[i] >= 48 && s[i] <= 57)
            curnum = curnum * 10 + int(s[i] - 48);

        if (!(s[i] >= 48 && s[i] <= 57 && s[i] != ' ') || i == s.length() - 1)
        {

            if (op == '-')
                stack.push(-curnum);

            else if (op == '+')
                stack.push(curnum);

            else if (op == '*')
            {
                int x = stack.top();
                stack.pop();
                stack.push(curnum * x);
            }

            else if (op == '/')
            {
                int x = stack.top();
                stack.pop();
                if (x < 0)
                    stack.push(-(abs(x) / curnum));
                else
                    stack.push(x / curnum);
            }
            op = s[i];
            curnum = 0;
        }
    }
    int ans = 0;

    while (!stack.empty())
    {
        ans += stack.top();
        stack.pop();
    }
    return ans;
}

int main()
{

    string s = "3+2*2";
    cout << calculator(s);
    return 0;
}