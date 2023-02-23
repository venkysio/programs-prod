# program to traverse the graph using BFS
# Function takes graph as a input parameters

def BFS(graph):
    queue=[] # Is used to implement the BFS logic
    visited=[] # Is used to store visited vertices
    first = list(graph.keys())[0]
    queue.append(first)
    while queue:
        for vertex in graph[queue[0]]:
            if vertex not in visited and vertex not in queue:
                queue.append(vertex)
        visited.append(queue.pop(0))
    return visited
    

# Test drive code:
graph={
    0:[1,2],
    1:[2],
    2:[0,3],
    3:[3]

}
print("The BFS traversal of the graph is :",BFS(graph))