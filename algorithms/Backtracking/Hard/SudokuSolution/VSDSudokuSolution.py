
from collections import Counter

board=[
    [".",".","2",".","1",".","6","8","7"],
    ["1",".",".",".","8",".","2","5","4"],
    [".","6",".",".","2",".","9","1","3"],
    ["6","8","5",".","3",".","4","7","9"],
    [".",".",".",".",".","8","1",".","2"],
    ["2",".",".","7",".",".","5",".","8"],
    ["9",".","6","8","7",".","3","4","5"],
    [".",".",".",".","4",".","7",".","6"],
    ["4","7","3",".",".","6","8",".","1"]
]

def validRow(board,row):
    d=Counter(board[row])
    for key,values in d.items():
        if key!="." and values>1:
            return False 
    return True 

def validCol(board,col):
    d=dict()
    for row in range(9):
        if board[row][col]==".":
            continue
        if board[row][col] not in d.keys():
            d[board[row][col]]=1
        else:
            d[board[row][col]]+=1
    for key,value in d.items():
        if value>1:
            return False
    return True 

def validBlock(board,row,col):
    rowBlock=3*(row//3)
    colBlock=3*(col//3)
    d=dict()
    for row in range(rowBlock,rowBlock+3):
        for col in range(colBlock, colBlock+3):
            
            if board[row][col]==".":
                continue 
            if board[row][col] in d.keys():
                d[board[row][col]]+=1
            else:
                d[board[row][col]]=1
    for key,value in d.items():
        if value>1:
            return False 
    return True


def validBoard(board):
    for row in range(len(board)):
        for col in range(len(board[0])):
            if not (validRow(board,row) and validCol(board,col) and validBlock(board,row,col)):
                return False 
    return True 

def printBoard(board):
    print("Sudoku solution....")
    print("\n"+("-"*50)+"\n")
    for row in range(9):
        for col in range(9):
            print(board[row][col],end=" ")
        print()
    print("\n"+("-"*50)+"\n")

def solveSudoku(board,row,col):
    if col>=len(board):
        row+=1
        col=0
    if row>=len(board):
        printBoard(board)
        return True
    if board[row][col]!=".":
        return solveSudoku(board,row,col+1) 
    for i in range(1,10):
        board[row][col]=str(i)

        if validBoard(board) and solveSudoku(board,row,col+1):
            return True
        board[row][col]="."
    return False 

solveSudoku(board,0,0)     
                

