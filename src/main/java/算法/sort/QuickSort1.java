package 算法.sort;

import java.util.Arrays;

/**
 * @author yingfeng
 * @date 2021/7/7 16:59
 */
public class QuickSort1 {
    private static void sort(int[] arr, int left, int right){
        if (left > right) return;
        int l = left, r = right;
        int temp = arr[l];
        while (l < r){
            while (arr[r] >= temp && l < r) r--;
            while (arr[l] <= temp && l < r) l++;
            if (l < r){
                swap(arr, l, r);
            }
        }
        swap(arr, left, r);
        sort(arr, left, r - 1);
        sort(arr, r + 1, right);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] ints = {1, 9, 3, 2, 6, 5};
        QuickSort1.sort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }
}
