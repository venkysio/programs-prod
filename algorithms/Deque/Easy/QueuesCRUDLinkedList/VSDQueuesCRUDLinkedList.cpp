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

void VSDenqueue(VSDnode* &head,int val){
	
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

void VSDdequeue(VSDnode* &head){
	if(head==NULL){
		cout<<"queue is empty can't dequeue"<<endl;
	}
	else{
		head=head->next;
	}
}
void VSDqueue_head(VSDnode* &head){
	cout<<"The head of the queue is : "<<head->data<<endl;
}
void VSDqueue_tail(VSDnode* &head){
	VSDnode* temp=head;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	cout<<"The tail of the queue is : "<<temp->data<<endl;
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
	cout<<"-----empty queue created-----"<<endl;
	VSDnode* head=NULL;
	cout<<"-----dequeue operation------"<<endl;
	VSDdequeue(head);
	cout<<"-----enqueue operation------"<<endl;
	VSDenqueue(head,1);
	cout<<"-----enqueue operation------"<<endl;
	VSDenqueue(head,2);
	cout<<"-----queue head operation------"<<endl;
	VSDqueue_head(head);
	cout<<"-----queue tail operation------"<<endl;
	VSDqueue_tail(head);
	cout<<"-----display operation------"<<endl;
	VSDdisplay(head);
	cout<<"-----dequeue operation------"<<endl;
	VSDdequeue(head);
	cout<<"-----display operation------"<<endl;
	VSDdisplay(head);
    return 0;
}