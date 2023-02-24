
#include<bits/stdc++.h>
using namespace std;

class Node{
    public:
        int data;
        Node* next;
        Node(){
            data=0;
            next=NULL;
        }
        Node(int val){
            data=val;
            next=NULL;
        }
};

Node* reverseLinkedList(Node* head){
    Node* temp=NULL;
    while(head){
        Node* t=head->next;
        head->next=temp;
        temp=head;
        head=t;
    }
    return temp;
}

void print(Node* temp){
    
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}


int main(){
    Node* head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(30);
    head->next->next->next=new Node(40);
    Node* temp=reverseLinkedList(head);
    print(temp);
    return 0;
}