package SORT_排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JZ40最小的k个数 {

    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            quick_sort(0, arr.length - 1, arr);
            return Arrays.copyOf(arr, k);       // 注意自带的方法函数说

        }

        public void quick_sort(int start, int end, int[] nums) {
            if (start < end) {
                int l = start;
                int r = end;
                int key = nums[start];
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
                quick_sort(start, l - 1, nums);
                quick_sort(l + 1, end, nums);
            }
        }
    }
}
