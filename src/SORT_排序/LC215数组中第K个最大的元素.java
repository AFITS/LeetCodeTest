package SORT_排序;

import java.util.Arrays;

public class LC215数组中第K个最大的元素 {
    static class Solution {
        public int findKthLargest(int[] nums, int k) {
            nums = heap_sort(nums, nums.length);
            return nums[k-1];
        }

        public int[] heapify(int nums[], int n, int i) {
            int largest = i;
            int lson = 2 * i + 1;
            int rson = 2 * i + 2;

            if (lson < n && nums[largest] > nums[lson]) {
                largest = lson;
            }
            if (rson < n && nums[largest] > nums[rson]) {
                largest = rson;
            }
            if (largest != i) {
                nums = swap(nums, largest, i);
                heapify(nums, n, largest);
            }
            return nums;
        }

        public int[] swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            return nums;
        }

        public int[] heap_sort(int[] nums, int n) {
            for (int i = n / 2 - 1; i >= 0; i--) {
                nums = heapify(nums, n, i);
            }
            for (int i = n - 1; i >= 0; i--) {
                nums = swap(nums, i, 0);
                nums = heapify(nums, i, 0);
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(Arrays.toString(new Solution().heap_sort(nums, nums.length)));
        System.out.println(new Solution().findKthLargest(nums, 4));
    }
}
