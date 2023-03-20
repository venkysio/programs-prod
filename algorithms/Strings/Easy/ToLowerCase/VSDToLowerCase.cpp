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
    
    string str="UpperCase";   
	cout<<VSD_to_lower_case(str)<<endl;  
    return 0;
}
