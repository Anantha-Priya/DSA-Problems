import java.util.*;


class  Node{
    int data;
    Node next;
    
    Node(int x){
        data=x;
        next=null;
    }
    
}
public class checkPlaindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        Node head=null;
        Node tail=null;
        
        for(int i=0;i<N;i++){
            int x=sc.nextInt();
            Node newNode=new Node(x);
            
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        int result=isPalindrome(head);
        System.out.println(result);
    }
        static int isPalindrome(Node head){
            if(head==null){
                return 1;
            }
            
            Node first=head;
            
            //find mid
            Node slow=head;
            Node fast=head;
            
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            
            Node prev=null;
            //reverse second half
            while(slow!=null){
                Node temp=slow.next;
                slow.next=prev;
                prev=slow;
                slow=temp;
            }
            
            Node second=prev;
            
            //compare corressponding Nodes
            while(second!=null){
                if(first.data!=second.data){
                    return 0;
                }
                first=first.next;
                second=second.next;
            }
            return 1;
        }
}

