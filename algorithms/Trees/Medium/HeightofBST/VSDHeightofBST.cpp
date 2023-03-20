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

int heightBST(Node* root){
    if(!root) return 0;
    return std::max(heightBST(root->left)+1,heightBST(root->right)+1);
}

int main(){
    Node* root=new Node(10);
    root->left=new Node(20);
    root->right=new Node(30);
    root->left->left=new Node(40);
    root->left->right=new Node(50);
    root->right->left=new Node(60);
    root->right->right=new Node(70);
    std::cout<<heightBST(root);
    return 0;
}