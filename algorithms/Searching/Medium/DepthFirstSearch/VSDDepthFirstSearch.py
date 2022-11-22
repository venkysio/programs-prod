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
graph={}
n=int(input("Enter of vertices in the Graph : "))
for i in range(1,n+1):
    vertex=input(f"Enter vertex number {i}: ")
    adjecent=[x for x in input(f"Enter adjecent vertices of {vertex}: ").split()]
    graph[vertex]=adjecent
print("The DFS traversal of the graph is :",DFS(graph))