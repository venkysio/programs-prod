
class Node:
    def __init__(self,data):
        self.data=data 
        self.next=None 

class QueueLL:
    def __init__(self):
        self.front=None
        self.rear=None 

    def isempty(self):
        if not self.front and not self.rear:
            return True 
        return False

    def enqueue(self,data):
        if self.rear is None:
            self.rear=Node(data)
            self.front=self.rear 
        else:
            self.rear.next=Node(data)
            self.rear=self.rear.next 

    def dequeue(self):
        if self.front is None:
            return 
        else:
            temp=self.front.data 
            self.front=self.front.next 
            return temp
    
    def traverse(self):
        head=self.front 
        while head:
            print(head.data,end=" ")
            head=head.next 
        print()

queue=QueueLL()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
queue.enqueue(40)
queue.enqueue(50)
queue.enqueue(60)
queue.enqueue(70)

queue.traverse()
queue.dequeue()
queue.dequeue()
queue.dequeue()
queue.traverse()



