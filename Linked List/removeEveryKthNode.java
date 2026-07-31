public class removeEveryKthNode {
    Node remove(Node head,int k){
        if(head==null || head.next==null) return head;

        if(k==1){
            return null;
        }

        Node curr=head;
        Node prev=null;
        int c=1;
        while(curr!=null){
            if(c==k){
                prev.next=curr.next;
                curr=curr.next;        //ths assignment will make the current 
                c=1;                   //count reset
            }else{
                prev=curr;
                curr=curr.next;
                c++;                   // it will increment the count 
            }
        }
        return head;
    }
}
