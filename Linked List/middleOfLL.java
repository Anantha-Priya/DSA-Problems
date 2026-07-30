// Slow → moves 1 step
// Fast → moves 2 steps
// When Fast reaches the end, Slow is at the middle.

public class middleOfLL {
    int middleData(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
