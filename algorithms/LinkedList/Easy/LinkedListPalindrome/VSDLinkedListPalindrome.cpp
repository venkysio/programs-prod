#include <iostream>
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
VSDnode* reverse(VSDnode* head){
	VSDnode* prev=NULL;
	VSDnode* curr=head;
	
	while(curr){
		VSDnode* next=curr->next;
		curr->next=prev;
		prev=curr;
		curr=next;
	}
	return prev;
}
void is_palindrome(VSDnode* head){
	VSDnode* new_head=reverse(head);
	VSDnode* temp1=head;
	VSDnode* temp2=new_head;
	while(temp1){
		if(temp1->data != temp2->data){
			cout<<"is not a palindrome"<<endl;
			return;
		}
		temp1=temp1->next;
		temp2=temp2->next;
	}
	cout<<"is a palindrome"<<endl;
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
	add_head(head,2);
	display(head);
	is_palindrome(head);
	cout<<"-----adding at head-----"<<endl;
	add_head(head,1);
	is_palindrome(head);
	
	

    return 0;
}