class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        self.height=1
class VSDbalancedtree:

    def getheight(self,root):
        if not root:
            return 0
        return root.height
    
    def getbalance(self,root):
        if not root:
            return 0
        return self.getheight(root.left)-self.getheight(root.right)

    def getminvaluenode(self,root):
        if root is None and root.left is None:
            return root
        return self.getminvaluenode(root.left)

    def leftrotate(self,z):
        y=z.right
        t=y.left
        y.left=z
        z.right=t
        z.height=1+max(self.getheight(z.left),self.getheight(z.right))
        y.height=1+max(self.getheight(y.left),self.getheight(y.right))
        return y

    def rightrotate(self,z):
        y=z.left
        t=y.right
        y.right=z
        z.left=t
        z.height=1+max(self.getheight(z.left),self.getheight(z.right))
        y.height=1+max(self.getheight(y.left),self.getheight(y.right))
        return y

    def inorder(self,root):
        if root:
            self.inorder(root.left)
            print(root.data,end="-->")
            self.inorder(root.right)
    
    def insert(self,root,data):
        if not root:
            return Node(data)
        elif data<root.data:
            root.left=self.insert(root.left,data)
        else:
            root.right=self.insert(root.right,data)
        
        root.height=1+max(self.getheight(root.left),self.getheight(root.right))
        balance=self.getbalance(root)
        if balance>1:
            if data<root.left.data:
                return self.rightrotate(root)
            else:
                root.left=self.leftrotate(root.left)
                return self.rightrotate(root)
        if balance<-1:
            if data>root.right.data:
                return self.leftrotate(root)
            else:
                root.right=self.rightrotate(root.right)
                return self.leftrotate(root)
        return root
    
    def delete(self,root,data):
        if root is None:
            return root
        elif data<root.data:
            root.left=self.delete(root.left,data)
        elif data>root.data:
            root.right=self.delete(root.right,data)
        else:
            if root.left is None:
                temp=root.right
                root=None
                return temp
            elif root.right is None:
                temp=root.left
                root=None
                return temp
            temp=self.getminvaluenode(root.right)
            root.data=temp.data
            root.right=self.delete(root.right,temp.data)
        if root is None:
            return root
        root.height=1+max(self.getheight(root.left),self.getheight(root.right))
        balance=self.getbalace(root)
        if balance>1:
            if self.getbalace(root.left)>=0:
                return self.rightrotate(root)
            else:
                root.left=self.leftrotate(root.left)
                return self.rightrotate(root)
        if balance<-1:
            if self.getbalance(root.right)<=0:
                return self.rightrotate(root)
            else:
                root.right=self.rightrotate(root.right)
                return self.leftrotate(root)
        return root
        
arr=[33, 13, 52, 9, 21, 61, 8, 11]
root=None
tree=VSDbalancedtree()
for i in arr:
    root=tree.insert(root,i)
tree.inorder(root)

        