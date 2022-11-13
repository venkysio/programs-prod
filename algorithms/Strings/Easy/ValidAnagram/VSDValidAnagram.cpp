#include <bits/stdc++.h>
using namespace std;

bool VSD_Valid_Anagram(string s, string t) {
    if (s.length() != t.length()) {
        return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
}

int main() {
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
    cout<<"enter  string1   ";
    string str1;
    cin>>str1;
    cout<<"enter string2  ";
    string str2;
    cin>>str2;
    cout<<VSD_Valid_Anagram(str1,str2)<<endl;
    VSD_test_count--;
    }
    return 0;
}
