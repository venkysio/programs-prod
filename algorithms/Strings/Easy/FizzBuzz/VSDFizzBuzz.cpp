#include <bits/stdc++.h>
using namespace std;

 vector<string> VSD_fizz_Buzz(int n) {
        
        vector<string> VSD;
        for(int i=1; i<=n; i++)
        {
            if(i%3 == 0 && i%5 == 0)
                VSD.push_back("FizzBuzz");
            else if(i%3 == 0)
                VSD.push_back("Fizz");
            else if(i%5 == 0)
                VSD.push_back("Buzz");
            else
                VSD.push_back(to_string(i));
        }
        return VSD;
    }

int main() {
	int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
		cout<<"enter a number";
    int n;
    cin>>n;
    cout<<endl;
    vector<string>v=VSD_fizz_Buzz(n);
	for (auto i = v.begin(); i != v.end(); ++i)
        cout << *i << " ";
    VSD_test_count--;
    }
	return 0;
	
}