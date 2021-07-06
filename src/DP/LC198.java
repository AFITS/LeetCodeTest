package DP;

/**
 * LC198 打家劫舍
 * 每个房间都有数量不等的财宝，相邻两个房间盗取则触发警报，不触发警报可以获取多少财宝。
 * 如：5、2、6、3、1、7，最后的结果选5、6、7之和18；
 */
public class LC198 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 3, 1, 7};
        System.out.println(rob(nums));
    }

}
