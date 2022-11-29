
class Node:
    def __init__(self,data):
        self.data=data
        self.next=None 
    
def printLL(head):
    while head:
        print(head.data,end="-->")
        head=head.next
    print()


def buildLL(arr):
    temp=Node(0)
    head=temp 
    for i in arr:
        temp.next=Node(i)
        temp=temp.next 
    return head.next 




def addTwoNumbers(l1,l2):
    temp=Node(0)
    head=temp
    c=0
    while l1 or l2 or c:
        if l1:
            c+=l1.data
            l1=l1.next
        if l2:
            c+=l2.data
            l2=l2.next
        temp.next=Node(c%10)
        c=c//10
        temp=temp.next
    return head.next



if __name__=="__main__":
    l1=buildLL([2,4,3])
    l2=buildLL([5,6,4])
    ans=addTwoNumbers(l1,l2)
    printLL(ans)