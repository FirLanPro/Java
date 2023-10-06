package DZ;

import java.util.Scanner;

public class program {
    /*Вычислить n-ое треугольного число(сумма чисел от 1 до n). */
    // public int countNTriangle(int n){
    //     int res = 0;
    //     for (int i = 0; i <= n; i++) {
    //         res +=i;
    //     }
    //     return res;
    // }

    /*фуекция выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке. */
    // for (int i = 1; i < 1000; i++) {
    //     int count = 0;
    //     for (int k = 2; k < i; k++) {
    //         if (i % k == 0) {
    //             count++;
    //         }
    //     }
    //     if (count == 0){
    //         System.out.println(i);
    //     }
    // }

    /*класс, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("ввод : ");
            char op = scanner.next().charAt(0);
            System.out.printf("первое число : ");
            int a = scanner.nextInt();
            System.out.printf("второе число : ");
            int b = scanner.nextInt();
            System.out.printf("результат: ");
            calculator(op, a, b);
        }
        

    }
    static int calculator(char op, int a, int b){
        if (op == '+'){
            int res = a+b;
            return (res);
        } else if (op == '-'){
            int res = a-b;

            return (res);
        }else if (op == '*'){
            int res = a*b;
            return (res);
        }else if (op == '/'){
            int res = a/b;
            return (res);
         }else {
            System.out.println("Некорректный оператор:" );
            return op;
        }
        
    }
    
}

