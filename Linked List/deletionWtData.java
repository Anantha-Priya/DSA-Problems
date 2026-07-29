public class deletionWtData {
    Node deleteNode(Node head,int Data){
        Node prev=null;
        Node curr=head;

        while(curr!=null){
            if(curr.data==Data){
                prev.next=curr.next;
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
