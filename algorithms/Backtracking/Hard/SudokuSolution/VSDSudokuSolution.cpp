// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Sudoku


#include<bits/stdc++.h>

using namespace std;

bool isSafe(vector<vector<char>> &board,int row,int col,int num){
  for(int i=1;i<board.size();i++){
    
    if(board[i][col] == (char) (num+'0')) return false;
  }
  for(int j=1;j<board.size();j++){
    if(board[row][j] == (char) (num+'0')) return false;
  }
  int sr=3*(row/3);
  int sc = 3*(col/3);
  for(int i=sr;i<sr+3;i++){
    for(int j=sc;j<sc+3; j++){
      if(board[i][j] == (char) (num+'0')) return false;
    }
  }
  return true;
}

bool helper(vector<vector<char>> &board,int row,int col){
  if(row == board.size()) return true;
  int nrow=0;
  int ncol=0;
  if(col == board.size()-1){
    nrow = row+1;
  }
  else{
    nrow=row;
    ncol=col+1;
  }
  if(board[row][col] != '.'){
    if(helper(board,nrow,ncol)) return true;
  }else{
    for(int i=1;i<=9;i++){
      if(isSafe(board,row,col,i)){
        board[row][col] = (char) (i+'0');
        if(helper(board,nrow,ncol)) return true;
        else board[row][col] = '.';

      }
    }
  }
  return false;
}

void sudokoSol(vector<vector<char>> &board){
  helper(board,0,0);
  for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
      cout<<board[i][j]<<" ";
    }
    cout<<endl;
  }
}

int main(){
  vector<vector<char>> board {
                { '.', '.', '2', '.', '1', '.', '6', '8', '7' },
                { '1', '.', '.', '.', '8', '.', '2', '5', '4' },
                { '.', '6', '.', '.', '2', '.', '9', '1', '3' },
                { '6', '8', '5', '.', '3', '.', '4', '7', '9' },
                { '.', '.', '.', '.', '.', '8', '1', '.', '2' },
                { '2', '.', '.', '7', '.', '.', '5', '.', '8' },
                { '9', '.', '6', '8', '7', '.', '3', '4', '5' },
                { '.', '.', '.', '.', '4', '.', '7', '.', '6' },
                { '4', '7', '3', '.', '.', '6', '8', '.', '1' }
        };
  cout<<"Sudoko after solving: "<<endl;
  sudokoSol(board);
  return 0;
}