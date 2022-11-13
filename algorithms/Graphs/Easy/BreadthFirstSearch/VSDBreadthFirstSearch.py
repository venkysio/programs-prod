# program to traverse the graph using BFS
# Function takes graph as a input parameters

def BFS(graph):
    queue=[] # Is used to implement the DFS logic
    visted=[] # Is used to store visited vertices
    first = list(graph.keys())[0]
    queue.append(first)
    while queue:
        for vertex in graph[queue[0]]:
            if vertex not in visted and vertex not in queue:
                queue.append(vertex)
        visted.append(queue.pop(0))
    return visted
    

# Test drive code:
graph={}
n=int(input("Enter of vertices in the Graph : "))
for i in range(1,n+1):
    vertex=input(f"Enter vertex number {i}: ")
    adjecent=[x for x in input(f"Enter adjecent vertices of {vertex}: ").split()]
    graph[vertex]=adjecent
print("The BFS traversal of the graph is :",BFS(graph))

