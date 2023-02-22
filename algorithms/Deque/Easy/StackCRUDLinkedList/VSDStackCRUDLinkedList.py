# // Copyrights to venkys.io
# // For more programs visit venkys.io 
# // Java program for Stack
class Node:
    def __init__(self,data):
        self.data=data 
        self.next=None 

class StackLL:
    def __init__(self):
        self.top=None 

    
    def isempty(self):
        return not self.top 

    def push(self,data):
        if not self.top:
            self.top=Node(data)
        else:
            temp=Node(data)
            temp.next=self.top
            self.top=temp 
    
    def pop(self):
        if self.top:
            x=self.top.data 
            self.top=self.top.next 
            return x
    
    def traverse(self):
        head=self.top
        while head:
            print(head.data,end=" ")
            head=head.next 
        print()
    

stack=StackLL()
stack.push(10)
stack.push(20)
stack.push(30)
stack.traverse()
stack.push(40)
stack.push(50)
stack.push(60)
stack.traverse()
stack.pop()
stack.pop()
stack.pop()
stack.traverse()