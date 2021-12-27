package DP;


import org.testng.annotations.Test;

/**
 * 最长回文字符串
 * 1、原问题与子问题：子字符串也是回文
 * 2、动态规划的状态：
 * 3、边界条件：1、2
 * 4、转义方程：P(i,j) = P(i+1,j-1) & Si = Sj
 */
public class LC5最长回文字符串 {

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.longestPalindrome("babad"));
    }

    // F1:中心扩散方式
    static class Solution1 {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) {
                return "";
            }
            int maxLen = 1;
            int begin = 0;
            for (int i = 0; i < s.length(); i++) {
                int lent1 = expendAroundCenter(s, i, i);                //单中心
                int lent2 = expendAroundCenter(s, i, i + 1);       //双中心
                int curMaxLen = Math.max(lent1, lent2);
                if (curMaxLen > maxLen) {
                    begin = i - (curMaxLen - 1) / 2;
                    maxLen = curMaxLen;
                }
            }
            return s.substring(begin, begin + maxLen);
        }

        public int expendAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
            }
            // 因为都做了++操作，所以为right-left+1-2
            return right - left - 1;
        }
    }


}
