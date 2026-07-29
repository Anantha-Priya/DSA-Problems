import java.util.*;
class Node{
    int data;
    Node next;
}
public class insertion {
    public static void main(String[] args) {
        Node head=null;
        Node temp=null;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            if(head==null){
                head=new Node();                //head node is already declared and in this stmt it's simply assigning new node to the existing variable
                head.data=sc.nextInt();
                head.next=null;
                temp=head;
            }
            else{
                Node newNode=new Node();            // new node creation
                newNode.data=sc.nextInt();
                newNode.next=null;
                temp.next=newNode;                 //address of next node is assigned to the previous node
                temp=newNode;                      // And the temp pointer points to the current node
            }
            n--;
        }
        System.out.println("Printing the datas in the linked list");
        temp=head;     // when loop ends and the data need to be print from head node so temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
