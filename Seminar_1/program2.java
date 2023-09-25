package Seminar_1;

import java.util.Arrays;

public class program2 {
    /*
     * Дан массив nums = [3,2,5,3]
     * и число val = 3.
     * Если в массиве есть числа, равные заданному,
     * нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть
     * отличны от заданного,
     * а остальные - равны ему.
     */
    public static void main(String[] args) {
        int[] nums = { 3, 2, 5, 3};
        int val = 3;
        int[] res = sort(nums, val);
        System.out.println(Arrays.toString(res));
    }

    static int[] sort(int[] nums, int val) {
        int[] res = new int[nums.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                res[j] = nums[i];
                j++;
            }
        }
        return res;
    }
}