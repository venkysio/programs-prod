//copyrights to venkys.io
//For more prgrams, visit venkys.io
//This program demonstrates the doubly linked list 

#include<bits/stdc++.h>

//Node class, consisting, two pointers, pointing to left node and right node, and the data 
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
                std::cout<<temp->data<<" ";
                temp=temp->next;
            }
            std::cout<<endl;
        }

        void size(){
            std::cout<<length<<endl;
        }
};

//main function responsible fro creating the doubly linked list, inserting two elemement, print, delete, and insert back.
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
