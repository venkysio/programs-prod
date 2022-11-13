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
void update_val(VSDnode* &head,int val,int replace){
	VSDnode* temp=head;
	while(temp!=NULL){
		if(temp->data == val){
			temp->data=replace;
			return;
		}
		temp=temp->next;
	}
	cout<<"The val is not preasent in linked list"<<endl;
}
void delete_head(VSDnode* &head){
	if(head==NULL){
		cout<<"linked list is empty"<<endl;
	}
	else{
		head=head->next;
	}
}
void delete_tail(VSDnode* &head){
    if(head==NULL){
		cout<<"linked list is empty"<<endl;
	}
	else if(head->next==NULL){
	    head=NULL;
	}
	else{
		VSDnode* temp =head;
		while(temp->next->next!=NULL){
		    temp=temp->next;
		}
		temp->next=NULL;
	}
}
void display(VSDnode* head){
	
	VSDnode* temp=head;
	while(temp!=NULL){
		cout<<temp->data<<"->";
		temp=temp->next;
	}
	cout<<"NULL"<<endl;
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
	cout<<"-----update value by other value-----"<<endl;
	update_val(head,0,2);
	display(head);
	cout<<"-----delete head-----"<<endl;
	delete_head(head);
	display(head);
	cout<<"-----update value by other value-----"<<endl;
	update_val(head,2,0);
	display(head);
	cout<<"-----delete tail-----"<<endl;
	delete_tail(head);
	display(head);

    return 0;
}