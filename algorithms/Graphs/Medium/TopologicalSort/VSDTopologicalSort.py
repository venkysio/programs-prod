

def util(v,graph,visited,stack):
    visited[v]=True 
    for i in graph[v]:
        if visited[i]==False:
            util(i,graph,visited,stack)
    stack.append(v)

def topologicalsort(graph):
    visited=[False]*len(graph)
    stack=[]

    for i in range(len(graph)):
        if visited[i]==False:
            util(i,graph,visited,stack)

    print(stack[::-1])


if __name__=="__main__":

    graph={
        0:[],
        1:[],
        2:[3],
        3:[1],
        4:[0,1],
        5:[0,2]
    }
    
    topologicalsort(graph)