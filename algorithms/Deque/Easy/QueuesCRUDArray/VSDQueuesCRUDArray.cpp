// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Queue

#include <bits/stdc++.h>

using namespace std;

class Queue
{
private:
    int front = -1;
    int rear = -1;
    int max;
    int *arr;

public:
    Queue(int size)
    {
        arr = new int[size];
        max = size - 1;
    }

    bool enqueue(int x)
    {
        if (rear == -1)
        {
            arr[0] = x;
            front = 0;
            rear = 0;
            cout << x << " inserted in queue" << endl;
            return true;
        }
        if (rear < max)
        {
            rear++;
            arr[rear] = x;
            cout << x << " inserted in queue" << endl;
            return true;
        }
        cout << "Queue overflow" << endl;
        return false;
    }

    bool dequeue()
    {
        if (front == -1)
        {
            cout << "Queue underflow" << endl;
            return false;
        }

        if (front <= rear)
        {

            cout << arr[front] << " deleted from queue" << endl;
            for (int i = front + 1; i <= rear; i++)
                arr[i - 1] = arr[i];
            arr[rear] = 0;

            rear--;
            return true;
        }
        cout << "Queue underflow" << endl;
        return false;
    }

    void print()
    {
        if (front >= rear)
            return;
        for (int i = front; i <= rear; i++)
            cout << arr[i] << " ";
        cout << endl;
    }
};

int main()
{
    Queue q(5);
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
    q.print();
    return 0;
}