
#include<bits/stdc++.h>
using namespace std;

class Node{
    public:
        int data;
        Node* next=NULL;

        Node(int val){
            data=val;            
        }

};

void print(Node* head){
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;

    }
    cout<<endl;
}

Node* buildll(vector<int> &arr){
    Node* temp=new Node(0);
    Node* head=temp;
    for(int i=0;i<arr.size();i++){
        temp->next=new Node(arr[i]);
        temp=temp->next;
    }
    return head->next;
}


Node* addTwoNumbers(Node* l1,Node* l2){
    Node* temp=new Node(0);
    Node* head=temp;
    int c=0;

    while(l1!=NULL || l2!=NULL || c!=0){
        if(l1!=NULL){
            c+=l1->data;
            l1=l1->next;
        }
        if(l2!=NULL){
            c+=l2->data;
            l2=l2->next;
        }
        temp->next=new Node(c%10);
        c=c/10;
        temp=temp->next;
    }
    return head->next;
}

int main(){
    vector<int> a1={2,4,3};
    vector<int> a2={5,6,4};
    Node* l1=buildll(a1);
    Node* l2=buildll(a2);
    Node* ans=addTwoNumbers(l1,l2);
    print(ans);
    return 0;
}