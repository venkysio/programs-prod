
class Node:
    def __init__(self,data):
        self.data=data 
        self.left=self.right=None 



def VSDlevelorder(root):
    queue=[root]
    while queue:
        node=queue.pop(0)
        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)
        print(node.data)




if __name__=="__main__":
    root=Node(10)
    root.left=Node(20)
    root.right=Node(30)
    root.left.left=Node(40)
    root.left.right=Node(50)
    root.right.left=Node(60)
    root.right.right=Node(70)

    VSDlevelorder(root)