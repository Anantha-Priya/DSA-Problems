import java.util.*;

public class dequeExample {
    public static void main(String[] args){
        // ArrayDeque<Integer> deque=new ArrayDeque<>();
        // deque.offer(65);               // In deafult it insert in last where offer means add.
        // deque.offer(32);
        // deque.offerLast(23);
        // deque.offerFirst(45);
        // deque.poll();                   //removes the first element of deque
        // deque.peek();

        //Priority Queue retrives the smallest number as its priority.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(16);
        pq.add(35);
        pq.offer(8);

    }
}
