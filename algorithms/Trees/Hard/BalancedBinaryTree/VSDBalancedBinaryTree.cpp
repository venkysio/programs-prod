
#include<bits/stdc++.h>

class Node{
    public:
        int data,height;
        Node* left=NULL;
        Node* right=NULL;
        Node(int data){
            this->data=data;
            height=1;
        }  
};

class BalancedTree{
    public:
        int getHeight(Node* root){
            if(!root) return 0;
            return root->height;
        }

        int getBalance(Node* root){
            if(!root) return 0;
            return getHeight(root->left)-getHeight(root->right);
        }
        Node* getMinValueNode(Node* root){
            if(!root->left) return root;
            return getMinValueNode(root->left);
        }

        Node* leftRotate(Node* z){
            Node* y=z->right;
            Node* t=y->left;
            y->left=z;
            z->right=t;
            z->height=1+std::max(getHeight(z->left),getHeight(z->right));
            y->height=1+std::max(getHeight(y->left),getHeight(y->right));
            return y;
        }

        Node* rightRotate(Node* z){
            Node* y=z->left;
            Node* t=y->right;
            y->right=z;
            z->left=t;
            z->height=1+std::max(getHeight(z->left),getHeight(z->right));
            y->height=1+std::max(getHeight(y->left),getHeight(y->right));
            return y;
        }

    
        
        void inorder(Node* root){
            std::cout<<root<<" ";
            if(!root){
                inorder(root->left);
                std::cout<<root->data<<" ";
                inorder(root->right);
            }
        }
        Node* insert(Node* root,int data){
            if(!root) return new Node(data);
            else if(data<root->data)
                root->left=insert(root->left,data);
            else 
                root->right=insert(root->right,data);
            root->height=1+std::max(getHeight(root->left),getHeight(root->right));
            int balance = getBalance(root);
            if(balance>1){
                if(data<root->left->data)
                    return rightRotate(root);
                else{
                    root->left=leftRotate(root->left);
                    return rightRotate(root);
                }

            }
            if(balance<-1){
                if(data>root->right->data)
                    return leftRotate(root);
                else{
                    root->right=rightRotate(root->right);
                    return leftRotate(root);
                }
            }
            return root;
        }
        Node* deleteNode(Node* root,int data){
            if(!root) return root;
            else if(data<root->data)
                root->left=deleteNode(root->left,data);
            else if(data>root->data)
                root->right=deleteNode(root->right,data);
            else{
                if(!root->left){
                    Node* temp=root->right;
                    root=NULL;
                    return temp;
                }
                else if(root->right==NULL){
                    Node* temp=root->left;
                    root=NULL;
                    return temp;
                }
                Node* temp=getMinValueNode(root->right);
                root->data=temp->data;
                root->right=deleteNode(root->right,temp->data);
            }
            if(!root) return root;
            root->height = 1+std::max(getHeight(root->left),getHeight(root->right));
            int balance = getBalance(root);
            if(balance>1){
                if(getBalance(root->left)>=0)
                    return rightRotate(root);
                else{
                    root->left=leftRotate(root->left);
                    return rightRotate(root);
                }
            }
            if(balance<-1){
                if(getBalance(root->right)<=0)
                    return rightRotate(root);
                else{
                    root->right=rightRotate(root->right);
                    return leftRotate(root);
                }
            }
            return root;
        };
};

int main(){

    int arr[]={33, 13, 52, 9, 21, 61, 8, 11};
    Node* root=NULL;
    BalancedTree tree;
    for(int i:arr){
        root=tree.insert(root,i);
    }

    tree.inorder(root);
    return 0;
}