
#include<bits/stdc++.h>
using namespace std;
class Node{
    public:
        int data;
        Node* next;
        Node* prev;

        Node(){
            data=0;
            next=NULL;
            prev=NULL;
        }
        Node(int val){
            data=val;
            next=NULL;
            prev=NULL;
        }
};

class DoubleLinkedList{
    private:
        Node* head=NULL;
        int length=0;
    
    public:
        

        void insert(int data){
            if(head == NULL){
                head= new Node(data);
                length++;
                return;
            }
            Node* temp=new Node(data);
            length++;
            temp->next=head;
            head->prev=temp;
            head=temp;
            return;

        }

        void del(){
            if(head == NULL) return;
            head=head->next;
            head->prev = NULL;
            length--;
            return;
        }

        void print(){
            Node* temp = head;
            while(temp != NULL){
                cout<<temp->data<<" ";
                temp=temp->next;
            }
            cout<<endl;
        }

        void size(){
            cout<<length<<endl;
        }
};

int main(){
    DoubleLinkedList s;
    s.insert(10);
    s.insert(20);
    s.print();
    s.del();
    s.print();
    s.insert(30);
    s.insert(40);
    s.print();
    s.size();
    return 0;
}