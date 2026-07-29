public class deleteWtHead {
    public void deleteNode(Node x) {
        //just copying the next node's data and pointing address to the node we wanted to delete
        x.data=x.next.data;
        x.next=x.next.next;
    }
}
