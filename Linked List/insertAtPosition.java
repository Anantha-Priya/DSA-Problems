// Insert at the given position


class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


public class insertAtPosition {
    public Node insertPos(Node head, int pos, int val) {
    
        Node newNode = new Node(val);
        
        // Insert at the beginning
        if(pos==1){
            newNode.next=head;
            return newNode;
        }
        
        Node temp=head;
        
        // Move to the node before the required position
        for(int i=1;i<pos-1;i++){
           temp=temp.next; 
        }
        
        //Insert the new node
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
}
