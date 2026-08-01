
class reverseLLInGroup {
    public boolean isPalindrome(Node head) {
        if(head==null){
            return true;
        }
        
        //find mid using slow & fast pointer
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;      //slow is mid Node which is head of second half of LL
            fast=fast.next.next;
        }
        
        //reverse second half of LL from slow pointer
        Node prev=null;
        while(slow!=null){
            Node temp=slow.next;    //Instead of head we use slow which points to head of second half
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        
        Node second=prev;
        Node first=head;
        
        //Compare Corresponding Node data
        while(second!=null){              //since we assign second half end as null from right -> left
            if(first.data!=second.data){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        
        return true;
    }
}

