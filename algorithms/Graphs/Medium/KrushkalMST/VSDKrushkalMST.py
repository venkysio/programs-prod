


# Function to convert adjacency matrix to adjacency list
def graph(g):
    x=[]
    for i in range(len(g)):
        for j in range(len(g[0])):
            if g[i][j]!=0:
                x.append([i,j,g[i][j]])
    return x


# Function to find the parent of given vertex
def find(parent,i):
    if parent[i]==i:
        return i
    return find(parent,parent[i])


# Function to apply union of given two subtrees
def union(parent,rank,x,y):
    xroot=find(parent,x)
    yroot=find(parent,y)
    if rank[xroot]<rank[yroot]:
        parent[xroot]=yroot
    elif rank[xroot]>rank[yroot]:
        parent[yroot]=xroot
    else:
        parent[yroot]=xroot
        rank[xroot]+=1



# Function to find MST of given graph 
def VSDkruskal(graph,n):
        result = []
        i=0
        e = 0
        graph = sorted(graph, key=lambda item: item[2])
        parent = []
        rank = []
        for node in range(n):
            parent.append(node)    
            rank.append(0)
        while e < n - 1:
            u, v, w = graph[i]
            i = i + 1
            x = find(parent, u)
            y = find(parent, v)
            if x != y:
                e = e + 1
                result.append([u, v, w])
                union(parent, rank, x, y)
        cost=0
        print("-"*30)
        print("The Kruskal's MST Graph is :")
        for u, v, weight in result:
            cost+=weight
            print(f"{u} - {v} : {weight}")
        print("The total cost of Krushkal's MST is",cost)


# The Driver Function
if __name__=="__main__":
    n=5
    g =[ [ 0, 2, 0, 6, 0 ],
        [ 2, 0, 3, 8, 5 ],
        [ 0, 3, 0, 0, 7 ],
        [ 6, 8, 0, 0, 9 ],
        [ 0, 5, 7, 9, 0 ] 
    ]   
    x=graph(g)
    VSDkruskal(x,n)
