package 算法.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author yingfeng
 * @date 2021/7/9 11:09
 */
@Slf4j
public class QuickSort2 {
    private static void sort(int[] arr, int left, int right) {
        if (left > right) return;
        int l = left, r = right;
        int temp = arr[l];
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
        int[] a = new int[]{1, 6, 2, 63, 5, 6, 99, 5, 4, 3};
        sort(a, 0, a.length - 1);
        log.info(Arrays.toString(a));
    }
}
