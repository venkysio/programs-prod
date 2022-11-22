


class Node:
    def __init__(self,data):
        self.data=data 
        self.next=None 
    



def createlist(llist):
    head=None
    temp=None
    for i in llist:
        if not temp:
            temp=Node(i)
            head=temp
        else:
            temp.next=Node(i)
            temp=temp.next
    return head 

def checkpalindrome(head):
    temp=head
    stack=[]
    while head:
        stack.append(head.data)
        head=head.next 
    
    while temp:        
        if temp.data!=stack.pop():
            return False 
        temp=temp.next
    return True 

if __name__=="__main__":
    llist=[10,20,30,20,10]
    head=createlist(llist)
    print(checkpalindrome(head))
