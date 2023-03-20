
#include <bits/stdc++.h>

std::string tostring(long long n)
{
    if (n == 0)
        return "0";
    std::string ans;
    while (n > 0)
    {
        std::string rem;
        rem += ((n % 10) - '0');
        std::cout<<rem<<std::endl;
        ans = rem + ans;
        n /= 10;
    }
    return ans;
}

std::string fractionToDecimal(int numerator, int denominator)
{

    if (numerator == 0)
        return "0";
    std::string ans="";
    if ((numerator < 0 ^ denominator < 0))
        ans.push_back('-');
    long long num = abs(numerator);
    long long denum = abs(denominator);
    ans = ans+tostring(num/denum);
    num%=denum;
    if(num==0) return ans;

    ans.push_back('.');
    std::map<long long,int> map;
    map[num]=ans.length();

    while(num != 0){
        num *= 10;
        
        ans.push_back('0'+(num / denum));
        num %=denum;
        if(map.find(num) != map.end()){
            int index=map[num];
            
            ans.insert(ans.begin()+index,'(');
            ans.push_back(')');
            return ans;
        }
        else{
            map[num]=ans.length();

        }
    }
    return ans;
}

int main()
{
    int n = 1;
    int d = 2;
    std::cout << fractionToDecimal(n, d);
}