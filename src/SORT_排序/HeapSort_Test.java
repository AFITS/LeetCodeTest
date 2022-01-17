package SORT_排序;

import java.util.Arrays;

public class HeapSort_Test {

    public void heapify(int nums[], int n, int i) {
        int larger = i;
        int lson = 2 * i + 1;
        int rson = 2 * i + 2;

        if (lson < n && nums[larger] < nums[lson]) {
            larger = lson;
        }
        if (rson < n && nums[larger] < nums[rson]) {
            larger = rson;
        }

        if (larger != i) {
            nums = swap(nums, larger, i);
            heapify(nums, n, larger);
        }
    }

    public int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    public void heap_sort(int[] nums) {
        int n = nums.length;
        // 堆化
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // 排序
        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);        // 易错，都是i，前i个堆的排序
        }
    }

    public static int[] nums = {1, 3, 4, 6, 5, 6, 2, 9};

    public static void main(String[] args) {
        HeapSort_Test sort_test = new HeapSort_Test();

        sort_test.heap_sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
