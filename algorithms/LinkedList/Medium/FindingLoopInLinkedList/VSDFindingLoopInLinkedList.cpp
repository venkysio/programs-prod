#include <iostream>
using namespace std;
// DETECTING CYCLE USING SLOW AND FAST POINTER SHIFT ALGORITHM

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
void create_cycle_pos(VSDnode* &head,int pos){
	VSDnode* temp=head;
	int len=1;
	VSDnode* ptr;
	while(temp->next!=NULL){
		if(len==pos){
			ptr=temp;
		}
		temp=temp->next;
		pos++;
	}
	temp->next=ptr;	
}
void detect_cycle(VSDnode* &head){
	VSDnode* slow=head;
	VSDnode* fast=head;
	while(fast!=NULL && fast->next!=NULL){
		   slow=slow->next;
		   fast=fast->next->next;
		
		   if(fast==slow){
			   cout<<"cycle present in the linked list"<<endl;
			   return;
		   }
	}
	   cout<<"cycle not present in the linked list"<<endl;

}
void remove_cycle(VSDnode* &head){
    VSDnode* slow=head;
	VSDnode* fast=head;
	
	do{
	    slow=slow->next;
	    fast=fast->next->next;
	}while(slow!=fast);
	fast=head;
	while(slow->next!=fast->next){
	    slow=slow->next;
	    fast=fast->next;
	}
	slow->next=NULL;
    
}
void display(VSDnode* head){
	VSDnode* temp=head;
	while(temp!=NULL){
		cout<<temp->data<<"->";
		temp=temp->next;
	}
	cout<<"NULL"<<endl;
}
int main(){
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
	cout<<"-----cycle detection --------"<<endl;
	detect_cycle(head);
	cout<<"-----cycle creation-----"<<endl;
	create_cycle_pos(head,1);
	cout<<"-----cycle detection --------"<<endl;
	detect_cycle(head);
	cout<<"-----remove cycle --------"<<endl;
	remove_cycle(head);
	cout<<"-----cycle detection --------"<<endl;
	detect_cycle(head);

    return 0;
}