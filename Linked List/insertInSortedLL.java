public class insertInSortedLL {
    Node insert(Node head, int key){
        Node newNode=new Node(key);
        
        //If list is empty need to return the newNode 
        if(head==null){
            return newNode;
        }
        if(key<head.data){
            newNode.next=head;
            head=newNode;
            return head;     //Method returns immediately with the correct head.Or else execution continues
        }
        Node prev=head;
        Node curr=head.next;    //Since head is handle in the past if cond.
        
        while(curr!=null){
            if(key<curr.data){
                newNode.next=curr;
                prev.next=newNode;
                return head;
            }
            //traverse
            prev=curr;
            curr=curr.next;
        }

        //If all conditions fails then only chance is to insert at last
        prev.next=newNode;

        return head;
    }
    
}
