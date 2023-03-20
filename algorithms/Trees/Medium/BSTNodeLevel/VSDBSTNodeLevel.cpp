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
int levelOrder(Node* root,int data){
    std::queue<Node*> q;
    std::map<Node*,int> map;
    q.push(root);
    map.insert({root,0});
    while(!q.empty()){
        Node* node=q.front();
        q.pop();
        int level=map[node];
        if(node->data==data) return level;
        if(node->left){
            q.push(node->left);
            map.insert({node->left,level+1});
        }
        if(node->right){
            q.push(node->right);
            map.insert({node->right,level+1});
        }
    }
    return -1;
}

int main(){
    Node* root=new Node(10);
    root->left=new Node(20);
    root->right=new Node(30);
    root->left->left=new Node(40);
    root->left->right=new Node(50);
    root->right->left=new Node(60);
    root->right->right=new Node(70);
    std::cout<<levelOrder(root,70);
    return 0;
}