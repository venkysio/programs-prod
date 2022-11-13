#include <bits/stdc++.h>
using namespace std;
string morse_code[26]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
int VSD_UMCW(vector<string>str){
	set<string>VSD;
	for(int ptr=0;ptr<str.size();ptr++){
		string s;
		for(int i=0;i<str[ptr].size();i++){
			s+=morse_code[(int)(str[ptr][i]-'a')];
		}
		VSD.insert(s);
	}
	int result=VSD.size();
	VSD.clear();
	return result;
}



int main() {
	vector<string>str;
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
		cout<<"enter the list of strings "<<endl;
		cout<<"enter no of words in vector ";
		int temp;
		cin>>temp;
		while(temp){
			string s;
			cout<<"enter value ";
			cin>>s;
		str.push_back(s);
		temp--;
		}
	cout<<VSD_UMCW(str)<<endl;
	VSD_test_count--;	
    }
	
}
