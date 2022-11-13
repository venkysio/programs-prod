class Node:
    def __init__(self,source,destination,weight):
        self.source=source
        self.destination=destination
        self.weight=weight

class VSDGraph:
    def __init__(self,size):
        self.vertices=size
        self.edges=dict()
    def VSDaddEgde(self,source,destination,weight):
        edge=Node(source,destination,weight)
        if source in self.edges.keys():
            self.edges[source].append(edge)
        else:
            self.edges[source]=[edge]
def VSDdijkstra(graph):
    count=graph.vertices
    visited=[False]*count
    distance=[999999]*count
    distance[0]=0
    for i in range(count):
        mindistance=999999
        u=0
        for k in range(count):
            if not visited[k] and distance[k]<mindistance:
                mindistance=distance[k]
                u=k
        visited[u]=True
        lst=graph.edges[u]
        for j in range(len(lst)):
            if ((not visited[lst[j].destination]) and (distance[u]+lst[j].weight<distance[lst[j].destination])):
                distance[lst[j].destination]=distance[u]+lst[j].weight
    for i in range(len(distance)):
        print(f"distance from 0 to {i} is {distance[i]}")
g=VSDGraph(7)
g.VSDaddEgde(0,1,4)
g.VSDaddEgde(1,0,4)
g.VSDaddEgde(0,2,3)
g.VSDaddEgde(2,0,3)
g.VSDaddEgde(0,3,2)
g.VSDaddEgde(3,0,2)
g.VSDaddEgde(1,3,1)
g.VSDaddEgde(3,1,1)
g.VSDaddEgde(1,4,6)
g.VSDaddEgde(4,1,6)
g.VSDaddEgde(2,3,4)
g.VSDaddEgde(3,2,4)
g.VSDaddEgde(3,5,4)
g.VSDaddEgde(5,3,4)
g.VSDaddEgde(4,5,3)
g.VSDaddEgde(5,4,3)
g.VSDaddEgde(4,6,2)
g.VSDaddEgde(6,4,2)
g.VSDaddEgde(5,6,4)
g.VSDaddEgde(6,5,4)
VSDdijkstra(g)
