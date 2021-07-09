package 算法.sort;

import java.util.Arrays;

/**
 * @author yingfeng
 * @date 2021/7/7 16:42
 */
public class QuickSort {
    public static void sort(int[] arr, int left, int right) {
        if (left > right) return;
        int l = left, r = right;
        int temp = arr[left];
        while (l < r) {
            while (arr[r] >= temp && l < r) r--;
            while (arr[l] <= temp && l < r) l++;
            if (l < r) {
                swap(arr, l, r);
            }
        }
        swap(arr, left, r);
        sort(arr, left, r - 1);
        sort(arr, r + 1, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 33, 55, 66, 99, 3, 5, 6, 7};
        QuickSort.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
