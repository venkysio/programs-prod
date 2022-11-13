# Copyrights to vsdevelopers.io
# For more programs visit vsdevelopers.io
# Python program for finding Minimum spanning tree from given graph
# using prim's algorithm


# Fuction to take user input
def VSDuserinput():
    n=int(input("Enter the number of nodes in graph: "))
    print("Enter the adjacency matrix of graph with space between: ")
    g=[list(map(int,input().split())) for i in range(n)]
    return g,n 





# Function to find MST of given graph
def VSDprims(G,n):
    inf=999999
    visited=[0]*n
    edge_count=0
    visited[0]=True
    cost=0
    while(edge_count<n-1):
        minimum=inf
        x=0
        y=0
        for i in range(n):
            if visited[i]:
                for j in range(n):
                    if ((not visited[j]) and G[i][j]):
                        if minimum > G[i][j]:
                            minimum=G[i][j]
                            x=i
                            y=j
                            
        print("edge pair is ",(x,y)," weight is ",G[x][y])
        cost+=G[x][y]
        visited[y]=True
        edge_count+=1
    print("The total cost of Prim's MST is ",cost)


if __name__=="__main__":
    g,n=VSDuserinput()
    VSDprims(g,n)
