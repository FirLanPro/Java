// принимала бы произвольный список целых чисел, удаляла бы из него четные числа и выводила список без четных чисел.
package DZ;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class program5 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(removeEvenNumbers(arr));
        
    }

    public static List<Integer> removeEvenNumbers(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(n -> n % 2== 0);
        return list;
    }
    
}


// public static void removeEvenNumbers(Integer[] arr) {
//     ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
//     for (int i = 0; i < ints.size(); i++) {
//         if (ints.get(i) % 2 == 0) {
//             ints.remove(i);
//             i--;
//         }
//     }
//     System.out.println(ints);
// }
