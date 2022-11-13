#include <bits/stdc++.h>
using namespace std;
 string VSD_to_lower_case(string str){  
    int ptr=0; 
	string s="";
	while(ptr<str.length()){
		int temp = str[ptr];
		if(temp>=65 && temp<=90){
			char c = temp+32;
			s+=c;
		}
		else{
		    s+=str[ptr];
		}
		ptr+=1;
	}
	return s;
  
}



int main() {
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
    cout<<"enter string ";
    string str;
    cin>>str;
	cout<<VSD_to_lower_case(str)<<endl;
    
    VSD_test_count--;
    }
    return 0;
}
