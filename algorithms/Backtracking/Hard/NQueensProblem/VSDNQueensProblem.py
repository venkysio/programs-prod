# Copyrights to vsdevelopers.io
# For more programs visit vsdevelopers.io
# Python program for finding Minimum spanning tree from given graph
# using Krushkal's algorithm


# Fuction to take user input
def getBoard(n):
    result=[]
    board=[[0 for i in range(n)] for j in range(n)]
    return board,result
# result=[]


# Function to print board
def printboard(board,n):
    for i in range(n):
        for j in range(n):
            if board[i][j]:
                print("Q",end=" ")
            else:
                print("_",end=" ")
        print()

# Function to check if the given box is safe or not
def isSafe(board,row,col):

    # For same row
    for i in range(col):
        if board[row][i]:
            return False
    
    # For same column
    for i in range(row):
        if board[i][col]:
            return False
    

    # For left upper diagonal
    i=row
    j=col
    while i>=0 and j>=0:
        if board[i][j]:
            return False
        i-=1
        j-=1
    
    # For right upper diagonal
    i=row
    j=col
    while j>=0 and i<len(board):
        if board[i][j]:
            return False
        i+=1
        j-=1
    return True

# Function to solve the board
def VSDsolveboard(board,row,n,res):
    if row==n:
        for i in range(n):
            for j in range(n):
                if board[i][j]==1:
                    res.append(j+1)
                
        return True
    
    for col in range(n):
        if isSafe(board,row,col):
            board[row][col]=1
            if VSDsolveboard(board,row+1,n,res):
                return True
            board[row][col]=0


# The Driver Fuction
if __name__=="__main__":
    n=4
    board,result=getBoard(n)
    VSDsolveboard(board,0,n,result)
    print("-"*30)
    printboard(board,n)
    print("-"*30)
    print("The result is ",*result,sep=" ")