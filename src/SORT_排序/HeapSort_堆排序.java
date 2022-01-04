package SORT_排序;

import java.util.Arrays;

public class HeapSort_堆排序 {

    /**
     * 维护堆的性质
     */
    public static int[] heapify(int nums[], int n, int i) {
        int largest = i;
        int lson = 2 * i + 1;
        int rson = 2 * i + 2;

        if (lson < n && nums[largest] < nums[lson]) {   // 构建大顶堆、小顶堆、全看大小于号
            largest = lson;
        }
        if (rson < n && nums[largest] < nums[rson]) {
            largest = rson;
        }
        if (largest != i) {
            swap(nums, largest, i);
            heapify(nums, n, largest);      // 向下递归
        }
        return nums;
    }

    /**
     * 排序
     */
    public static int[] heap_sort(int nums[], int n) {
        // 建堆
        for (int i = n / 2 - 1; i >= 0; i--) {
            nums = heapify(nums, n, i);
        }
        System.out.println(Arrays.toString(nums));
        // 排序
        for (int i = n - 1; i >= 0; i--) {
            nums = swap(nums, i, 0);            // 将堆顶最大值放最后
            nums = heapify(nums, i, 0);         // 维护的元素是堆顶元素，范围是剩余元素
        }
        return nums;
    }

    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 5, 6, 2, 9};
        System.out.println(Arrays.toString(heap_sort(nums, nums.length)));
    }
}
