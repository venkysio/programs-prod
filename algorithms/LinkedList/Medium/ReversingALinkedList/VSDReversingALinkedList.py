
class Node:
    def __init__(self,data):
        self.data=data 
        self.next=None 

head=Node(10)
head.next=Node(20)
head.next.next=Node(30)
head.next.next.next=Node(40)

def printLL(head):
    while head:
        print(head.data,end="-->")
        head=head.next
    print()

def reverseLinkedList(head):
    temp=None
    while head:
        t=head.next 
        head.next=temp 
        temp=head 
        head=t 
    return temp 
ans=reverseLinkedList(head)
printLL(ans)
