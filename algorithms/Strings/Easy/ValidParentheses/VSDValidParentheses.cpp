#include <bits/stdc++.h>
using namespace std;


bool VSD_Valid_Parentheses(string str){
    int len=str.length();
	if(str.size()%2 !=0){
		return false;
	}
	else{
		stack<char>stack_VSD;
		unordered_map<char,char> VSD={{'(',')'},{'[',']'},{'{','}'}};
		for(int i=0;i<str.length();i++){
				if(VSD.find(str[i]) != VSD.end()){
					stack_VSD.push(str[i]);
				}
				else if(str[i]==')' || str[i]=='}' || str[i]==']'){
					if(stack_VSD.empty()){
						return false;
					}
					else{
						if(str[i] == stack_VSD.top()){
							stack_VSD.pop();
						}
						else{
							return false;
						}
						
					}
					
				}
			
		}
		if(stack_VSD.empty()){
			return true;
		}
		else{
			return false;
		}
	}

}
int main() {
	int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
		cout<<"enter a string";
    string str;
    cin>>str;
    cout<<endl;
    cout<<VSD_Valid_Parentheses(str);
    VSD_test_count--;
    }
	return 0;
	
}