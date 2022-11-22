#linked list program with CRUD operations
class Node:
    
    def __init__(self,val):
        self.data=val
        self.next=None

# single linked list
class SLL:
    
    def __init__(self):
        self.head=None

    # Now 'C' create functions of linked list
        
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
        
    # Now delete functions of linked list
    
    def delete_begin(self):
        if self.head is None:
            return
        else:
            self.head=self.head.next

    def delete_end(self):
        if self.head is None:
            self.delete_begin()
        elif self.head.next is None:
            self.head=None
        temp=self.head
        while temp.next.next :
            temp=temp.next
        temp.next=None

    def delete_pos(self,pos):
        count=0
        temp=self.head
        while temp:
            count+=1
            if count==pos-1:
                break
            else:
                temp=temp.next
        if temp.next :
            temp.next=temp.next.next

    # NOW 'U' update function of linked list

    def update(self,pval,nval):
        if self.head :
            temp=self.head
            while temp :
                if temp.data == pval:
                    temp.data = nval
                    break
                temp=temp.next

     # NOW 'R' remove function of linked list

    def remove(self,val):
        if self.head.data == val:
            self.head = self.head.next
        else:
            temp=self.head
            while temp.next :
                if temp.next.data == val :
                    temp.next = temp.next.next
                    break
                temp=temp.next
                    
 
    # NOW 'D' display function of linked list

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
print("------------DELETION OPERATIONS-------------")
print("Delete begin")
sll.delete_begin()
sll.display()
print("Delete end")
sll.delete_end()
sll.display()
print("Delete position")
sll.delete_pos(2)
sll.display()
print()
print("-------------UPDATE OPERATION--------------")
sll.update(3,2)
sll.display()
sll.update(1,0)
sll.display()
sll.update(2,1)
sll.display()
print()
print("-------------REMOVE OPERATION--------------")
sll.remove(1)
sll.display()
sll.remove(0)
sll.display()
