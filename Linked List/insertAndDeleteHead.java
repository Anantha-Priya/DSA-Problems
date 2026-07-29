class Node{
    int data;
    Node next;

    Node(int x){
        data=x;
        next=null;
    }
}

public class insertAndDeleteHead {
    static Node insert(Node head,int x){
        Node newNode=new Node(x);
        if(head!=null){
            newNode.next=head; 
        }
        head=newNode;
        return head; 
    }
    static Node delete(Node head){
        head=head.next;       
        return head;
    }
    static void printList(Node head){
        Node curr=head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        int newData=0;

        printList(head);

        Node newHead=insert(head,newData);      // In this we assign the new head in the LL to it so that we could acces in further functions
         
        System.out.println("LL after Inserting the Head Node");
        printList(newHead);

        Node newListAfterDelete=delete(newHead);

        System.out.println("LL after Deleting the Head Node");
        printList(newListAfterDelete);

    }
}
