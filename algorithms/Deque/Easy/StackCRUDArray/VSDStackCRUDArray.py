# program to implement stack
class STACK:

    def __init__(self,size):
        self.stack=[]
        self.top=-1
        self.size=size-1

    # push operation on stack     
    def push(self,val):
        self.top+=1
        if self.top <= self.size :
            self.stack.append(val)
        else:
            print("STACK AS OVER-FLOWN")

    # pop operation on stack
    def pop(self):
        if self.top >= 0:
            self.stack.pop(self.top)
            self.top-=1
        else:
            print("STACK AS UNDER-FLOWN")

    # isunderflown function on stack
    def is_underflown(self):
        if self.top == -1:
            print("THE STACK IS UNDER-FLOWN")
        else:
            print("THE STACK IS NOT UNDER-FLOWN")

    # isoverflown function on stack
    def is_overflown(self):
        if self.top > self.size :
            print("THE STACK IS OVER-FLOWN")
        else:
            print("THE STACK IS NOT OVER-FLOWN")

    # display function on stack
    def display(self):
        if self.top == -1:
            print("|| EMPTY ||")
        else:
            for i in range(self.top+1):
                print(f"|| {self.stack[i]} ||")

    # Top function on stack
    def display_top(self):
        print("THE TOP MOST ELEMENT IN STACK IS :",self.stack[self.top])



# Test drive code:

stack = STACK(5)
print("------IS UNDER-FLOWN OPERATION ON STACK---------")
stack.is_underflown()
stack.display()
print()
print("------------PUSH OPERATION ON STACK-------------")
stack.push(10)
print("stack status after push operation")
stack.display()
stack.push(20)
print("stack status after push operation")
stack.display()
stack.push(30)
print("stack status after push operation")
stack.display()
print()
print("----------DISPLAY OPERATION ON STACK-----------")
stack.display()
print()
print("------------pop OPERATION ON STACK-------------")
stack.pop()
print("stack status after pop operation")
stack.display()
stack.pop()
print("stack status after pop operation")
stack.display()
print()
print("------IS OVER-FLOWN OPERATION ON STACK---------")
stack.is_overflown()
stack.display()
print()
print("---------TOP OPERATION ON STACK----------")
stack.display_top()
stack.display()