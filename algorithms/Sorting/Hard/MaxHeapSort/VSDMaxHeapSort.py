
class Node:
    def __init__(self,data):
        self.data=data 
        self.left,self.right=data 

def findheight(root):
    if not root:
        return -1 
    left=findheight(root.left)
    right=findheight(root.right)
    if left<right:
        return left+1 
    return right+1 


def countnode(root):
    left=right=0
    if not root.left:
        left=countnode(root.left)
    if not root.right:
        right=countnode(root.right)
    count=right+left+1 
    return count 

def VSDexpectedCount(height):
    count=0
    while(height>=0):
        count+=2**height 
        height-=1 
    return count 

def VSDbuildHeap(root,data):

    if not root:
        return Node(data)

    elif root.left is not None and root.right is not None:
        leftcount=countnode(root.left)
        rightcount=countnode(root.right)
        height=findheight(root)
        if leftcount < VSDexpectedCount(height)//2:
            VSDbuildHeap(root.left,data)
        elif leftcount==rightcount:
            VSDbuildHeap(root.right,data)
        else:
            VSDbuildHeap(root.right,data)

    elif root.left is None:
        root.left = Node(data)

    elif root.root.right is None:
        root.right=Node(data)

    return root 

def VSDheapify(root):
    
    if not root.left:
        root.left=VSDheapify(root.left)
    if not root.right:
        root.right=VSDheapify(root.right)
    
    if root.left and root.left.data>root.data:
        root.left.data,root.data=root.data,root.left.data 
    
    if root.right and root.right.data>root.data:
        root.right.data,root.data=root.data,root.right.data 
    
    return root 

def VSDchooseNode(root,level,size):
    if not root:
        return 
    if level==0:
        deletecount+=1 
        if deletecount==size//2:
            parent=root 
        if deletecount==size:
            deletenode=root 
            return 

