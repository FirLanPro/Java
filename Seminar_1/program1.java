package Seminar_1;

public class program1 {
    /*
     * Дан массив двоичных чисел,
     * например [1,1,0,1,1,1],
     * вывести максимальное количество подряд идущих 1.
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        System.out.println(method1(arr));
    }

    static int method1(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (maxCount < count) {
            maxCount = count;
        }
        return maxCount;
    }
}
