package SORT_排序;

import java.util.Arrays;

public class MergeSort_归并排序 {

    static int arr[] = new int[]{2, 3, 5, 6, 7, 3, 1, 0};

    public static void main(String[] args) {
        new MergeSort_归并排序().mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int[] temp = new int[right - left + 1];     // 中转数组
        int t = 0;                                  // 数组当前索引

        // 数组合并
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[t++] = arr[i++];
            else
                temp[t++] = arr[j++];
        }
        while (i <= mid) temp[t++] = arr[i++];
        while (j <= right) temp[t++] = arr[j++];

        t = 0;
        while (left <= right) arr[left++] = temp[t++];
    }
}
