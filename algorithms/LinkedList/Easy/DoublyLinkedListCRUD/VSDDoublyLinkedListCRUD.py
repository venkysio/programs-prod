#Double linked list program with CRUD operations
class Node:
    
    def __init__(self,val):
        self.prev=None
        self.data=val
        self.next=None

class DLL:

    def __init__(self):
        self.head = None

    # Now 'C' create functions of linked list
        
    def insert_begin(self,val):
        newnode=Node(val)
        if self.head :
            self.head.prev = newnode
            newnode.next = self.head
            self.head = newnode
        else:
            self.head = newnode
        
    def insert_end(self,val):
        newnode=Node(val)
        if self.head is None:
            self.head=newnode
        else:
            temp=self.head
            while temp.next:
                temp=temp.next
            newnode.prev = temp
            temp.next = newnode
            
    def insert_pos(self,val,pos):
        count=0
        temp=self.head
        while temp:
            count+=1
            if count==pos:
                break
            else:
                temp=temp.next
        newnode=Node(val)
        newnode.prev=temp.prev
        newnode.next=temp
        temp.prev.next = newnode
        
    # Now delete functions of linked list
    
    def delete_begin(self):
        if self.head is None:
            return
        else:
            self.head=self.head.next
            self.head.prev = None

    def delete_end(self):
        if self.head is None:
            delete_begin()
        elif self.head.next is None:
            self.head=None
        else:
            temp=self.head
            while temp.next:
                temp=temp.next
            temp.prev.next = None
            
    def delete_pos(self,pos):
        count=0
        temp=self.head
        while temp:
            count+=1
            if count==pos:
                break
            else:
                temp=temp.next
        if temp.next :
            temp.next.prev = temp.prev
            temp.prev.next = temp.next
        else:
            temp.prev.next = None
        

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
            if self.head :
                self.head.prev = None
        else:
            temp=self.head
            while temp.next :
                if temp.data == val :
                    if temp.next :
                        temp.next.prev = temp.prev
                        temp.prev.next = temp.next
                    else:
                        temp.prev.next = None
                    break
                temp=temp.next
                    
    # NOW 'D' display function of linked list

    def display(self):
        temp=self.head
        while temp:
            print(temp.data,end="<->")
            temp=temp.next
        print("None")
        

# Test drive code:
dll=DLL()
print("------------INSERTION OPERATIONS-------------")
print("Insert begin")
dll.insert_begin(1)
dll.display()
print("Insert begin")
dll.insert_begin(0)
dll.display()
print("Insert end")
dll.insert_end(2)
dll.display()
print("Insert end")
dll.insert_end(4)
dll.display()
print("Insert position")
dll.insert_pos(3,4)
dll.display()
print()
print("------------DELETION OPERATIONS-------------")
print("Delete begin")
dll.delete_begin()
dll.display()
print("Delete position")
dll.delete_pos(3)
dll.display()
print("Delete end")
dll.delete_end()
dll.display()
print()
print("-------------UPDATE OPERATION--------------")
dll.update(3,2)
dll.display()
dll.update(1,0)
dll.display()
dll.update(2,1)
dll.display()
print()
print("-------------REMOVE OPERATION--------------")
dll.remove(0)
dll.display()
dll.remove(1)
dll.display()

        
