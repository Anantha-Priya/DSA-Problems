public class deletionWtPosition {
    Node deleteNode(Node head,int x){
        Node prev=null;
        Node curr=head;
        int count=1;

        if(x==1){
            return head.next;
        }

        while(curr!=null && count < x){
            prev=curr;
            curr=curr.next;

            count++;
        }

        prev.next=curr.next;

        return head;
    }
}
