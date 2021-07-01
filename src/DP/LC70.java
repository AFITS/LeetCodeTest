package DP;

/**
 * LC70：爬楼梯问题
 * 向上走1阶楼梯或者2阶楼梯，n阶楼梯有几种爬楼方式。
 *
 * 1、原问题与子问题：爬1、2、3...n-1、n阶楼梯的方式
 * 2、动态规划状态：第n个台阶上去方式
 * 3、边界状态值：1、2、n
 * 4、状态转移方程：dp[i]=dp[i-1]+dp[i-2]
 */
public class LC70 {

    public static void main(String[] args) {
        System.out.println(lc70(5));
    }

    public static int lc70(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int dp[] = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
