class Node{
     int data;
     Node next;

     Node(int x){
        this.data=x;
        this.next=null;
     }
}


public class insertBefore {
    static Node insertBeforeData(Node head,int newData,int beforeData){
        Node prev=null;
        Node curr=head;
        Node newNode=new Node(newData);

        while(curr.data!=beforeData && curr!=null){
            prev=curr;
            curr=curr.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;

        return head;
    }
    static void printList(Node head){
         Node temp=head;
         while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
         } 
         System.out.println();
    }
    public static void main(String[] args){

        // Hard coded Linked List
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        
        int newData=6;
        int beforeData=3;

        printList(head);

        Node newHead=insertBeforeData(head,newData,beforeData);

        printList(newHead);
    }
}
