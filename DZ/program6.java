package DZ;
/*
    Сортирует его по возрастанию и выводит на экран
    Находит минимальное значение в списке и выводит на экран - Minimum is {число}
    Находит максимальное значение в списке и выводит на экран - Maximum is {число}
    Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
 */
import java.util.*;
import java.util.Collections;

public class program6 {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);
        
    }
       
    public static List<Integer> analyzeNumbers(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        
        int sum = 0;
        int num = 0;
        for (int item : list) {
            sum+= item;
            num++;
        }
        System.out.println(list);
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));
        System.out.println("Average is = " + sum/num);
        return list;
    }
}
