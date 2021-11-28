package LCTEST;

import java.sql.Array;
import java.util.Arrays;

/**
 * 5939. 半径为 k 的子数组平均值  128周赛
 * 方法：前缀和+滑动窗口
 *
 * 求半径为 k 的子数组平均值
 * 若不满足，则返回-1
 * 若整除之后为小数，则只保留整数部分
 */
public class W11282 {
    class Solution {
        public int[] getAverages(int[] nums, int k) {
            int[] res = new int[nums.length];
            long[] sum = new long[nums.length];
            Arrays.fill(res, -1);
            // 计算出前i数组之和
            for (int i = 0; i < nums.length; i++) {
                sum[i] += nums[i];
            }
            // 在k~n-k的范围，采用前缀和相减求均数
            for (int i = k; i < nums.length - k; i++) {
                res[i] = (int) ((sum[i + k + 1] - sum[i - k]) / 2 * k + 1);
            }
            return res;
        }
    }
}
