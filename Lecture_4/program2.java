package Lecture_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class program2 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        deque.add(7);
        deque.addFirst(1);
        deque.addLast(2);
       
        System.out.println(deque);
        System.out.println("1: "+ deque.removeLast());
        System.out.println("2: "+deque.removeLast());
        System.out.println("3: "+deque.offerFirst(1));
        System.out.println("4: "+deque.offerLast(2));
        System.out.println("5: "+deque.pollFirst());
        System.out.println("6: "+deque.pollLast());
        System.out.println("7: "+deque.getFirst());
        System.out.println("8: "+deque.getLast());
        System.out.println("9: "+deque.peekFirst());
        System.out.println("10: "+deque.peekLast());
    }
}
