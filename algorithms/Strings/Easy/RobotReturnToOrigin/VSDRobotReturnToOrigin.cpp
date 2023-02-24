#include <bits/stdc++.h>
using namespace std;
bool VSD_robot_return_origin(string moves) {

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
   
    string moves="UD";
    cout<<VSD_robot_return_origin(moves)<<" ";
    return 0;
}