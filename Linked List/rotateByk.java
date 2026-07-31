public class RotateByk {
    public Node rotate(Node head, int k) {
        // handle edge cases
        if(head==null || head.next==null || k==0){
            return head;
        }
        int n=1;
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
            n++;
        }
        ptr.next=head;
        

        k=k%n;           //if k>n then we hndle with this
        
        if(k==0){
           ptr.next=null;   //since we assign ptr.next=head to make it circular
           return head;     //if there is no rotation required k=0,then need to break the cycle to prevent from infinite loop
        }

        Node temp=head;        
        
        int i=1;
        while(i<k){
            temp=temp.next;
            i++;
        }
        
        head=temp.next;
        
        temp.next=null;
        
        return head;
        
    }
}
