#include <bits/stdc++.h>
using namespace std;


class VSDnode{
	
	public:
	int data;
	VSDnode* next;
	
	VSDnode(int val){
		data=val;
		next=NULL;
}

};

void add_head(VSDnode* &head,int val){
	VSDnode* n= new VSDnode(val);
	n->next=head;
	head=n;
}
void add_tail(VSDnode* &head,int val){
	
	VSDnode* n = new VSDnode(val);
	if(head==NULL){
		head=n;
		return;
	}
	VSDnode* temp = head;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=n;
}

void display(VSDnode* head){
	
	VSDnode* temp=head;
	while(temp!=NULL){
		cout<<temp->data<<"->";
		temp=temp->next;
	}
	cout<<"NULL"<<endl;
}
void max(VSDnode* head){
	VSDnode* temp=head;
	int max=INT_MIN;
	while(temp!=NULL){
		if(temp->data > max){
			max=temp->data;
		}
		temp=temp->next;
	}
	cout<<"The maximum element is "<<max<<endl;
	
}
int main() {
	cout<<"-----empty linked list created-----"<<endl;
	VSDnode* head=NULL;
	cout<<"-----adding at tail-----"<<endl;
	add_tail(head,1);
	display(head);
	cout<<"-----adding at tail-----"<<endl;
	add_tail(head,2);
	display(head);
	cout<<"-----adding at head-----"<<endl;
	add_head(head,0);
	display(head);
	cout<<"-----adding at head-----"<<endl;
	add_head(head,-1);
	display(head);
	max(head);
	

    return 0;
}