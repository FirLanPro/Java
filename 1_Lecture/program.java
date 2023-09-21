import java.util.Scanner;


public class program {
    public static void main(String[] args) {
        System.out.println("by world");
        short age = 10;
        int salery = 123456;
        System.out.println(age);
        System.out.println(salery);

        System.out.println("---------");
        float e = 2.7f;  // вещественный тип. суффикс а
        double pi = 3.1415; // суффикс D, необязательно.
        System.out.println(e);
        System.out.println(pi);

        System.out.println("---------");
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));

        System.out.println("---------");
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);

        System.out.println("---------");
        String msg = "Hello world";
        System.out.println(msg);

        System.out.println("---------");
        var a = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);

        System.out.println("---------");
        int w = 123;
        System.out.println(Integer.MAX_VALUE);

        System.out.println("---------");
        //String s = "qwer";
        //s.length();
        // s.charAt(1);

        System.out.println("---------");
        int c = 123;
        c++;                     //                          
        System.out.println(c);   // System.out.println(c++);  //System.out.println(++c);
                                 // System.out.println(c)

        System.out.println("---------");
        int ac = 123;
        ac = --ac - ac--;                    // *  ac-- - --ac   ----> 2
        System.out.println(ac);

        System.out.println("---------"); // побитовые операции <<, >>, &, |, ^
        int ad = 18; //10010
        System.out.println(ad >> 1);

        System.out.println("---------");
        String s = "qwew1";
        boolean z = s.length() >=5 && s.charAt(4) =='1';
        System.out.println(z);

        System.out.println("---------");
        int[] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[] {1,2,3,4,5};
        System.out.println(arr.length);
        System.out.println(arr[3]);
        arr[3] = 13;
        System.out.println(arr[3]);

        // int[] arr;  // int brr[];

        System.out.println("---------");
        int[] array[] = new int[3][5];
        for (int[] line : array) {
            for (int item : line) {
                System.out.printf("%d",item);
            }
            System.out.println();
        }

        System.out.println("---------");
        //int[][] array = new int[3][5];
        for (int k = 0; k < array.length; k++) {
            for (int j = 0; j < array[k].length; j++) {
                System.out.printf("%d",array[k][j]);
            }
            System.out.println();
        }

        System.out.println("---------");
        byte p = Byte.parseByte("12"); // byte <= 255
        System.out.println(p);

        System.out.println("---------");
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();


        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);

        System.out.println("---------"); // !!!
        String n = "qwe";
        int m = 123;
        String q = m + n;
        System.out.println(q);

        System.out.println("---------"); //%d целочисленные ; %s строковые ; %c одиночный символ ; %f плавающая точка (%.2f 2 знака после ,) ; %e по формуле ; %x шестнадцатеричные числа
        int l =1, r = 2;
        int h = l + r;
        String res = String.format("%d + %d = %d\n", l, r, h);
        System.out.printf("%d + %d = %d \n", l, r, h);
        System.out.println(res);

        // Область видимости:
        // int b = 111;
        // {
        //     int a = 222;
        //     System.out.println(a + b);
        // }
        // int a = 123;
        // System.out.println(a);

        System.out.println("---------"); 
        sayHi();
        System.out.println(sum(1,3));
        System.out.println(factor(5));

    // ветвление----------
    // if (a>b) {
    //     c=a;
    // }else {
    //     c=b;
    // }

    // int min = a < b ? a : b;

    // оператор выбора-----------
    // switch (mounth) {
    //     case 1:
    //         text = "fefefe";
    //         break;
    //     default:
    //         text = "feddddddfe";
    //         break;
    // }

        System.out.println("---------");
        int value = 321;
        int count = 0;
        while (value !=0) {
            value /= 10;
            count++;
        }
        System.out.println(count);


        System.out.println("---------");
        for (int i = 0; i<10;i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------");
        int [] array2 = new int [] {1,2,3,4,5,6,7,8,9};
        for (int item : array2) {
            System.out.println(item);
        }





    }
    
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }


    static void sayHi() {
        System.out.println("hi");
    }
    static int sum(int a, int b){
        return a+b;
    }
    static double factor (int n) {
        if (n==1) return 1;
        return n * factor(n-1);

    }
    

}