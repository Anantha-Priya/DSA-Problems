class Queue{
    int arr[];
    int front;
    int rear;
    int size;

    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=rear=-1;
    }

    //Insert
    void enqueue(int data){
        
        if(rear==size-1){
            System.out.println("Queue overflows");
            return;
        }

        //For first Element only
        if(front==-1){
            front=0;
        }

        rear++;
        arr[rear]=data;
    }

    //Remove
    int dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        int x=arr[front];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
            
        }
        rear--;

        if(rear==-1){
            front=-1;
        }
        return x;
    }

    //peek element
    int front(){
        if(front==-1){  //this is empty condition
            System.out.println("Queue is Empty");
        }
        return arr[front];
    }
}


public class queueUsingArray {
    public static void main(String []args){
        Queue q=new Queue(4);

        q.enqueue(20);
        q.enqueue(44);
        q.enqueue(29);
        q.enqueue(37);
        q.enqueue(87);
       
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front: " + q.front());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        

    }
}
