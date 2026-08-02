import java.util.*;
    
class Node{
    int data;
    Node next;
    
    Node(int x){
        data=x;
        next=null;
    }
}

public class NthNodeFromEndLL {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        Node head=null;
        Node tail=null;
        
        for(int i=0;i<N;i++){
            int y=sc.nextInt();
            
            Node newNode=new Node(y);
            
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }   
        }
        System.out.println(ReverseKNodes(head,K));
    }
        
        static int ReverseKNodes(Node head,int k){
            if(head==null){
                   return -1;
            }
            
            Node first=head;
            Node second=head;

             for(int i=0;i<k;i++){    
                if(first==null){
                   return -1;
                }                
               first=first.next;
             }
                
            while(first!=null){
                first=first.next;
                second=second.next;
            }
            return second.data;
        }
        
  }

