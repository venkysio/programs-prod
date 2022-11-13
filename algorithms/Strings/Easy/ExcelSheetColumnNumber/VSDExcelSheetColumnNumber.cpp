
#include <iostream>
using namespace std;


void VSD_excel_sheet_col_no(string str){
    int len=str.length();
        if(len==0){
			cout<<-1<<endl;
		}
		else{
			int sum=0;
			for(int i=0;i<len;i++){
				sum = (sum*26+ ((int)(str[i])-64));
				
			}
			cout<<sum<<endl;
			
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
    VSD_excel_sheet_col_no(str);
    VSD_test_count--;
    }
	return 0;
	
}