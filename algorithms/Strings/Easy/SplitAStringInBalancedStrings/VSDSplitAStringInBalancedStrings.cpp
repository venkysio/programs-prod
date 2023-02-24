#include <bits/stdc++.h>
using namespace std;
 int VSD_balance_string_split(string str)
{ 
	int ptr=0,VSD=0;
	int Rptr=0,lptr=0;
	while(ptr<str.length()){
		
		if(str[ptr]=='R'){
			Rptr+=1;
		}
		else{
			lptr+=1;
		}
		if(lptr>0 && Rptr>0 && ptr+1<str.length()&&str[ptr+1]=='R'){
			VSD++;
			lptr=0;
			Rptr=0;
		}
		ptr++;
	
		
	}
	return VSD;
  
}



int main() {
   
    string str="RLRRLLRLRL";

	cout<<VSD_balance_string_split(str)<<endl;
  
    return 0;
}

