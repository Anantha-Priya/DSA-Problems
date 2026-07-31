public class reverseLL {
    Node reverseList(Node head) {
        // code here
        if(head.next==null){
            return head;
        }
        
        Node prev=null;
        
        while(head!=null){
            Node temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}
