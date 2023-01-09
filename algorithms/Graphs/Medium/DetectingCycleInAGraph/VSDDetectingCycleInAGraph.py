
graph = [
    [1,2],[0,3],[0],[1]
]

def dfs(node,graph,visited,parent):
    visited[node]=True 
    for neighbour in graph[node]:
        if not visited[neighbour]:
            if dfs(neighbour,graph,visited,node):
                return True 
        elif neighbour!=parent:
            return True 
    return False
            


def isCycle(graph):
    v=len(graph)
    visited=[False for i in range(v)]
    for node in range(v):
        if not visited[node] and dfs(node,graph,visited,-1):
            return True 
    return False

print(isCycle(graph))