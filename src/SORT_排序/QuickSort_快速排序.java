package SORT_排序;

import java.util.Arrays;

public class QuickSort_快速排序 {
    static int nums[] = new int[]{2, 3, 5, 6, 7, 3, 1, 0};

    public static void main(String[] args) {
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums, int start, int end) {
        if (start < end) {
            int key = nums[start];
            int l = start;
            int r = end;

            while (l < r) {
                while (l < r && nums[r] > key) {
                    r--;
                }
                if (l < r) {
                    nums[l++] = nums[r];
                }
                while (l < r && nums[l] < key) {
                    l++;
                }
                if (l < r) {
                    nums[r--] = nums[l];
                }
            }
            nums[l] = key;
            sort(nums, start, l - 1);
            sort(nums, l + 1, end);
        }
    }

}
