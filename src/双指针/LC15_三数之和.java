package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 返回的数组不可重复（要排序去重）
 * 时间复杂度降低，要剪枝
 * 转换为两数之和等于目标值！
 */
public class LC15_三数之和 {
    public static void main(String[] args) {
        int nums[] = new int[]{2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4};
        System.out.println(new Solution().threeSum(nums));

    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            if (n < 3) return ans;  //忘记加判断了

            Arrays.sort(nums);
            // 第一层循环设定目标值，n-2减不减都行，用不到
            for (int first = 0; first < n - 2; first++) {
                if (nums[first] > 0) break;         // 在这里加剪枝
                if (first > 0 && nums[first] == nums[first - 1]) continue; // 用while需要再加一个first<n的判断
                // 第二层循环转换为两数之和
                int target = -nums[first];
                int left = first + 1;
                int right = n - 1;
                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        ans.add(Arrays.asList(nums[first], nums[left], nums[right]));
                        left++;
                        right--;
                        // 避免重复，一定要加上left<rigth，数组短超出
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return ans;
        }
    }

}
