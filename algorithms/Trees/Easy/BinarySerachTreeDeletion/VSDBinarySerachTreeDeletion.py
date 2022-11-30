

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

def minValue(root):
    temp=root
    while temp.left:
        temp=temp.left
    return temp


def deleteBST(root,data):

    if not root:
        return root
    if data<root.data:
        root.left=deleteBST(root.left,data)
    elif data>root.data:
        root.right=deleteBST(root.right,data)
    else:
        if not root.left:
            return root.right 
        elif not root.right:
            return root.left
        temp=minValue(root.right)
        root.data=temp.data 
        root.right=deleteBST(root.right,temp.data)
    return root

def inorder(root):
    if root:
        inorder(root.left)
        print(root.data)
        inorder(root.right)
    


if __name__=="__main__":
    arr=[50,20,30,70,40,10]
    root=None 
    for i in arr:
        root=insertBST(root,i)
    
    inorder(root)
    root=deleteBST(root,20)
    inorder(root)