


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
    g =[ [ 0, 2, 0, 6, 0 ],
        [ 2, 0, 3, 8, 5 ],
        [ 0, 3, 0, 0, 7 ],
        [ 6, 8, 0, 0, 9 ],
        [ 0, 5, 7, 9, 0 ] 
    ]
    VSDprims(g,5)
