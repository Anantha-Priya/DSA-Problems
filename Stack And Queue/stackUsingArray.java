//implementing the stack using the Array

class stack{
    int arr[];
    int size;
    int top;

    stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    
    //push
    void push(int x){
        if(size>top+1){
            top++;             //if top=-1 so first increment an then push data
            arr[top]=x;
            System.out.println("pushed"+ x +"to the stack");
        }else{
            System.out.println("Stack Overflow");
        }
    }

    //pop
    int pop(){
        if(top!=-1){
            System.out.println("poped"+ arr[top] +"to the stack");
            int value=arr[top];
            top--;
            return value;
        }else{
            System.out.println("Stack underflow");
            return -1;
        }
    }

    //peek
    int peek(){
        if(top!=-1){
            return arr[top];
        }
        else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    boolean isEmpty(){
        return top==-1;
    }

}
public class stackUsingArray{
    public static void main(String[] args){
        stack st=new stack(4);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop();
        st.peek();
        st.pop();
        st.pop();
        st.pop();
        st.peek();
        st.pop();
        
    }
}