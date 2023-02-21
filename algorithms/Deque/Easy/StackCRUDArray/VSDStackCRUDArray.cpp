#include<bits/stdc++.h>

using namespace std;

class Stack{

    private:
        int *arr;
        int top=-1;
        int max;
    public:
        Stack(int size){

            arr = new int[size];
            max=size;
        }
        void push(int data){
            if(top==-1){
                arr[0]=data;
                top=0;
                return ;
            }
            if(top>-1 && top<max){
                arr[++top]=data;
                return;
            }
            cout<<"Stack overflow"<<endl;
            return;
        }
        void pop(){
            if(top ==-1){
                cout<<"Empty Stack"<<endl;
                return;
            }
            arr[top--]=0;
        }

        void peek(){
            if(top ==-1) return;
            cout<<arr[top]<<endl;
            return;
        }
        void print(){
            for(int i=0;i<=top;i++){
                cout<<arr[i]<<" ";
            }
            cout<<endl;
            return;
        }
};

int main(){
    Stack s(5);
    s.push(10);
    s.push(20);
    s.peek();
    s.print();
    s.pop();
    s.pop();
    s.push(1);
    s.push(2);
    s.push(3);
    s.print();
    return 0;
}