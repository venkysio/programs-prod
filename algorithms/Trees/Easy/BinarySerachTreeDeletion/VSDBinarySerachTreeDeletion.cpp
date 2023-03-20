#include<bits/stdc++.h>
#include<iostream>
class Node{
    public:
        int data;
        Node *left=NULL;
        Node *right=NULL;

        Node(int val){
            data=val;
        }
};


Node* insertBST(Node* root,int data){
    if(root==NULL) return new Node(data);
    if(root->data==data) return root;
    else if(data<root->data) root->left=insertBST(root->left,data);
    else root->right=insertBST(root->right,data);
    return root;
}

Node* minValue(Node* root){
    Node* temp = root;
    while(temp->left) temp=temp->left;
    return temp;
}

Node* deleteBST(Node* root,int data){
    if(!root) return root;
    if(data<root->data) root->left=deleteBST(root->left,data);
    else if(data>root->data) root->right=deleteBST(root->right,data);
    else{
        if(!root->left) return root->right;
        else if(!root->right) return root->left;
        Node* temp = minValue(root->right);
        root->data=temp->data;
        root->right = deleteBST(root->right,temp->data);
    }
}

void inorder(Node* root){
    if(root!=NULL){
        inorder(root->left);
        std::cout<<root->data<<" ";
        inorder(root->right);
    }
}

int main(){
    int arr[]={50,20,30,70,40,10};
    Node* root=NULL;
    for(int i=0;i<sizeof(arr)/sizeof(arr[0]);i++){
        root=insertBST(root,arr[i]);
    }
    inorder(root);
    root=deleteBST(root,20);
    std::cout<<std::endl;
    inorder(root);
    return 0;
}