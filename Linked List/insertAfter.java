//Insert After a Given Node

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertAfter {

    public Node InsertAfter(Node head, int afterData, int newData) {

        Node newNode = new Node(newData);

        Node temp = head;

        // Find the node after which we have to insert
        while (temp != null && temp.data != afterData) {
            temp = temp.next;
        }

        // If the node is not found
        if (temp == null) {
            return head;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}

