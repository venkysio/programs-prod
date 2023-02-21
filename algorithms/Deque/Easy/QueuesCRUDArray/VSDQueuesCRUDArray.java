// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for Queue

class Queue{

    int[] queue;
    int front=-1;
    int rear=-1;
    int size;
    Queue(int size){
        queue=new int[size];
        for(int i=0;i<size;i++)queue[i]=-1;
        this.size=size-1;
    }

    boolean enqueue(int data){
        if(this.rear==-1){
            this.queue[0]=data;
            this.front=0;
            this.rear=0;
            System.out.println(data+" inserted into queue");
            return true;
        }
        if(this.rear<this.size){
            this.queue[++this.rear]=data;
            System.out.println(data+" inserted into queue");
            return true;
        }
        System.out.println("Queue overflow");
        return false;

    }
    boolean dequeue(){
        if(this.front==-1){
            System.out.println("Queue underflow");
            return false;
        }
        if(this.front<=this.rear){
            int temp=this.queue[this.front];
            for(int i=this.front+1;i<=this.rear;i++){
                this.queue[i-1]=this.queue[i];
            }
            this.queue[this.rear--] = -1;
            System.out.println(temp+" deleted from queue");
            return true;
        }
        System.out.println("Queue underflow");
        return false;
    }

    void print(){
        if(this.front>=this.rear) return;
        for(int i=this.front;i<=this.rear;i++){
            System.out.print(this.queue[i]+" ");
        }
        System.out.println();
    }

}

public class Main{
    public static void main(String[] args) {
        Queue q =new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.print();
        q.enqueue(20);
    }
}