#loop in a linked list program 
class Node:
    
    def __init__(self,val):
        self.data=val
        self.next=None

# single linked list
class SLL:
    
    def __init__(self):
        self.head=None

    # Now create functions of linked list
        
    def insert_begin(self,val):
        newnode=Node(val)
        newnode.next=self.head
        self.head=newnode
          
    def insert_end(self,val):
        newnode=Node(val)
        if self.head is None:
            self.head=newnode
        else:
            temp=self.head
            while temp.next:
                temp=temp.next
            temp.next=newnode
            

    def insert_pos(self,val,pos):
        count=0
        temp=self.head
        while temp:
            count+=1
            if count==pos-1:
                break
            else:
                temp=temp.next
        newnode=Node(val)
        newnode.next=temp.next
        temp.next=newnode
        
                
    # Now creating loop by value in linked list
    def create_val_loop(self,val):
        temp=self.head
        while temp.next :
            if temp.next.data == val:
                loop_address = temp.next
            temp=temp.next
        temp.next = loop_address

    # Now creating loop by position in linked list
    def create_pos_loop(self,pos):
        count=0
        temp=self.head
        while temp.next:
            count+=1
            if count == pos-1:
                loop_address = temp.next
            temp=temp.next
        temp.next = loop_address
        
    # Now detecting loop in linked list
    def detect_loop(self):
        slow = self.head
        fast = self.head
        while fast != None and fast.next != None :
            slow = slow.next # single step movement 
            fast = fast.next.next # double step movement 

            if slow == fast :
                print("The cycle is present in the linked list")
                break
        else:
            print("The cycle is not present in the linked list")

    
    # Now removing loop in linked list
    def remove_loop(self):
        slow = self.head
        fast = self.head

        slow = slow.next
        fast = fast.next.next
        
        while slow != fast :
            slow = slow.next
            fast = fast.next.next

        fast=self.head
        while slow.next != fast.next :
            slow = slow.next
            fast = fast.next

        slow.next = None
        
    # NOW display function of linked list

    def display(self):
        temp=self.head
        while temp:
            print(temp.data,end="->")
            temp=temp.next
        print("None")
                

        
# Test drive code:
sll=SLL()
print("------------INSERTION OPERATIONS-------------")
print("Insert begin")
sll.insert_begin(1)
sll.display()
print("Insert begin")
sll.insert_begin(0)
sll.display()
print("Insert end")
sll.insert_end(2)
sll.display()
print("Insert end")
sll.insert_end(4)
sll.display()
print("Insert position")
sll.insert_pos(3,4)
sll.display()
print()
print("------------detecting LOOP -------------")
print("Before cycle creation:")
sll.detect_loop()
print()
print("----Loop creation to the linked list------")
sll.create_pos_loop(3)
print("After cycle creation:")
sll.detect_loop()
print()
print("------------LOOP REMOVAL -------------")
print("Before removal of loop:")
sll.detect_loop()
sll.remove_loop()
print("After removal of loop:")
sll.detect_loop()
sll.display()
