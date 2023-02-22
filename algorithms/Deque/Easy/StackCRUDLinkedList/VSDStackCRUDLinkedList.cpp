// Copyrights to venkys.io
// For more programs visit venkys.io 
// CPP program for Stack

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

void VSDpush(VSDnode* &head,int val){
	VSDnode* n= new VSDnode(val);
	n->next=head;
	head=n;
}

void VSDpop(VSDnode* &head){
	if(head==NULL){
		cout<<"stack is empty can't pop"<<endl;
	}
	else{
		head=head->next;
	}
}
void VSDtop(VSDnode* &head){
	cout<<"The top of the stack is : "<<head->data<<endl;
}

void VSDdisplay(VSDnode* head){
	
	VSDnode* temp=head;
	while(temp!=NULL){
		cout<<temp->data<<"->";
		temp=temp->next;
	}
	cout<<"NULL"<<endl;
}
int main() {
	cout<<"-----empty stack created-----"<<endl;
	VSDnode* head=NULL;
	cout<<"-----pop operation------"<<endl;
	VSDpop(head);
	cout<<"-----push operation------"<<endl;
	VSDpush(head,1);
	cout<<"-----push operation------"<<endl;
	VSDpush(head,2);
	cout<<"-----top operation------"<<endl;
	VSDtop(head);
	cout<<"-----display operation------"<<endl;
	VSDdisplay(head);
	cout<<"-----pop operation------"<<endl;
	VSDpop(head);
	cout<<"-----display operation------"<<endl;
	VSDdisplay(head);
    return 0;
}