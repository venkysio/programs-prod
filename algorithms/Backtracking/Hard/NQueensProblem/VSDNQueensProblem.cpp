// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for NQeens

#include<bits/stdc++.h>

using namespace std;

bool isSafe(int row,int col,vector<vector<char>> &board){
  for(int j=0;j<board.size();j++){
    if(board[row][j] == 'Q'){
      return false;
    }
  }
  for (int i=0;i<board[0].size();i++){
    if(board[i][col] == 'Q'){
      return false;
    }
  }

  for (int c = col,r=row;c >=0  && r>=0; c--,r--){
      if(board[r][c] == 'Q'){
        return false;
      }
  }

  for(int r=row,c=col;c>=0 && r< board.size();c--,r++){
    if(board[r][c] == 'Q') return false;
  }
  return true;

}

void saveBoard(vector<vector<char>> board,vector<vector<string>> allBoards){
  string row;
  vector<string> newBoard;
  for(int i=0;i<board.size();i++){
    row="";
    for(int j=0;j<board[0].size();j++){
      if(board[i][j] == 'Q'){
        row+='Q';
        cout<<"Q ";
      }
      else{
        row+=".";
        cout<<"_ ";
      }
    }
    cout<<endl;
    newBoard.push_back(row);
  }
  allBoards.push_back(newBoard);
  cout<<"------------------------------"<<endl;
}

void helper(vector<vector<char>> board,vector<vector<string>> allBoards,int col){
  if(col == board.size()){
    saveBoard(board,allBoards);
    return ;
  }
  for(int row=0;row<board.size();row++){
    if(isSafe(row,col,board)){
      board[row][col]='Q';
      helper(board,allBoards,col+1);
      board[row][col]='.';
    }
  }
}

vector<vector<string>> solveQueens(int n){
  vector<vector<string>> allBoards;
  vector<vector<char>> board(n,vector<char>(n,'.'));
  helper(board,allBoards,0);
  return allBoards;

}

int main(){

  int n=4;
  vector<vector<string>> lst = solveQueens(n);
  cout<<"Queen can be placed in chess board by the following code"<<endl;
  return 0;
}