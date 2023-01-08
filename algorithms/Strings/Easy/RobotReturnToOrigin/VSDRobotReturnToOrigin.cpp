#include <bits/stdc++.h>
using namespace std;
bool VSD_robote_return_origin(string moves) {

    int x=0;
    int y=0;

    for(int i=0;i<moves.length();i++){
        if(moves[i] == 'U'){
            y++;
        }
        else if(moves[i]=='D'){
            y--;
        }
        else if(moves[i]=='R'){
            x++;
        }
        else{
            x--;
        }
    }

    if(x==0 && y==0){
        return true;
    }
    else{
        return false;
    }

}

int main() {
    int VSD_test_count;
    cout<<"enter no of test case count ";
    cin>>VSD_test_count;
    while(VSD_test_count)
    {
    cout<<"enter string   ";
    string moves;
    cin>>moves;
    cout<<VSD_robote_return_origin(moves)<<endl;
    VSD_test_count--;
    }
    return 0;
}