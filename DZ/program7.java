package DZ;

import java.util.LinkedList;

public class program7 {
    /* Перевернутый LinkedList */
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");

        revert(ll);

    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        System.out.println(ll);
        LinkedList<Object> ll2 = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            ll2.add(ll.get(i));
        }
        System.out.println(ll2);
        return ll;

    }
}

// LinkedList<Object> reversed = new LinkedList<>();
//         for (Object o : ll) {
//             reversed.addFirst(o);
//         }
//         return reversed;
