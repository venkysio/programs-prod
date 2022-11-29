

class Node:
    def __init__(self,data):
        self.data=data 
        self.left=self.right=None 



def insertBST(root,data):

    if root is None:
    
        return Node(data)
    if root.data==data:
        return root 
    elif data<root.data:
        root.left=insertBST(root.left,data)
    else:
        root.right=insertBST(root.right,data)
    return root


if __name__=="__main__":
    arr=[50,20,30,70,40,10]
    root=None 
    for i in arr:
        root=insertBST(root,i)
        