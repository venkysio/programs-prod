# program to traverse the graph using DFS
# Function takes graph as a input parameters

def DFS(graph):
    stack=[] # Is used to implement the DFS logic
    visted=[] # Is used to store visited vertices
    first = list(graph.keys())[0]
    stack.append(first)
    while stack:
        visit = stack.pop()
        visted.append(visit)
        for vertix in graph[visit]:
            if vertix not in stack and vertix not in visted:
                stack.append(vertix)
    return visted
    

# Test drive code:
graph={
    0:[1,2],
    1:[2],
    2:[0,3],
    3:[3]

}
print("The DFS traversal of the graph is :",DFS(graph))
