

class Node:
    def __init__(self,data):
        self.data=data 
        self.left=self.right=None 

def VSDnodelevelBST(root,data):
    queue=[[root,0]]

    while queue:
        node,level=queue.pop(0)
        if node.data==data:
            print(level)
            break 
        if node.left:
            queue.append([node.left,level+1])
        if node.right:
            queue.append([node.right,level+1])

    else:
        print(-1)


if __name__=="__main__":
    root=Node(50)
    root.left=Node(30)
    root.right=Node(70)
    root.left.left=Node(20)
    root.left.right=Node(40)
    root.right.left=Node(60)
    root.right.right=Node(80)

    VSDnodelevelBST(root,70)



