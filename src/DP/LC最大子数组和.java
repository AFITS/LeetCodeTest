package DP;

public class LC最大子数组和 {
    public static void main(String[] args) {

    }

    // 方法一：动态规划
    public int maxSubArray(int[] nums) {
        int max = nums[0], pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(max, pre);
        }
        return max;
    }
}
