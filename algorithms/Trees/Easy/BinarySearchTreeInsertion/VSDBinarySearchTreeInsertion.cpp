#include<bits/stdc++.h>

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
    return 0;
}