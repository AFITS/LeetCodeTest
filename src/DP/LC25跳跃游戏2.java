package DP;

import java.util.Arrays;

public class LC25跳跃游戏2 {
    public int jump(int[] nums) {
        int length = nums.length;
        if (length == 1) return 0;

        int[] dp = new int[length];
        Arrays.fill(dp,length);
        dp[0] = 0;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (j + nums[j] >= i) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[length-1];
    }


}
