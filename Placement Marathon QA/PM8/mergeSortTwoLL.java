import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class mergeSortTwoLL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First linked list
        int N = sc.nextInt();

        Node head1 = null;
        Node tail1 = null;

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            Node newNode = new Node(x);

            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // Second linked list
        int M = sc.nextInt();

        Node head2 = null;
        Node tail2 = null;

        for (int i = 0; i < M; i++) {

            int x = sc.nextInt();
            Node newNode = new Node(x);

            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        // Sort both lists
        head1 = sort(head1);
        head2 = sort(head2);

        // Merge
        Node result = merge(head1, head2);

        // Print
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    // Sort linked list
    static Node sort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;

        while (current != null) {

            Node min = current;
            Node temp = current.next;

            while (temp != null) {

                if (temp.data < min.data) {
                    min = temp;
                }

                temp = temp.next;
            }

            int value = current.data;
            current.data = min.data;
            min.data = value;

            current = current.next;
        }

        return head;
    }

    // Merge two sorted lists
    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return dummy.next;
    }
}

