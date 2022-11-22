# program to implement queue
class QUEUE:

    def __init__(self,size):
        self.queue=[]
        self.front=-1
        self.back=-1
        self.size=size-1

    # enqueue operation on queue     
    def enqueue(self,val):
        if self.front == -1 :
            self.front+=1
            self.queue.append(val)
            self.back+=1
        elif self.back <= self.size :
            self.queue.append(val)
            self.back+=1
        else:
            print("QUEUE IS OVER-FLOWN")

    # dequeue operation on queue
    def dequeue(self):
        if self.front == self.back :
            self.queue.pop(self.front)
            self.front-=1
            self.back-=1
        elif self.back > self.front and self.back <=self.size:
            self.queue.pop(self.front)
            self.back-=1
        else:
            print("QUEUE AS UNDER-FLOWN")

    # isunderflown function on queue
    def is_underflown(self):
        if self.front < 0 and self.back < 0:
            print("THE QUEUE IS UNDER-FLOWN")
        else:
            print("THE QUEUE IS NOT UNDER-FLOWN")

    # isoverflown function on queue
    def is_overflown(self):
        if self.back > self.size :
            print("THE QUEUE IS OVER-FLOWN")
        else:
            print("THE QUEUE IS NOT OVER-FLOWN")

    # display function on queue
    def display(self):
        if self.front == -1 and self.back ==-1 :
            print("|| EMPTY ||")
        else:
            for i in range(self.back+1):
                print(f"|| {self.queue[i]} |",end="")
            print()

    # display front function on queue
    def display_front(self):
        if self.front == -1 :
            print("|| EMPTY ||")
        else:
            print("THE front MOST ELEMENT IN queue IS :",self.queue[self.front])

    # display back function on queue
    def display_back(self):
        if self.back == -1 :
            print("|| EMPTY ||")
        else:
            print("THE front MOST ELEMENT IN queue IS :",self.queue[self.back])



# Test drive code:

queue = QUEUE(5)
print("------IS UNDER-FLOWN OPERATION ON QUEUE---------")
queue.is_underflown()
queue.display()
print()
print("------------ENQUEUE OPERATION ON QUEUE-------------")
queue.enqueue(10)
print("queue status after enqueue operation")
queue.display()
queue.enqueue(20)
print("queue status after enqueue operation")
queue.display()
queue.enqueue(30)
print("queue status after enqueue operation")
queue.display()
print()
print("--------DISPLAY FRONT OPERATION ON QUEUE---------")
queue.display_front()
queue.display()
print()
print("----------DISPLAY OPERATION ON QUEUE-----------")
queue.display()
print()
print("------------DEQUEUE OPERATION ON QUEUE-------------")
queue.dequeue()
print("queue status after dequeue operation")
queue.display()
queue.dequeue()
print("queue status after dequeue operation")
queue.display()
print()
print("------IS OVER-FLOWN OPERATION ON queue---------")
queue.is_overflown()
queue.display()
print()
print("--------DISPLAY BACK OPERATION ON QUEUE---------")
queue.display_back()
queue.display()